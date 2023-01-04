package net.fexcraft.mod.frsm.util;

import net.fexcraft.lib.mc.utils.Static;
import net.minecraft.util.math.AxisAlignedBB;

public class AABBs {
	
	public static final AxisAlignedBB HIGH_2 = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
	public static final AxisAlignedBB BARREL = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
	public static final AxisAlignedBB BARREL_DOWN = new AxisAlignedBB(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
	public static final AxisAlignedBB PIZZA_OVEN = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 9 * Static.sixteenth, 1.0F);
	public static final AxisAlignedBB CHAIR = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
	public static final AxisAlignedBB TRASHCAN_OPEN = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.375F, 1.0F);
	public static final AxisAlignedBB PILLAR = new AxisAlignedBB(0.25F, 0F, 0.25F, 0.75F, 1F, 0.75F);

}
