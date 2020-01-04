package net.fexcraft.mod.frsm.blocks.machines;

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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "fridge", tileentity = Fridge.Entity.class, item = PaintableInfo.class)
public class Fridge extends FBC_4R {
	
	public Fridge() {
		super(Material.IRON);
		this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(5.0F);
    	this.setResistance(32.0F);
		this.setCreativeTab(CD.TECHNIC);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
        	Entity te = (Entity)world.getTileEntity(pos);
            te.setState(!te.getState());
            te.sendUpdatePacket();
        }
		return true;
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Entity();
	}
	
	public static class Entity extends PaintableTileEntity {
		
		private boolean open = false;
		
		public Entity(){}
		
		public boolean getState(){
			return open;
		}
		
		public void setState(boolean b){
			this.open = b;
		}

		@Override
		public void processClientPacket(PacketTileEntityUpdate packet){
			open = packet.nbt.getBoolean("open");
		}
		
		public void sendUpdatePacket(){
			NBTTagCompound nbt = new NBTTagCompound(); nbt.setBoolean("open", open);
			ApiUtil.sendTileEntityUpdatePacket(world.provider.getDimension(), pos, nbt, 64);
		}
		
		@Override
		public SPacketUpdateTileEntity getUpdatePacket(){
			NBTTagCompound nbt = new NBTTagCompound(); nbt = this.writeToNBT(nbt);
			return new SPacketUpdateTileEntity(this.getPos(), this.getBlockMetadata(), nbt);
		}
		
		@Override
		public NBTTagCompound getUpdateTag(){
			NBTTagCompound nbt = new NBTTagCompound();
			nbt = this.writeToNBT(nbt);
			return nbt;
		}
		
		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt){
			this.readFromNBT(pkt.getNbtCompound());
		}
		
		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound){
			super.writeToNBT(compound);
			compound.setBoolean("frsm_open", open);
			return compound;
		}
		
		@Override
		public void readFromNBT(NBTTagCompound compound){
			super.readFromNBT(compound);
			open = compound.getBoolean("frsm_open");
		}
		
	}
	
}