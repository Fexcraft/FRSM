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
import net.fexcraft.mod.lib.util.render.RGB;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDye;
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

@fBlock(modid = FI.MODID, name = "officechair", tileentity = Officechair.Entity.class, item = PaintableInfo.class)
public class Officechair extends FBC_4R{
	
	public Officechair() {
    	super(Material.GLASS);
    	this.setHarvestLevel("axe", 1);
    	this.setHardness(2.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(CD.BLOCKS);
	}
    	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Officechair.Entity();
	}
	
	@Override
    public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
    	if(!w.isRemote){
    		if(!p.getHeldItemMainhand().isEmpty() && p.getHeldItemMainhand().getItem() instanceof ItemDye){
    			((Officechair.Entity)w.getTileEntity(pos)).applyColor(EnumDyeColor.byDyeDamage(p.getHeldItemMainhand().getMetadata()));
    		}
    		else{
    			((Officechair.Entity)w.getTileEntity(pos)).applyRotation();
    		}
    		return true;
    	}
		return false;
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
	}
	
	public static class Entity extends TileEntity implements IPacketReceiver<PacketTileEntityUpdate>, PaintableObject {
		
		public RGB primary = new RGB(); //RGB secondary = RGB.WHITE;
		public short rotation = 0;
		
		public Entity(){
			primary = RGB.fromDyeColor(EnumDyeColor.ORANGE);
		}
		
		public void applyColor(RGB color){
			primary = new RGB(color);
			this.sendUpdatePacket();
		}
		
		public void applyColor(EnumDyeColor color){
			primary = RGB.fromDyeColor(color);
			this.sendUpdatePacket();
		}

		@Override
		public void processClientPacket(PacketTileEntityUpdate pkt){
			NBTTagCompound nbt = pkt.nbt;
			primary.readFromNBT(nbt, null);
			rotation = nbt.getShort("rotation");
		}
		
		public void sendUpdatePacket(){
			NBTTagCompound nbt = new NBTTagCompound();
			nbt = primary.writeToNBT(nbt, null);
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
			primary.writeToNBT(tag, "Primary");
			tag.setShort("frsm_rotation", rotation);
			return tag;
		}
		
		@Override
		public void readFromNBT(NBTTagCompound tag){
			super.readFromNBT(tag);
			primary.readFromNBT(tag, "Primary");
			rotation = tag.getShort("frsm_rotation");
		}

		public void applyRotation(){
			rotation++;
			if(rotation >= 36){
				rotation = 0;
			}
			this.sendUpdatePacket();
		}

		@Override
		public void onPaintItemUse(RGB color, EnumDyeColor dye, ItemStack stack, EntityPlayer player, BlockPos pos, World world){
			if(!world.isRemote){
				primary = new RGB(color);
				this.sendUpdatePacket();
			}
		}
		
	}
	
}