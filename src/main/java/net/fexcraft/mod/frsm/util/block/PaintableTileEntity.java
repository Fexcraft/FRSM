package net.fexcraft.mod.frsm.util.block;

import net.fexcraft.mod.lib.api.common.PaintableObject;
import net.fexcraft.mod.lib.api.network.IPacketReceiver;
import net.fexcraft.mod.lib.network.packet.PacketTileEntityUpdate;
import net.fexcraft.mod.lib.util.common.ApiUtil;
import net.fexcraft.mod.lib.util.common.Print;
import net.fexcraft.mod.lib.util.render.RGB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PaintableTileEntity extends TileEntity implements IPacketReceiver<PacketTileEntityUpdate>, PaintableObject {
	
	protected RGB color = new RGB();
	
	public PaintableTileEntity(EnumDyeColor def_color){
		color.fromDyeColor(def_color);
	}
	
	public PaintableTileEntity(RGB rgb){
		color.copyFrom(rgb);
	}
	
	public void applyColor(RGB color){
		color.copyFrom(color);
		this.sendUpdatePacket();
	}
	
	public void applyColor(EnumDyeColor color){
		this.color.fromDyeColor(color);
		this.sendUpdatePacket();
	}

	@Override
	public void processServerPacket(PacketTileEntityUpdate pkt){
		//
	}

	@Override
	public void processClientPacket(PacketTileEntityUpdate pkt){
		color.readFromNBT(pkt.nbt, null);
	}
	
	public void sendUpdatePacket(){
		ApiUtil.sendTileEntityUpdatePacket(world, pos, color.writeToNBT(new NBTTagCompound(), null), 64);
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
		color.writeToNBT(tag, null);
		return tag;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		color.readFromNBT(tag, null);
	}
	
	public RGB getColor(){
		return color;
	}

	@Override
	public void onPaintItemUse(RGB color, EnumDyeColor dye, ItemStack stack, EntityPlayer player, BlockPos pos, World world) {
		if(!world.isRemote){
			this.color.copyFrom(color);
			this.sendUpdatePacket();
			Print.bar(player, "Color Updated! " + color.toString() + "-[" + dye.getDyeColorName() + "];");
		}
	}
	
	//
}