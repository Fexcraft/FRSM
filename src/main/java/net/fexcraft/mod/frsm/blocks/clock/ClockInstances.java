package net.fexcraft.mod.frsm.blocks.clock;

import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.lib.api.block.fBlock;

public class ClockInstances {
	
	@fBlock(modid = FI.MODID, name = "clock1", item = ClockBaseItem.class)
	public static class Clock1 extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock1c", item = ClockBaseItem.class)
	public static class Clock1C extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock2", item = ClockBaseItem.class)
	public static class Clock2 extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock2c", item = ClockBaseItem.class)
	public static class Clock2C extends ClockBase {}
	
	
}