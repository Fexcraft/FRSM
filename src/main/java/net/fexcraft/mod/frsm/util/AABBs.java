package net.fexcraft.mod.frsm.util;

import net.fexcraft.lib.mc.utils.Static;
import net.minecraft.util.math.AxisAlignedBB;

public class AABBs {
	
	public static final AxisAlignedBB HIGH_2 = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
	public static final AxisAlignedBB BARREL = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
	public static final AxisAlignedBB BARREL_DOWN = new AxisAlignedBB(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
	public static final AxisAlignedBB PIZZA_OVEN = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 9 * Static.sixteenth, 1.0F);
	public static final AxisAlignedBB PRINTER = new AxisAlignedBB(0.0F + Static.sixteenth, 0.0F + Static.sixteenth, 0.0F, 1.0F - Static.sixteenth, 11 * Static.sixteenth, 1.0F - Static.sixteenth);

}
