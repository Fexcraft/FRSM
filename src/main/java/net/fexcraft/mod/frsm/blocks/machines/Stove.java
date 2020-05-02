package net.fexcraft.mod.frsm.blocks.machines;

import static net.fexcraft.mod.frsm.util.Properties.FACING;
import static net.fexcraft.mod.frsm.util.Properties.OPEN;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4RFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "stove")
public class Stove extends Basic4RFalling {
	
	public Stove(){
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(3.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.TECHNIC);
    	this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(OPEN, false));
	}
	
	@Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()).withProperty(OPEN, false);
    }

	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()).withProperty(OPEN, false));
    }
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        if(!world.isRemote && hand == EnumHand.MAIN_HAND && player.getHeldItemMainhand().isEmpty()){
        	world.setBlockState(pos, state.withProperty(OPEN, !state.getValue(OPEN)));
            return true;
        }
		return false;
    }
    
	@Override
    public IBlockState getStateFromMeta(int meta){
        EnumFacing enumfacing = EnumFacing.byIndex(meta > 5 ? meta - 6 : meta);
        if (enumfacing.getAxis() == EnumFacing.Axis.Y){
            enumfacing = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty(FACING, enumfacing).withProperty(OPEN, meta > 6);
    }
	
	@Override
    public int getMetaFromState(IBlockState state){
        return state.getValue(FACING).getIndex() + (state.getValue(OPEN) ? 6 : 0);
    }
	
	@Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, FACING, OPEN);
    }
    
    @Override
    public BlockRenderLayer getRenderLayer(){
        return BlockRenderLayer.CUTOUT;
    }
	
}