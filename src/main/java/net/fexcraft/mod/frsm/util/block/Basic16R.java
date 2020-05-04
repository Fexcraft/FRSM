package net.fexcraft.mod.frsm.util.block;

import static net.fexcraft.mod.frsm.util.Properties.ROTATION;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class Basic16R extends Block {
	
	public Basic16R(Material material) {
    	super(material);
    	this.setDefaultState(this.blockState.getBaseState().withProperty(ROTATION, 0));
	}

    @Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state){
        return false;
    }
	
	@Override
	public boolean isOpaqueCube(IBlockState state){
        return false;
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return FULL_BLOCK_AABB;
    }

	@Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState blockState, World worldIn, BlockPos pos){
        return FULL_BLOCK_AABB.offset(pos);
    }
	
	@Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        return this.getDefaultState().withProperty(ROTATION, MathHelper.floor((double)((placer.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15);
    }

	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
		 worldIn.setBlockState(pos, state.withProperty(ROTATION, MathHelper.floor((double)((placer.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15));
    }
    
	@Override
    public IBlockState getStateFromMeta(int meta){
		return this.getDefaultState().withProperty(ROTATION, meta);
    }
	
	@Override
    public int getMetaFromState(IBlockState state){
		return state.getValue(ROTATION);
    }
	
	@Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, ROTATION);
    }
	
}