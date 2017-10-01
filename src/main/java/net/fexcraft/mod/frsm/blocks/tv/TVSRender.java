package net.fexcraft.mod.frsm.blocks.tv;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class TVSRender extends FTESR_4R<TVSEntity> {
	
	private static final TVSModel model = new TVSModel();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/tvs.png");
	}

	@Override
	public void renderModel(TVSEntity tileentity, float partialticks, int destroystage){
		model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}
	
}