package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@fBlock(modid = FI.MODID, name = "decoblock2", burn_time = 300)
public class DecoBlock2 extends Block{

    public DecoBlock2(){
        super(Material.WOOD);
        this.setHarvestLevel("axe", 1);
        this.setHardness(1.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(CD.BLOCKS);
    }
    
}