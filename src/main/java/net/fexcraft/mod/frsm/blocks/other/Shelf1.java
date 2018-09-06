package net.fexcraft.mod.frsm.blocks.other;

import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.fexcraft.mod.lib.api.block.fBlock;
import net.fexcraft.mod.lib.api.common.PaintableObject;
import net.fexcraft.mod.lib.api.network.IPacketReceiver;
import net.fexcraft.mod.lib.network.packet.PacketTileEntityUpdate;
import net.fexcraft.mod.lib.util.common.ApiUtil;
import net.fexcraft.mod.lib.util.common.Print;
import net.fexcraft.mod.lib.util.render.RGB;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
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

@fBlock(modid = FI.MODID, name = "shelf1", tileentity = Shelf1.Entity.class, item = PaintableInfo.class)
public class Shelf1 extends FBC_4R {

	public Shelf1() {
		super(Material.WOOD);
		this.setHarvestLevel("axe", 1);
		this.setHardness(1.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(CD.BLOCKS);
	}
	
	protected static final AxisAlignedBB EAST = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST = new AxisAlignedBB(0.5D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTH = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
    protected static final AxisAlignedBB NORTH = new AxisAlignedBB(0.0D, 0.0D, 0.5D, 1.0D, 1.0D, 1.0D);
	
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        switch ((EnumFacing)state.getValue(FACING)){
            case NORTH:
                return NORTH;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            case EAST:
            default:
                return EAST;
        }
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos){
        return getBoundingBox(state, null, pos);
    }
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new Shelf1.Entity();
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
        	NBTTagCompound nbt = new NBTTagCompound();
        	Entity te = (Entity)world.getTileEntity(pos);
            nbt.setBoolean("open", !te.getState());
            te.toggle(!te.getState());
            ApiUtil.sendTileEntityUpdatePacket(world, pos, nbt);
        }
		return true;
    }
	
	public static class Entity extends TileEntity implements IPacketReceiver<PacketTileEntityUpdate>, PaintableObject {

		private EnumDyeColor color;
		private boolean open;
		
		public Entity(){
			color = EnumDyeColor.WHITE;
			open = false;
		}
		
		public void toggle(){
			this.open = !open;
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setBoolean("open", open);
			ApiUtil.sendTileEntityUpdatePacket(this.getWorld(), this.getPos(), nbt);
		}
		
		public void toggle(boolean bool){
			this.open = bool;
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setBoolean("open", open);
			ApiUtil.sendTileEntityUpdatePacket(this.getWorld(), this.getPos(), nbt);
		}
		
		@Override
		public SPacketUpdateTileEntity getUpdatePacket(){
			NBTTagCompound nbt = this.writeToNBT(new NBTTagCompound());		
			return new SPacketUpdateTileEntity(this.getPos(), this.getBlockMetadata(), nbt);
		}

		@Override
		public void processClientPacket(PacketTileEntityUpdate packet){
			if(packet.nbt.hasKey("color")){
				this.color = ApiUtil.getDyeColorFromString(packet.nbt.getString("color"));
			}
			if(packet.nbt.hasKey("open")){
				this.open = packet.nbt.getBoolean("open");
			}
		}
		
		@Override
		public NBTTagCompound getUpdateTag(){
			NBTTagCompound nbt = this.writeToNBT(new NBTTagCompound());
			return nbt;
		}
		
		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt){
			this.readFromNBT(pkt.getNbtCompound());
		}
		
		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound){
			super.writeToNBT(compound);
			compound.setString("frsm_color", color.getName());
			compound.setBoolean("frsm_open", open);
			return compound;
		}
		
		@Override
		public void readFromNBT(NBTTagCompound compound){
			super.readFromNBT(compound);
			color = ApiUtil.getDyeColorFromString("frsm_color");
			open = compound.getBoolean("frsm_open");
		}

		public boolean getState(){
			return open;
		}

		public EnumDyeColor getColor(){
			return color;
		}

		@Override
		public void onPaintItemUse(RGB color, EnumDyeColor dye, ItemStack stack, EntityPlayer player, BlockPos pos, World world) {
			this.color = dye;
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setString("color", color.toString());
			ApiUtil.sendTileEntityUpdatePacket(this.getWorld(), this.getPos(), nbt);
			Print.chat(player, "Color set to " + color.toString() + "!");
		}
		
	}
	
}