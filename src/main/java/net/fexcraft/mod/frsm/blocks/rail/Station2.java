package net.fexcraft.mod.frsm.blocks.rail;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "model_station2", tileentity = Station2.Entity.class)
public class Station2 extends BasicContainer4R {

	public Station2() {
    	super(Material.IRON);this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(2.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.MODELS);
	}
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
    	return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
    }
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Station2.Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}