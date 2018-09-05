package net.fexcraft.mod.frsm.items;

import net.fexcraft.mod.frsm.util.CD;
import net.minecraft.item.ItemAxe;

//@fItem(modid = FI.MODID, name = "ironsaw")
public class IronSaw extends ItemAxe {
	
	public IronSaw(){
        super(ToolMaterial.DIAMOND);
        this.setMaxStackSize(1);
        this.setCreativeTab(CD.TOOLS);
	}
	
}