package net.fexcraft.mod.frsm.blocks.clock;

import java.util.List;
import javax.annotation.Nullable;
import net.fexcraft.mod.lib.util.common.Formatter;
import net.fexcraft.mod.lib.util.registry.ItemBlock16;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ClockBaseItem extends ItemBlock16 {
	
	private EnumClock clocktype;
	
	public ClockBaseItem(Block block){
		super(block);
		clocktype = EnumClock.fromClass(block.getClass());
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced){
		if(clocktype.isWorldTime()){
		   	tooltip.add(Formatter.format("&7World Time"));
			return;
		}
		if(clocktype.hasOffset()){
		   	tooltip.add(Formatter.format("&7Custom &6GMT &7Time"));
		   	tooltip.add(Formatter.format("&o&aChange time offset by using a FRSM TV Controller, Vanilla Clock/Compass, or a generic Tool."));
		}
		else{
		   	tooltip.add(Formatter.format("&7System Time"));
		}
		/*switch(clocktype){
			case CLOCK1_OFFSET:
			case CLOCK2_OFFSET:
			   	tooltip.add(Formatter.format("&7Custom &8GMT &7Time"));
				break;
			case CLOCK1_SYSTEM:
			case CLOCK2_SYSTEM:
			   	tooltip.add(Formatter.format("&7System Time"));
				break;
			default:
				break;
		}*/
	}
	
}