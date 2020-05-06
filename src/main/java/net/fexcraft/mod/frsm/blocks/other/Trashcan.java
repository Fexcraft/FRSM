package net.fexcraft.mod.frsm.blocks.other;

import static net.fexcraft.mod.frsm.util.Properties.OPEN;
import static net.fexcraft.mod.frsm.util.Properties.ORIENT;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.AABBs;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "trashcan")
public class Trashcan extends BlockFalling {

	public Trashcan(){
		super(Material.ANVIL);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(5.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.BLOCKS);
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
		return AABBs.BARREL;
	}
    
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos){
		return AABBs.BARREL.offset(pos);
	}

    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, OPEN, ORIENT);
    }
	
	@Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        return this.getDefaultState().withProperty(ORIENT, placer.getHorizontalFacing().getAxis() == Axis.X).withProperty(OPEN, false);
    }

	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){
        worldIn.setBlockState(pos, state.withProperty(ORIENT, placer.getHorizontalFacing().getAxis() == Axis.X).withProperty(OPEN, false));
    }
    
	@Override
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(ORIENT, meta % 2 == 1).withProperty(OPEN, meta > 1);
    }
	
	@Override
    public int getMetaFromState(IBlockState state){
        return (state.getValue(ORIENT) ? 1 : 0) + (state.getValue(OPEN) ? 2 : 0);
    }
	
	@Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
		if(player.getHeldItemMainhand().isEmpty()){
			world.setBlockState(pos, this.getDefaultState().withProperty(ORIENT, state.getValue(ORIENT)).withProperty(OPEN, !state.getValue(OPEN)));
			return true;
		}
		return false;
    }
	
}