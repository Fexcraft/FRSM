package net.fexcraft.mod.frsm.blocks.palet;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4RFalling;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "palet1x1_1", tileentity = Palet1x1_1.Entity.class, burn_time = 1500)
public class Palet1x1_1 extends BasicContainer4RFalling {
	
	public Palet1x1_1() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(1.0F);
    	this.setResistance(10.0F);
    	this.setCreativeTab(FRSMTabs.BLOCKS);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Palet1x1_1.Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}