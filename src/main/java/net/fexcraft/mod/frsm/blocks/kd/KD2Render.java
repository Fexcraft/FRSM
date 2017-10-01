package net.fexcraft.mod.frsm.blocks.kd;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class KD2Render extends FTESR_4R<KD2Entity> {
	
	private static final KD2Model model = new KD2Model();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/KD2.png");
	}

	@Override
	public void renderModel(KD2Entity tileentity, float partialticks, int destroystage){
		model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}
	
}