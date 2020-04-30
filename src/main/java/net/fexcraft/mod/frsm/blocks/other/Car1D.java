package net.fexcraft.mod.frsm.blocks.other;

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

@fBlock(modid = FRSM.MODID, name = "Car1D", tileentity = Car1D.Entity.class)
public class Car1D extends BasicContainer4R {

	public Car1D() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(1.0F);
    	this.setResistance(10.0F);
    	this.setCreativeTab(FRSMTabs.MODELS);
	}
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
    	return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
    }

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new Car1D.Entity();
	}
	
    public static class Entity extends TileEntity {}
    
}