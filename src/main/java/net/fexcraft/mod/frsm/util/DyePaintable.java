package net.fexcraft.mod.frsm.util;

import net.fexcraft.lib.common.math.RGB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface DyePaintable {

	void onPaintItemUse(RGB rgb, EnumDyeColor color, ItemStack stack, EntityPlayer player, BlockPos pos, World world);

}
