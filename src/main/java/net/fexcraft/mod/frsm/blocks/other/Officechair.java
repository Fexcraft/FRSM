package net.fexcraft.mod.frsm.blocks.other;

import static net.fexcraft.mod.frsm.util.Properties.COLOR;
import static net.fexcraft.mod.frsm.util.Properties.ROTATION;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.capabilities.FCLCapabilities;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.AABBs;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic16R;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDye;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.property.IExtendedBlockState;

@fBlock(modid = FRSM.MODID, name = "officechair", tileentity = Officechair.Entity.class, item = PaintableInfo.class)
public class Officechair extends Basic16R implements ITileEntityProvider {
	
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
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
    	if(!world.isRemote){
    		if(!player.getHeldItemMainhand().isEmpty() && player.getHeldItemMainhand().getItem() instanceof ItemDye){
    			((Officechair.Entity)world.getTileEntity(pos)).getCapability(FCLCapabilities.PAINTABLE, null).setColor(EnumDyeColor.byDyeDamage(player.getHeldItemMainhand().getMetadata()));
    		}
    		else{
    			world.setBlockState(pos, state.withProperty(ROTATION, MathHelper.floor((double)((player.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15));
    		}
    		return true;
    	}
		return false;
    }
	
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World source, BlockPos pos){
		return AABBs.CHAIR.offset(pos);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return AABBs.CHAIR;
	}
	
	public static class Entity extends PaintableTileEntity {
		
		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldstate, IBlockState newstate){
			return newstate.getBlock() instanceof Officechair == false;
		}
		
		
	}
	
	@Override
    protected BlockStateContainer createBlockState(){
		return new BlockStateContainer.Builder(this).add(ROTATION).add(COLOR).build();
    }
	
	@Override
	public IExtendedBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos){
		Entity ent = (Entity)world.getTileEntity(pos);
		if(ent == null){
			return ((IExtendedBlockState)state).withProperty(COLOR, 16777265);
		}
		else return ((IExtendedBlockState)state).withProperty(COLOR, ent.getColor().packed);
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
	
}