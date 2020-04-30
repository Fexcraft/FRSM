package net.fexcraft.mod.frsm.blocks.other;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.capabilities.FCLCapabilities;
import net.fexcraft.lib.mc.network.packet.PacketTileEntityUpdate;
import net.fexcraft.lib.mc.utils.ApiUtil;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDye;
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

@fBlock(modid = FRSM.MODID, name = "officechair", tileentity = Officechair.Entity.class, item = PaintableInfo.class)
public class Officechair extends BasicContainer4R{
	
	private static final AxisAlignedBB AABB = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
	
	public Officechair(){
    	super(Material.GLASS);
    	this.setHarvestLevel("axe", 1);
    	this.setHardness(2.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.BLOCKS);
	}
    	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Officechair.Entity();
	}
	
	@Override
    public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
    	if(!w.isRemote){
    		if(!p.getHeldItemMainhand().isEmpty() && p.getHeldItemMainhand().getItem() instanceof ItemDye){
    			((Officechair.Entity)w.getTileEntity(pos)).getCapability(FCLCapabilities.PAINTABLE, null).setColor(EnumDyeColor.byDyeDamage(p.getHeldItemMainhand().getMetadata()));
    		}
    		else{
    			((Officechair.Entity)w.getTileEntity(pos)).applyRotation();
    		}
    		return true;
    	}
		return false;
    }
	
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World source, BlockPos pos){
		return AABB.offset(pos);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return AABB;
	}
	
	public static class Entity extends PaintableTileEntity {
		
		public short rotation = 0;
		
		public Entity(){}

		@Override
		public void processClientPacket(PacketTileEntityUpdate pkt){
			NBTTagCompound nbt = pkt.nbt;
			rotation = nbt.getShort("rotation");
		}
		
		public void sendUpdatePacket(){
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setShort("rotation", rotation);
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
			tag.setShort("frsm_rotation", rotation);
			return tag;
		}
		
		@Override
		public void readFromNBT(NBTTagCompound tag){
			super.readFromNBT(tag);
			rotation = tag.getShort("frsm_rotation");
		}

		public void applyRotation(){
			rotation++; if(rotation >= 36){ rotation = 0; }
			this.sendUpdatePacket();
		}
		
	}
	
}