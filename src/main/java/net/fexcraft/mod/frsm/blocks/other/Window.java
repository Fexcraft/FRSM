package net.fexcraft.mod.frsm.blocks.other;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "window1", tileentity = Window.Entity.class, burn_time = 600)
public class Window extends BasicContainer4R {
	
	public Window() {
		super(Material.GLASS);
		this.setHarvestLevel("axe", 1);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(FRSMTabs.BLOCKS);
	}
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Window.Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}