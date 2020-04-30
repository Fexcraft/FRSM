package net.fexcraft.mod.frsm.blocks.tv;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4RHalf;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "tvl_1", tileentity = TVL_1.TE.class)
public class TVL_1 extends BasicContainer4RHalf {
    
	public TVL_1() {
		super(Material.GRASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TE();
	}

	public static class TE extends TileEntity {
		
	}
	
}