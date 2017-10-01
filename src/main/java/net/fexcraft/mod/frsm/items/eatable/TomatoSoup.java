package net.fexcraft.mod.frsm.items.eatable;

import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.lib.api.item.fItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@fItem(modid = FI.MODID, name = "tomatosoup")
public class TomatoSoup extends ItemFood {

	public TomatoSoup(){
		super(2, 0.4F, true);
		this.setMaxStackSize(16);
		this.setCreativeTab(CD.EATABLES);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
		player.inventory.addItemStackToInventory(new ItemStack(Items.BOWL, 1, 0));
	}
	
}