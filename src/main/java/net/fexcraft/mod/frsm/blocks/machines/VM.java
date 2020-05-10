package net.fexcraft.mod.frsm.blocks.machines;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.AABBs;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4RFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "vendingmachine")
public class VM extends Basic4RFalling {
	
	public static VM TEMPINSTANCE;

	public VM(){
    	super(Material.IRON);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(5.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.TECHNIC);
    	TEMPINSTANCE = this;
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
    public BlockRenderLayer getRenderLayer(){
        return BlockRenderLayer.CUTOUT;
    }

    @Override
	public boolean isFullBlock(IBlockState state) {
		return true;
	}
	
	@Override
	public boolean isFullCube(IBlockState state){
        return true;
    }
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
	
}