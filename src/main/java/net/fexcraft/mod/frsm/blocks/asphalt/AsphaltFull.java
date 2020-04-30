package net.fexcraft.mod.frsm.blocks.asphalt;

import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

//@fBlock(modid = FI.MODID, name = "asphaltFull")
public class AsphaltFull extends Block {
	
	public AsphaltFull(){
        super(Material.IRON, MapColor.BLACK);
        this.setHarvestLevel("pickaxe", 0);
        this.setHardness(50.0F);
        this.setResistance(300.0F);
        this.setCreativeTab(FRSMTabs.STREETS);
    }
	
}