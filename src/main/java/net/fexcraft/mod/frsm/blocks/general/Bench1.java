package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4R;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Bench1 extends Basic4R {
	
	@fBlock(modid = FRSM.MODID, name = "bench1")
	public static class Bench1_0 extends Bench1{}
	
	@fBlock(modid = FRSM.MODID, name = "bench1_1")
	public static class Bench1_1 extends Bench1{}
	
	@fBlock(modid = FRSM.MODID, name = "bench1_2")
	public static class Bench1_2 extends Bench1{}
	
	@fBlock(modid = FRSM.MODID, name = "bench1_3")
	public static class Bench1_3 extends Bench1{};
	
	public Bench1(){
		super(Material.WOOD);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.BLOCKS);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
    	return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
	
}