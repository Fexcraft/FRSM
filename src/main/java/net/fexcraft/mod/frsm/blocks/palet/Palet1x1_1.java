package net.fexcraft.mod.frsm.blocks.palet;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R_F;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "palet1x1_1", tileentity = Palet1x1_1.Entity.class, burn_time = 1500)
public class Palet1x1_1 extends FBC_4R_F {
	
	public Palet1x1_1() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(1.0F);
    	this.setResistance(10.0F);
    	this.setCreativeTab(CD.BLOCKS);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Palet1x1_1.Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}