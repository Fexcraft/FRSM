package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.AABBs;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "iron_barrel")
public class IronBarrel extends Block {
	
	public static final PropertyBool LOWERED = PropertyBool.create("lowered");
	
	public IronBarrel() {
    	super(Material.WOOD);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(3.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.BLOCKS);
    	this.setDefaultState(this.blockState.getBaseState().withProperty(LOWERED, false));
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
		state = this.getActualState(state, source, pos);
		return state.getValue(LOWERED) ? AABBs.BARREL_DOWN : AABBs.BARREL;
	}
    
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos){
		return getBoundingBox(state, world, pos).offset(pos);
	}

    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, LOWERED);
    }
    
    @Override
    public int getMetaFromState(IBlockState state){
        return 0;
    }
    
    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos){
    	IBlockState other = world.getBlockState(pos.down(2));
    	boolean instance = other.getBlock() instanceof IronBarrel;
        return state.withProperty(LOWERED, instance && !other.getValue(LOWERED));
    }
    
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
    	state = getActualState(state, world, pos);
    	if(!state.getValue(LOWERED) && player.getHeldItemMainhand().getItem().getRegistryName().toString().equals("frsm:iron_barrel")){
    		if(!world.isRemote){
        		BlockPos up = pos.up(2);
        		if(world.getBlockState(up).getBlock().isReplaceable(world, up)){
        			world.setBlockState(up, this.getDefaultState());
        		}
    		}
    		return true;
    	}
    	return false;
    }
	
}