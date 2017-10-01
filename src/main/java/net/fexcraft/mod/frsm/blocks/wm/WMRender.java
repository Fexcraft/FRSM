package net.fexcraft.mod.frsm.blocks.wm;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class WMRender extends FTESR_4R<WMEntity> {
       
	private static final WMModel model = new WMModel();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/washingmachine.png");
	}

	@Override
	public void renderModel(WMEntity tileentity, float partialticks, int destroystage){
		model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}
	
}