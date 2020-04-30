package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@fBlock(modid = FRSM.MODID, name = "stoneLightBox")
public class StoneLightBox extends Block {

    public StoneLightBox(){
        super(Material.WOOD);
        this.setLightLevel(0.8F);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setCreativeTab(FRSMTabs.BLOCKS);
    }
    
}