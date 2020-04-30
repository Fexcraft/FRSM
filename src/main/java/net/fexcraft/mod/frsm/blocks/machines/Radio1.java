package net.fexcraft.mod.frsm.blocks.machines;

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

@fBlock(modid = FRSM.MODID, name = "radio1", tileentity = Radio1.Entity.class)
public class Radio1 extends BasicContainer4R {
	
	public Radio1() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(1.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.TECHNIC);
	}
    
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.4F, 1.0F);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}