package net.fexcraft.mod.frsm.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import net.fexcraft.lib.mc.render.FCLBlockModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

public class FVTMFormatModel implements FCLBlockModel {
	
	protected int textureX, textureY;
	protected ArrayList<TurboList> groups = new ArrayList<>();

	@Override
	public Collection<ModelRendererTurbo> getPolygons(IBlockState state, EnumFacing side, Map<String, String> arguments, long rand){
		ArrayList<ModelRendererTurbo> model = new ArrayList<>();
		groups.forEach(group -> model.addAll(group));
		return model;
	}
	
	public static class TurboList extends ArrayList<ModelRendererTurbo> {

		public TurboList(String string){
			super();
		}
		
	}

}
