package net.fexcraft.mod.frsm.blocks.clock;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.util.FI;

public class ClockInstances {
	
	@fBlock(modid = FI.MODID, name = "clock1", tileentity = Clock1TE.class, item = ClockBaseItem.class)
	public static class Clock1 extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock1c", tileentity = Clock1CTE.class, item = ClockBaseItem.class)
	public static class Clock1C extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock1w", tileentity = Clock1WTE.class, item = ClockBaseItem.class)
	public static class Clock1W extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock2", tileentity = Clock2TE.class, item = ClockBaseItem.class)
	public static class Clock2 extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock2c", tileentity = Clock2CTE.class, item = ClockBaseItem.class)
	public static class Clock2C extends ClockBase {}
	
	@fBlock(modid = FI.MODID, name = "clock2w", tileentity = Clock2WTE.class, item = ClockBaseItem.class)
	public static class Clock2W extends ClockBase {}
	
	//
	
	public static class Clock1TE extends ClockBaseTileEntity {}
	
	public static class Clock1CTE extends ClockBaseTileEntity {}
	
	public static class Clock1WTE extends ClockBaseTileEntity {}
	
	public static class Clock2TE extends ClockBaseTileEntity {}
	
	public static class Clock2CTE extends ClockBaseTileEntity {}
	
	public static class Clock2WTE extends ClockBaseTileEntity {}
	
	
}