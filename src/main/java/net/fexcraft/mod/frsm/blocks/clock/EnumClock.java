package net.fexcraft.mod.frsm.blocks.clock;

import net.fexcraft.mod.frsm.blocks.clock.models.*;
import net.fexcraft.mod.frsm.blocks.clock.ClockInstances.*;
import net.fexcraft.mod.lib.tmt.Model;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public enum EnumClock {
	
	CLOCK1_SYSTEM(Clock1.class, false, false, "frsm:clock1"),
	CLOCK1_OFFSET(Clock1C.class, true, false, "frsm:clock1c"),
	CLOCK2_SYSTEM(Clock2.class, false, true , "frsm:clock2"),
	CLOCK2_OFFSET(Clock2C.class, true, true , "frsm:clock2c");
	
	private boolean hasOffset, hasBack;
	private Class<? extends ClockBase> clazz;
	private String regname;
	
	EnumClock(Class<? extends ClockBase> clazz, boolean bool1, boolean bool2, String regname){
		this.clazz = clazz;
		this.hasOffset = bool1;
		this.hasBack = bool2;
		this.regname = regname;
	}
	
	public boolean hasOffset(){
		return this.hasOffset;
	}
	
	@SideOnly(Side.CLIENT)
	public Model<?> getModel(){
		switch(this){
			case CLOCK1_SYSTEM:
			case CLOCK1_OFFSET:{
				return ModelClock1.INSTANCE;
			}
			case CLOCK2_SYSTEM:
			case CLOCK2_OFFSET:{
				return ModelClock2.INSTANCE;
			}
		}
		return null;
	}

	public static final EnumClock fromClass(Class<? extends Block> clazz){
		for(EnumClock clock : values()){
			if(clock.clazz.equals(clazz)){
				return clock;
			}
		}
		return null;
	}

	public ResourceLocation getTexture(){
		switch(this){
			case CLOCK1_OFFSET:
			case CLOCK1_SYSTEM:
			case CLOCK2_OFFSET:
			case CLOCK2_SYSTEM:{
				return new ResourceLocation("frsm:textures/blocks/clock1.png");
			}
			default:
				break;
		}
		return null;
	}

	public boolean hasBackSide(){
		return this.hasBack;
	}
	
	public String getRegistryName(){
		return regname;
	}
	
	public static final EnumClock fromString(String str){
		for(EnumClock clock : values()){
			if(clock.regname.equals(str)){
				return clock;
			}
		}
		return CLOCK1_SYSTEM;
	}
	
}