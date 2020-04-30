package net.fexcraft.mod.frsm.blocks.laptop;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4R;
import net.minecraft.block.material.Material;

@fBlock(modid = FRSM.MODID, name = "laptop_green")
public class LaptopGreen extends Basic4R {
    
	public LaptopGreen(){
		super(Material.GLASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(2.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}
	
}