package net.fexcraft.mod.frsm.util;

import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.property.IUnlistedProperty;

public class Properties {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	public static final PropertyEnum<EnumDyeColor> DYECOLOR = PropertyEnum.create("color", EnumDyeColor.class);
	public static final PropertyBool OPEN = PropertyBool.create("open");
    public static final PropertyInteger ROTATION = PropertyInteger.create("rotation", 0, 15);
	
	public static final IUnlistedProperty<Boolean> CLOSED = new IUnlistedProperty<Boolean>(){

		@Override
		public String getName(){
			return "closed";
		}

		@Override
		public boolean isValid(Boolean value){
			return true;
		}

		@Override
		public Class<Boolean> getType(){
			return Boolean.class;
		}

		@Override
		public String valueToString(Boolean value){
			return value + "";
		}
		
	};
	
	public static final IUnlistedProperty<Integer> COLOR = new IUnlistedProperty<Integer>(){

		@Override
		public String getName(){
			return "color";
		}

		@Override
		public boolean isValid(Integer value){
			return value >= 0 && value < 167772166;
		}

		@Override
		public Class<Integer> getType(){
			return Integer.class;
		}

		@Override
		public String valueToString(Integer value){
			return Integer.toHexString(value);
		}
		
	};
	
	public static final IUnlistedProperty<Integer> PCHARDWAREPOS = new IUnlistedProperty<Integer>(){

		@Override
		public String getName(){
			return "hardware_pos";
		}

		@Override
		public boolean isValid(Integer value){
			return value >= 0 && value < 3;
		}

		@Override
		public Class<Integer> getType(){
			return Integer.class;
		}

		@Override
		public String valueToString(Integer value){
			return Integer.toHexString(value);
		}
		
	};
	
}
