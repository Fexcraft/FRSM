package net.fexcraft.mod.frsm.blocks.machines;

import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.fexcraft.mod.lib.api.block.fBlock;
import net.fexcraft.mod.lib.api.common.PaintableObject;
import net.fexcraft.mod.lib.api.network.IPacketReceiver;
import net.fexcraft.mod.lib.network.packet.PacketTileEntityUpdate;
import net.fexcraft.mod.lib.util.common.ApiUtil;
import net.fexcraft.mod.lib.util.render.RGB;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "electric_pizza_oven", tileentity = PizzaOven.Entity.class, item = PaintableInfo.class)
public class PizzaOven extends FBC_4R {

	public PizzaOven() {
		super(Material.IRON);
		this.setCreativeTab(CD.TECHNIC);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new PizzaOven.Entity();
	}
	
	public static class Entity extends TileEntity implements IPacketReceiver<PacketTileEntityUpdate>, PaintableObject {
		
		private RGB color = new RGB();
		
		public Entity(){
			color = RGB.fromDyeColor(EnumDyeColor.GRAY);
		}
		
		public void sendUpdatePacket(){
			ApiUtil.sendTileEntityUpdatePacket(world, pos, getColor().writeToNBT(new NBTTagCompound(), null), 64);
		}

		@Override
		public void processClientPacket(PacketTileEntityUpdate pkt){
			getColor().readFromNBT(pkt.nbt, null);
		}
		
		@Override
		public NBTTagCompound getUpdateTag(){
			return this.writeToNBT(new NBTTagCompound());
		}
		
		@Override
		public SPacketUpdateTileEntity getUpdatePacket(){
			return new SPacketUpdateTileEntity(this.getPos(), 2, this.writeToNBT(new NBTTagCompound()));
		}
		
		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt){
			this.readFromNBT(pkt.getNbtCompound());
		}
		
		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound tag){
			super.writeToNBT(tag);
			getColor().writeToNBT(tag, null);
			return tag;
		}
		
		@Override
		public void readFromNBT(NBTTagCompound tag){
			super.readFromNBT(tag);
			getColor().readFromNBT(tag, null);
		}

		public RGB getColor() {
			return color;
		}

		@Override
		public void onPaintItemUse(RGB color, EnumDyeColor dye, ItemStack stack, EntityPlayer player, BlockPos pos, World world){
			this.color = new RGB(color);
			this.sendUpdatePacket();
		}
		
	}
	
}