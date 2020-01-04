package net.fexcraft.mod.frsm.blocks.machines;

import net.fexcraft.lib.common.math.RGB;
import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.fexcraft.lib.mc.utils.ApiUtil;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "pchardware1", tileentity = PCHardware1.Entity.class, item = PaintableInfo.class)
public class PCHardware1 extends FBC_4R {
	
	public PCHardware1() {
    	super(Material.GLASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(CD.TECHNIC);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Entity();
	}
	
	@Override
    public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
		if(w.isRemote){
			return false;
		}
		((Entity)w.getTileEntity(pos)).next();
		return true;
	}
	
	public static class Entity extends PaintableTileEntity {
		
		private int ps = 0;
		
		public Entity(){}

		public void next(){
			ps++;
			if(ps > 2){
				ps = 0;
			}
			this.sendUpdatePacket();
		}
		
		public void applyColor(RGB color){
			this.sendUpdatePacket();
		}
		
		public void applyColor(EnumDyeColor color){
			this.sendUpdatePacket();
		}

		@Override
		public void processClientPacket(PacketTileEntityUpdate pkt){
			ps = pkt.nbt.getInteger("position");
		}
		
		public void sendUpdatePacket(){
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("position", ps);
			ApiUtil.sendTileEntityUpdatePacket(world, pos, nbt, 64);
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
			tag.setInteger("Position", ps);
			return tag;
		}
		
		@Override
		public void readFromNBT(NBTTagCompound tag){
			super.readFromNBT(tag);
			ps = tag.getInteger("Position");
		}

		public int getPosition(){
			return ps;
		}

	}
	
}