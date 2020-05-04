package net.fexcraft.mod.frsm.util;

import java.util.List;

import com.google.gson.JsonObject;

import net.fexcraft.lib.mc.FCL;
import net.fexcraft.lib.mc.capabilities.paint.PaintableSerializer;
import net.fexcraft.lib.mc.utils.Formatter;
import net.fexcraft.lib.mc.utils.Print;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.blocks.machines.VM;
import net.fexcraft.mod.frsm.blocks.machines.WM;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.MissingMappings.Mapping;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class UpdateHandler {

	private static String newest_version;
	public static String Status = null;
	public static String wm;
	public static String nMCV = FCL.mcv;

	public static void load(){

		refresh();

		if(Data.getData().get("welcome_message").getAsString().length() > 4){
			wm = FRSM.PREFIX + " " + Formatter.format(Data.getData().get("welcome_message").getAsString());
		}
		if(newest_version != null){
			if(FRSM.VERSION.equals(newest_version)){
				Status = null;
			}
			else{
				Status = FRSM.PREFIX + " New Version avaible! (&a" + newest_version + "&7)" + "\n" + FRSM.PREFIX + " Your Client version: (&c" + FRSM.VERSION + "&7)";
				// + "\n" + FI.PREFIX + CCS.GRAY + " Use '/frsm download' to get the link.";
				if(Data.getData().get("update_note").getAsString().length() > 4){
					Status = Status + "\n&7================";
					Status = Status + "\n&6[Update Note]: &f" + Data.getData().get("update_note").getAsString();
				}
			}
		}
		else{
			Status = null;
		}
	}

	private static void refresh(){
		JsonObject obj = Data.getData();
		newest_version = obj.get("latest_version").getAsString();
		nMCV = obj.get("latest_mc_version").getAsString();
	}

	public static class EventHandler {

		@SubscribeEvent
		public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event){
			if(UpdateHandler.wm != null){
				Print.chat(event.player, UpdateHandler.wm);
				Print.chat(event.player, FRSM.PREFIX + "&7================");
			}
			if(UpdateHandler.Status != null){
				Print.chat(event.player, UpdateHandler.Status);
			}
			if(!UpdateHandler.nMCV.equals(FCL.mcv)){
				Print.chat(event.player, FRSM.PREFIX + "&7================");
				Print.chat(event.player, FRSM.PREFIX + " Now avaible for Minecraft " + UpdateHandler.nMCV + "!");
			}
		}

		@SubscribeEvent
		public void onAttachCapabilities(AttachCapabilitiesEvent<TileEntity> event){
			if(event.getObject() instanceof PaintableTileEntity){
				event.addCapability(PaintableSerializer.REGISTRY_NAME, new PaintableSerializer(event.getObject()));
			}
		}

		//@formatter:off
		public static ResourceLocation[] renamed = new ResourceLocation[]{
			new ResourceLocation("frsm:vendingmashine"), new ResourceLocation("frsm:washingmashine"), new ResourceLocation("frsm:vendingmaschine")
		};
		public static Block[] blocks = new Block[]{
			VM.TEMPINSTANCE, WM.TEMPINSTANCE, VM.TEMPINSTANCE
		};
		//@formatter:on

		@SubscribeEvent
		public void onMissingBlockMapping(RegistryEvent.MissingMappings<Block> event){
			List<Mapping<Block>> list = event.getMappings();
			for(Mapping<Block> map : list){
				for(int i = 0; i < renamed.length; i++){
					if(renamed[i].toString().equals(map.key.toString())){
						map.remap(blocks[1]);
						break;
					}
				}
			}
		}

		@SubscribeEvent
		public void onMissingItemMapping(RegistryEvent.MissingMappings<Item> event){
			List<Mapping<Item>> list = event.getMappings();
			for(Mapping<Item> map : list){
				for(int i = 0; i < renamed.length; i++){
					if(renamed[i].toString().equals(map.key.toString())){
						map.remap(new ItemStack(blocks[i]).getItem());
						break;
					}
				}
			}
		}

	}

}