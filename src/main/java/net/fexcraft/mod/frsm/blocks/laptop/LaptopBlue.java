package net.fexcraft.mod.frsm.blocks.laptop;

import java.util.List;

import javax.annotation.Nullable;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.registry.ItemBlock16;
import net.fexcraft.lib.mc.utils.Formatter;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4R;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "laptop_blue", item = LaptopBlue.IB.class)
public class LaptopBlue extends Basic4R {
    
        
	public LaptopBlue(){
		super(Material.GLASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(2.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}
	
	public static class IB extends ItemBlock16 {
		
		public IB(Block block){
			super(block);
		}
		
		@Override
		public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced){
			tooltip.add(Formatter.format("&9Ufuntu OS"));
		}
		
	}
	
}