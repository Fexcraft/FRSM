package net.fexcraft.mod.frsm.blocks.machines;

import static net.fexcraft.mod.frsm.util.Properties.CLOSED;
import static net.fexcraft.mod.frsm.util.Properties.COLOR;
import static net.fexcraft.mod.frsm.util.Properties.FACING;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.fexcraft.lib.mc.utils.ApiUtil;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.AABBs;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
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
import net.minecraftforge.common.property.IExtendedBlockState;

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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return AABBs.HIGH_2;
	}

	@Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState blockState, World worldIn, BlockPos pos){
        return AABBs.HIGH_2.offset(pos);
    }
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        if(!world.isRemote && hand == EnumHand.MAIN_HAND && player.getHeldItemMainhand().isEmpty()){
        	Entity te = (Entity)world.getTileEntity(pos);
            te.setState(!te.getState());
            te.sendUpdatePacket();
            return true;
        }
		return false;
    }
	
	@Override
    protected BlockStateContainer createBlockState(){
		return new BlockStateContainer.Builder(this).add(FACING).add(CLOSED, COLOR).build();
    }
	
	@Override
	public IExtendedBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos){
		Entity ent = (Entity)world.getTileEntity(pos);
		if(ent == null){
			return ((IExtendedBlockState)state).withProperty(COLOR, 16777265).withProperty(CLOSED, true);
		}
		else return ((IExtendedBlockState)state).withProperty(COLOR, ent.getColor().packed).withProperty(CLOSED, !ent.open);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
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
			if(world != null){
				world.markBlockRangeForRenderUpdate(pos, pos);
			}
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