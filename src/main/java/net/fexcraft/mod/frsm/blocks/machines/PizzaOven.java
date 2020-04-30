package net.fexcraft.mod.frsm.blocks.machines;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "electric_pizza_oven", tileentity = PizzaOven.Entity.class, item = PaintableInfo.class)
public class PizzaOven extends BasicContainer4R {

	public PizzaOven() {
		super(Material.IRON);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new PizzaOven.Entity();
	}
	
	public static class Entity extends PaintableTileEntity {}
	
}