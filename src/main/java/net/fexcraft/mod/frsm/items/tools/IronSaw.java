package net.fexcraft.mod.frsm.items.tools;

import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.lib.api.item.fItem;
import net.minecraft.item.ItemAxe;

@fItem(modid = FI.MODID, name = "ironsaw")
public class IronSaw extends ItemAxe {
	
	public IronSaw(){
        super(ToolMaterial.DIAMOND);
        this.setMaxStackSize(1);
        this.setCreativeTab(CD.TOOLS);
	}
	
}