package net.fexcraft.mod.frsm.blocks.other;

import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.fexcraft.mod.lib.api.block.fBlock;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "window1", tileentity = Window.Entity.class, burn_time = 600)
public class Window extends FBC_4R {
	
	public Window() {
		super(Material.GLASS);
		this.setHarvestLevel("axe", 1);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(CD.BLOCKS);
	}
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Window.Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}