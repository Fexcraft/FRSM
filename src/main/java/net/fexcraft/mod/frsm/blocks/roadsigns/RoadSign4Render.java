package net.fexcraft.mod.frsm.blocks.roadsigns;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class RoadSign4Render extends FTESR_4R<RoadSign4.TE> {
	
	private static final ModelRoadSign4 model = new ModelRoadSign4();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/RoadSign4.png");
	}

	@Override
	public void renderModel(RoadSign4.TE tileentity, float partialticks, int destroystage){
		model.render();
	}
	
}