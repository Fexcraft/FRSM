package net.fexcraft.mod.frsm;

import net.fexcraft.mod.frsm.blocks.clock.ClockBaseTileEntity;
import net.fexcraft.mod.frsm.guis.GuiHandler;
import net.fexcraft.mod.frsm.items.tools.PaintSet;
import net.fexcraft.mod.frsm.util.*;
import net.fexcraft.mod.lib.util.registry.RegistryUtil;
import net.fexcraft.mod.lib.util.registry.RegistryUtil.AutoRegisterer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = FI.MODID, name = FI.NAME, version = FRSM.version, acceptedMinecraftVersions = "*", updateJSON = "http://fexcraft.net/minecraft/fcl/request?mode=getForgeUpdateJson&modid=frsm", dependencies = "required-after:fcl")
public class FRSM{
	
	public static final String version = "4.0.25"; 
	public static final String vnote = "Clocks.";
	
	@Mod.Instance(FI.MODID)
	private static FRSM instance;
	
	public static boolean conf1, conf2, conf3, conf4, conf5;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    conf1       = config.getBoolean("robo_crafting", "###[> RoboStuff <]###", true, "Robo Crafting Recipes");
	    conf2       = config.getBoolean("random_cookies_from_grass", "###{> Generator <]###", true, "Grass Dropping randomly cookies when breaking it");
	    conf3       = config.getBoolean("generate_stone_light_box", "###{> Generator <]###", true, "This function is unavaible actually.");
	    conf4       = config.getBoolean("enable_update_checker", "###{> Other <]###", true, "Selfexplaining.");
	    conf5       = config.getBoolean("robo_entities", "###[> RoboStuff <]###", true, "Should FRSM robots be enabled?");
	    config.save();
	    
	    RegistryUtil.newAutoRegistry(FI.MODID);
	    RegistryUtil.registerEntitiesOf(FI.MODID);
	    PaintSet.register();
	    
		if(conf2 == true){
			MinecraftForge.addGrassSeed(new ItemStack(Items.WHEAT), 1);
			MinecraftForge.addGrassSeed(new ItemStack(RegistryUtil.getItem("frsm:chocolatecookie")), 2);
		}
		
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event){
		GameRegistry.registerTileEntity(ClockBaseTileEntity.class, "frsm:clock_tileentity");
		MinecraftForge.addGrassSeed(new ItemStack(RegistryUtil.getItem("frsm:tomatoseeds")), 1);
		
		Data.getDataFromServer();
		MinecraftForge.EVENT_BUS.register(new UpdateHandler.EventHandler());
		UpdateHandler.load();
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}
	
	@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
		//
    }
	
	public static FRSM getInstance(){
		return instance;
	}

	public static final AutoRegisterer getAutoRegisterer(){
		return RegistryUtil.get(FI.MODID);
	}
	
}