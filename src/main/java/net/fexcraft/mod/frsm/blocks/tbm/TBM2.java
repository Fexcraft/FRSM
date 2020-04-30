package net.fexcraft.mod.frsm.blocks.tbm;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4RFalling;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "tbm2", tileentity = TBM2.TE.class)
public class TBM2 extends BasicContainer4RFalling {
	
	public TBM2() {
		super(Material.WOOD);
		this.setHarvestLevel("axe", 1);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(FRSMTabs.EXPERIMENTAL);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new TE();
	}
	    
	public class TE extends TileEntity {}
	
}