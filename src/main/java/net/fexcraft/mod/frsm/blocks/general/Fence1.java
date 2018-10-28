package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.ConnectableBlock;

@fBlock(modid = FI.MODID, name = "fence1")
public class Fence1 extends ConnectableBlock {
	
	public Fence1(){ super();
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(5.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(CD.BLOCKS);
    }
	
}