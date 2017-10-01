package net.fexcraft.mod.frsm.blocks.rail;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class RailturnRender extends FTESR_4R<RailTurnEntity> {
	
	private static final RailturnModel model = new RailturnModel();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/railturn.png");
	}

	@Override
	public void renderModel(RailTurnEntity tileentity, float partialticks, int destroystage){
		model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}
	
}