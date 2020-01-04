package net.fexcraft.mod.frsm.blocks.clock;

import net.fexcraft.lib.common.math.Time;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.fexcraft.lib.mc.utils.ApiUtil;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClockBaseTileEntity extends PaintableTileEntity {
	
	private Class<? extends ClockBase> clazz;
	private EnumClock clocktype;
	private int offset = 0;
	
	public ClockBaseTileEntity(){
		super();
	}

	public ClockBaseTileEntity(Class<? extends ClockBase> clazz){
		super();
		this.clazz = clazz;
		this.clocktype = EnumClock.fromClass(this.clazz);
	}

	public ClockBaseModel getModel(){
		return (ClockBaseModel)clocktype.getModel();
	}

	public ResourceLocation getTexture(){
		return clocktype.getTexture();
	}

	public boolean isOffset(){
		return clocktype.hasOffset();
	}

	public int getOffset(){
		return offset;
	}
	
	public int changeOffset(){
		return ++offset > 12 ? offset = -11 : offset;
	}

	public boolean twoSided(){
		return clocktype.hasBackSide();
	}
	
	private int hour(){
		int h = Time.getGMTOffset(offset).getHour();
		return h >= 12 ? h - 12 : h;
	}
	
	public int getHour12(){
		return clocktype.isWorldTime() ? worldHour() : clocktype.hasOffset() ? hour() : Time.getHour12();
	}

	private int worldHour(){
        long hours = world.getWorldTime() / 1000 + 6;
        if(hours >= 12){ hours -= 12; }
        if(hours >= 12){ hours -= 12; }
        return (int)hours;
	}

	public int getMinute(){
		return clocktype.isWorldTime() ? worldMinute() : clocktype.hasOffset() ? Time.getGMTOffset(offset).getMinute() : Time.getMinute();
	}

	private int worldMinute(){
        return (int)((world.getWorldTime() % 1000) * 60 / 1000);
	}

	public int getSecond(){
		return clocktype.isWorldTime() ? -66 : clocktype.hasOffset() ? Time.getGMTOffset(offset).getSecond() : Time.getSecond();
	}
	
	@Override
	public void processServerPacket(PacketTileEntityUpdate pkt){
		//
	}

	@Override
	public void processClientPacket(PacketTileEntityUpdate pkt){
		offset = pkt.nbt.getInteger("frsm:offset");
	}
	
	public void sendUpdatePacket(){
		ApiUtil.sendTileEntityUpdatePacket(world, pos, this.writeToNBT(new NBTTagCompound()), 64);
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
		tag = super.writeToNBT(tag);
		tag.setInteger("frsm:offset", offset);
		tag.setString("frsm:clocktype", clocktype.getRegistryName());
		return tag;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag){
		super.readFromNBT(tag);
		offset = tag.getInteger("frsm:offset");
		clocktype = EnumClock.fromString(tag.getString("frsm:clocktype"));
	}
	
	@SideOnly(Side.CLIENT) @Override
    public double getMaxRenderDistanceSquared(){
        return super.getMaxRenderDistanceSquared() * 8;
    }

    @SideOnly(Side.CLIENT) @Override
    public AxisAlignedBB getRenderBoundingBox(){
        return INFINITE_EXTENT_AABB;
    }
	
}