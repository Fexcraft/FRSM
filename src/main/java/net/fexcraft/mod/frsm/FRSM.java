package net.fexcraft.mod.frsm;

import java.util.List;

import javax.annotation.Nullable;

import net.fexcraft.lib.mc.registry.FCLRegistry;
import net.fexcraft.lib.mc.registry.FCLRegistry.AutoRegisterer;
import net.fexcraft.mod.frsm.blocks.clock.ClockBaseTileEntity;
import net.fexcraft.mod.frsm.guis.GuiHandler;
import net.fexcraft.mod.frsm.items.IronSaw;
import net.fexcraft.mod.frsm.items.PaintSet;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.fvtm.data.addon.AddonClass;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@AddonClass(registryname = "fvtm:frsm")
@Mod(modid = FRSM.MODID, name = FRSM.NAME, version = FRSM.VERSION, acceptedMinecraftVersions = "*", updateJSON = "http://fexcraft.net/minecraft/fcl/request?mode=getForgeUpdateJson&modid=frsm", dependencies = "required-after:fcl;required-after:fvtm")
public class FRSM {
	
	@Mod.Instance(FRSM.MODID)
	private static FRSM instance;

    public static final String NAME = "Fex's Random Stuff Mod";
    public static final String MODID = "frsm";
	public static final String PREFIX = "&0[&6FRSM&0]&7";
	public static final String VERSION = "5.0.0";
	public static final String VNOTE = "Generic Update";
	public static FCLRegistry.AutoRegisterer AUTOREG;
	public static boolean COOKIES_IN_GRASS;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    COOKIES_IN_GRASS = config.getBoolean("cookies_in_grass", "Generator", true, "Grass Dropping randomly cookies when breaking it");
	    config.save();
	    AUTOREG = new FCLRegistry.AutoRegisterer(MODID);
		if(COOKIES_IN_GRASS == true){
			MinecraftForge.addGrassSeed(new ItemStack(Items.WHEAT), 1);
			MinecraftForge.addGrassSeed(new ItemStack(FCLRegistry.getItem("frsm:chocolatecookie")), 2);
		}
		//
		AUTOREG.addItem("brush", new Item().setMaxStackSize(6).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("cup", new Item().setMaxStackSize(6).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("tilesempty", new Item(){
			@Override
			public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced){
				tooltip.add("Used to craft different types of Tiles");
			}
		}.setMaxStackSize(64).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("jar", new Item().setMaxStackSize(16).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("keyboard", new Item().setMaxStackSize(32).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("laptopmainboard", new Item().setMaxStackSize(8).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("nesr", new Item().setMaxStackSize(64).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("planks_oak", new Item(){
			@Override public int getItemBurnTime(ItemStack stack){ return 75; }
		}.setMaxStackSize(64).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("paintbucket", new Item(){
			@Override
		    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list){
				if(tab != FRSMTabs.MATERIALS) return; for(int i = 0; i < 16; i++) list.add(new ItemStack(this, 1, i));
		    }
		}.setMaxStackSize(1).setCreativeTab(FRSMTabs.MATERIALS), 16, null);
		AUTOREG.addItem("pcmainboard", new Item().setMaxStackSize(8).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("prozessor", new Item().setMaxStackSize(32).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("prozessor2", new Item().setMaxStackSize(32).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("prozessor4", new Item().setMaxStackSize(32).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("redstoneinput", new Item().setMaxStackSize(32).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("stonemug", new Item().setMaxStackSize(4).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("tvcontroller", new Item().setMaxStackSize(16).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("tvscreenlarge", new Item().setMaxStackSize(2).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("tvscreenmedium", new Item().setMaxStackSize(2).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("tvscreensmall", new Item().setMaxStackSize(4).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		AUTOREG.addItem("upgradekit", new Item().setMaxStackSize(16).setCreativeTab(FRSMTabs.MATERIALS), 0, null);
		//
		AUTOREG.addItem("ironsaw", new IronSaw(), 0, null);
		PaintSet.register();
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event){
		GameRegistry.registerTileEntity(ClockBaseTileEntity.class, new ResourceLocation("frsm:clock_tileentity"));
		MinecraftForge.addGrassSeed(new ItemStack(FCLRegistry.getItem("frsm:tomatoseeds")), 1);
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
		return AUTOREG;
	}
	
}