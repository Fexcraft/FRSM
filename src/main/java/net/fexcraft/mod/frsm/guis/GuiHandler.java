package net.fexcraft.mod.frsm.guis;

import net.fexcraft.mod.frsm.blocks.other.Furnace1bEntity;
import net.fexcraft.mod.frsm.guis.client.GuiFurnace1;
import net.fexcraft.mod.frsm.guis.client.GuiLoadingScreen;
import net.fexcraft.mod.frsm.guis.client.GuiPalet;
import net.fexcraft.mod.frsm.guis.server.ContainerFurnace1;
import net.fexcraft.mod.frsm.guis.server.ContainerPalet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static final int FURNACE1 = 1;
	public static final int PALET1 = 4;
	public static final int PALET2 = 5;
	public static int RGB = 3;

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity entity = world.getTileEntity(pos);
		switch(id){
			case 0:
				return null;
			case 1:
				return new ContainerFurnace1(player.inventory, (Furnace1bEntity)entity);
			case PALET1:
			case PALET2:
				return new ContainerPalet(player, entity);
			default:
				return null;
		}
		
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity entity = world.getTileEntity(pos);
		
		switch(id){
			case 0:
				return null;
			case 1:
				return new GuiFurnace1(player.inventory, (Furnace1bEntity)entity);
			case 3:
				return null;
			case PALET1:
				return new GuiPalet(player, entity, false);
			case PALET2:
				return new GuiPalet(player, entity, true);
			default:
				return new GuiLoadingScreen();
		}
		
    }
	
	public static class GUIS{
		public static int TEMT = 0;
	}
}
