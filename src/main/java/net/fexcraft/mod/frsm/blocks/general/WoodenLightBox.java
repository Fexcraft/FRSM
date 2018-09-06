package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.lib.api.block.fBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@fBlock(modid = FI.MODID, name = "woodenlightbox", burn_time = 400)
public class WoodenLightBox extends Block {
	
    public WoodenLightBox(){
        super(Material.WOOD);
        this.setLightLevel(0.6F);
        this.setHarvestLevel("axe", 1);
        this.setHardness(1.0F);
        this.setResistance(10.0F);
		this.setCreativeTab(CD.BLOCKS);
    }
	
}