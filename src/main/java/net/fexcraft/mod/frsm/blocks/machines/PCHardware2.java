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

@fBlock(modid = FRSM.MODID, name = "pchardware2", tileentity = PCHardware2.Entity.class, item = PaintableInfo.class)
public class PCHardware2 extends BasicContainer4R {
    
    public PCHardware2() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(3.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(FRSMTabs.TECHNIC);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Entity();
	}
	
	public static class Entity extends PaintableTileEntity { public Entity(){ super(); } }
	
}