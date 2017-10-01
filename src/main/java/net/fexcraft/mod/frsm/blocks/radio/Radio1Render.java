package net.fexcraft.mod.frsm.blocks.radio;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class Radio1Render extends FTESR_4R<Radio1Entity> {
	
	private static final Radio1Model model = new Radio1Model();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/Radio1.png");
	}

	@Override
	public void renderModel(Radio1Entity tileentity, float partialticks, int destroystage){
		model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}
	
}