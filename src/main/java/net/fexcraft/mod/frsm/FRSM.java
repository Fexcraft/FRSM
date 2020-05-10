package net.fexcraft.mod.frsm;

import java.util.List;

import javax.annotation.Nullable;

import net.fexcraft.lib.mc.registry.FCLRegistry;
import net.fexcraft.lib.mc.registry.FCLRegistry.AutoRegisterer;
import net.fexcraft.mod.frsm.blocks.asphalt.Asphalt;
import net.fexcraft.mod.frsm.blocks.asphalt.Asphalt2;
import net.fexcraft.mod.frsm.blocks.asphalt.Asphalt2Slab;
import net.fexcraft.mod.frsm.blocks.asphalt.AsphaltFull;
import net.fexcraft.mod.frsm.blocks.asphalt.AsphaltSlab;
import net.fexcraft.mod.frsm.blocks.clock.ClockBaseTileEntity;
import net.fexcraft.mod.frsm.guis.GuiHandler;
import net.fexcraft.mod.frsm.items.IronSaw;
import net.fexcraft.mod.frsm.items.PaintSet;
import net.fexcraft.mod.frsm.util.Data;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.UpdateHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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

@Mod(modid = FRSM.MODID, name = FRSM.NAME, version = FRSM.VERSION, acceptedMinecraftVersions = "*", updateJSON = "http://fexcraft.net/minecraft/fcl/request?mode=getForgeUpdateJson&modid=frsm", dependencies = "required-after:fcl")
public class FRSM {
	
	@Mod.Instance(FRSM.MODID)
	private static FRSM instance;

    public static final String NAME = "Fex's Random Stuff Mod";
    public static final String MODID = "frsm";
	public static final String PREFIX = "&0[&6FRSM&0]&7";
	public static final String VERSION = "4.4.0";
	public static final String VNOTE = "Generic Update";
	public static FCLRegistry.AutoRegisterer AUTOREG;
	//Config
	public static boolean COOKIES_IN_GRASS, UPDATE_CHECK, ASPHALT;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    //conf1       = config.getBoolean("robo_crafting", "###[> RoboStuff <]###", true, "Robo Crafting Recipes");
	    COOKIES_IN_GRASS = config.getBoolean("cookies_in_grass", "Generator", true, "Grass Dropping randomly cookies when breaking it");
	    //conf3       = config.getBoolean("generate_stone_light_box", "###{> Generator <]###", true, "This function is unavaible actually.");
	    UPDATE_CHECK = config.getBoolean("enable_update_checker", "General", true, "Self-explaining.");
	    //conf5       = config.getBoolean("robo_entities", "###[> RoboStuff <]###", true, "Should FRSM robots be enabled?");
	    ASPHALT = config.getBoolean("enable_asphalt", "General", true, "If Asphalt Blocks should be enabled.");
	    config.save();
	    
	    AUTOREG = new FCLRegistry.AutoRegisterer(MODID);
	    //RegistryUtil.registerEntitiesOf(MODID);
	    if(ASPHALT){
	    	AUTOREG.addBlock("asphalt", new Asphalt(), null, 0, null);
	    	AUTOREG.addBlock("asphalt2", new Asphalt2(), null, 0, null);
	    	AUTOREG.addBlock("asphalt2Slab", new Asphalt2Slab(), null, 0, null);
	    	AUTOREG.addBlock("asphaltFull", new AsphaltFull(), null, 0, null);
	    	AUTOREG.addBlock("asphaltSlab", new AsphaltSlab(), null, 0, null);
	    }
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
		AUTOREG.addItem("bacon", new ItemFood(6, 0.6F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("baconraw", new ItemFood(2, 0.4F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("cheese", new ItemFood(2, 0.4F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("cheesepie", new ItemFood(10, 1F, true).setMaxStackSize(8).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("cheesewhite", new ItemFood(2, 0.4F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("chocolatebar", new ItemFood(4, 0.4F, false){
			@Override
			protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.PAPER, 1, 0));
			}
		}.setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("chocolatebarwhite", new ItemFood(4, 0.4F, false){
			@Override
			protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.PAPER, 1, 0));
			}
		}.setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("chocolatecookie", new ItemFood(4, 0.4F, false).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("chocolatemilk", new ItemFood(4, 0.4F, true){
			@Override
			protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET, 1, 0));
			}
		}.setMaxStackSize(1).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("cookedegg", new ItemFood(4, 0.4F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("cupwithcacao", new ItemFood(4, 0.4F, false){
			@Override
			public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced){
				tooltip.add("Refreshing cacao drink.");
			}
			@Override
			protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(6), 360));
				player.inventory.addItemStackToInventory(new ItemStack(FCLRegistry.getItem("frsm:cup"), 1, 0));
			}
		}.setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("donut", new ItemFood(6, 0.6F, false).setMaxStackSize(32).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("hamburger", new ItemFood(9, 0.9F, true){
			@Override
			public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced){
				tooltip.add("Fast food, fastly programmed.");
			}
		}.setMaxStackSize(4).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("pizza", new ItemFood(10, 1F, true){
			@Override
			public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced){
				tooltip.add("Default.");
			}
		}.setMaxStackSize(1).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("potatochipsbag", new ItemFood(4, 0.4F, false){
			@Override
			protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.PAPER, 1, 0));
			}
		}.setMaxStackSize(60).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("potatochipscheese", new ItemFood(4, 0.4F, false){
			@Override
			protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.PAPER, 1, 0));
			}
		}.setMaxStackSize(60).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("potatochipstomato", new ItemFood(4, 0.4F, false){
			@Override
			protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.PAPER, 1, 0));
			}
		}.setMaxStackSize(60).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("salami", new ItemFood(2, 0.4F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("stonemugwithbeer", new ItemFood(4, 0.4F, false){
			@Override
			protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(FCLRegistry.getItem("frsm:stonemug"), 1, 0));
			}
		}.setMaxStackSize(4).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("tomato", new ItemFood(2, 0.4F, true).setMaxStackSize(64).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("tomatojar", new ItemFood(2, 0.4F, true){
			@Override
			public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced){
				tooltip.add("Filled with Tomatoes.");
			}
			@Override
			protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(FCLRegistry.getItem("frsm:jar"), 1, 0));
			}
		}.setMaxStackSize(16).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		AUTOREG.addItem("tomatosoup", new ItemFood(2, 0.4F, true){
			@Override
			protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
				player.inventory.addItemStackToInventory(new ItemStack(Items.BOWL, 1, 0));
			}
		}.setMaxStackSize(16).setCreativeTab(FRSMTabs.EATABLES), 0, null);
		//
		AUTOREG.addItem("ironsaw", new IronSaw(), 0, null);
		PaintSet.register();
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent event){
		GameRegistry.registerTileEntity(ClockBaseTileEntity.class, new ResourceLocation("frsm:clock_tileentity"));
		MinecraftForge.addGrassSeed(new ItemStack(FCLRegistry.getItem("frsm:tomatoseeds")), 1);
		//
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
		return AUTOREG;
	}
	
}