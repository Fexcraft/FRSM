package net.fexcraft.mod.frsm.blocks.machines;

import static net.fexcraft.mod.frsm.util.Properties.COLOR;
import static net.fexcraft.mod.frsm.util.Properties.FACING;
import static net.fexcraft.mod.frsm.util.Properties.PCHARDWAREPOS;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.fexcraft.lib.mc.utils.ApiUtil;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.property.IExtendedBlockState;

@fBlock(modid = FRSM.MODID, name = "pchardware1", tileentity = PCHardware1.Entity.class, item = PaintableInfo.class)
public class PCHardware1 extends BasicContainer4R {

	public PCHardware1(){
		super(Material.GLASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new Entity();
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
		if(hand == EnumHand.MAIN_HAND && player.getHeldItemMainhand().isEmpty()){
			if(!world.isRemote){
				((Entity)world.getTileEntity(pos)).next();
			}
			return true;
		}
		return false;
	}
	
	@Override
    protected BlockStateContainer createBlockState(){
		return new BlockStateContainer.Builder(this).add(FACING).add(COLOR, PCHARDWAREPOS).build();
    }
	
	@Override
	public IExtendedBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos){
		Entity ent = (Entity)world.getTileEntity(pos);
		if(ent == null){
			return ((IExtendedBlockState)state).withProperty(COLOR, 0).withProperty(PCHARDWAREPOS, 0);
		}
		else return ((IExtendedBlockState)state).withProperty(COLOR, ent.getColor().packed).withProperty(PCHARDWAREPOS, ent.ps);
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

		@Override
		public void processClientPacket(PacketTileEntityUpdate pkt){
			ps = pkt.nbt.getInteger("position");
			if(world != null){
				world.markBlockRangeForRenderUpdate(pos, pos);
			}
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