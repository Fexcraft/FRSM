package net.fexcraft.mod.frsm.blocks.printer;

import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.fexcraft.mod.lib.api.block.fBlock;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "printer", tileentity = PrinterEntity.class)
public class Printer extends FBC_4R {
	
    public Printer() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(2.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(CD.TECHNIC);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new PrinterEntity();
	}
	
}