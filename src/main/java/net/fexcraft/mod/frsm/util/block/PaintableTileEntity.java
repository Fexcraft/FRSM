package net.fexcraft.mod.frsm.util.block;

import net.fexcraft.lib.common.math.RGB;
import net.fexcraft.lib.mc.api.packet.IPacketReceiver;
import net.fexcraft.lib.mc.capabilities.FCLCapabilities;
import net.fexcraft.lib.mc.capabilities.paint.Paintable;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class PaintableTileEntity extends TileEntity implements IPacketReceiver<PacketTileEntityUpdate> {
	
	/*public PaintableTileEntity(EnumDyeColor def_color){
		color = RGB.fromDyeColor(def_color);
	}
	
	public PaintableTileEntity(RGB rgb){
		color.packed = rgb.packed;
	}
	
	public void applyColor(RGB color){
		this.color.packed = color.packed;
		this.sendUpdatePacket();
	}
	
	public void applyColor(EnumDyeColor color){
		this.color = RGB.fromDyeColor(color);
		this.sendUpdatePacket();
	}*/

	@Override
	public void processServerPacket(PacketTileEntityUpdate pkt){
		//
	}

	@Override
	public void processClientPacket(PacketTileEntityUpdate pkt){
		//
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
		super.writeToNBT(tag); return tag;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		if(world != null && world.isRemote){
			world.markBlockRangeForRenderUpdate(pos, pos);
		}
	}
	
	private Paintable cap;
	
	public RGB getColor(){
		if(cap == null) cap = this.getCapability(FCLCapabilities.PAINTABLE, null);
		return cap == null ? RGB.WHITE : cap.getColor();
	}
	
}