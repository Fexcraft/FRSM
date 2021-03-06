package net.fexcraft.mod.frsm.blocks.tv;

import net.fexcraft.lib.mc.api.packet.IPacketReceiver;
import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.fexcraft.lib.mc.utils.ApiUtil;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "tvs2", tileentity = TVS2.Entity.class)
public class TVS2 extends BasicContainer4R {
    
	public TVS2() {
		super(Material.GRASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TVS2.Entity();
	}
	
	@Override
	public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
	    if(!w.isRemote && hand == EnumHand.MAIN_HAND){
	    	int i = ((TVS2.Entity)w.getTileEntity(pos)).rotation;
	    	i += 1;
	    	if(i >= 16){
	    		i = 0;
	    	}
	    	//22,5
	    	NBTTagCompound nbt = new NBTTagCompound();
	    	nbt.setInteger("rotation", i);
	    	ApiUtil.sendTileEntityUpdatePacket(w, pos, nbt, 64);
	    }
		return true;
	}
	
	public static class Entity extends TileEntity implements IPacketReceiver<PacketTileEntityUpdate> {
		
		int rotation;
		
		public Entity(){
			rotation = 0;
		}
		
		public int getRotation(){
			return rotation;
		}
		
		@Override
		public NBTTagCompound getUpdateTag(){
			NBTTagCompound nbt = new NBTTagCompound();
			this.writeToNBT(nbt);
			return nbt;
		}
		
		@Override
		public SPacketUpdateTileEntity getUpdatePacket(){
			NBTTagCompound nbt = new NBTTagCompound();
			this.writeToNBT(nbt);
			return new SPacketUpdateTileEntity(this.getPos(), this.getBlockMetadata(), nbt);
		}
		
		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt){
			this.readFromNBT(pkt.getNbtCompound());
		}
		
		@Override
		public void readFromNBT(NBTTagCompound nbt){
			super.readFromNBT(nbt);
			rotation = nbt.getInteger("Rotation");
		}
		
		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound nbt){
			super.writeToNBT(nbt);
			nbt.setInteger("Rotation", rotation);
			return nbt;
		}
		
		@Override
		public void processClientPacket(PacketTileEntityUpdate pkt){
			rotation = pkt.nbt.getInteger("rotation");
		}
		
	}
	
}