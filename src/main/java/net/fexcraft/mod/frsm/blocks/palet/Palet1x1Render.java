package net.fexcraft.mod.frsm.blocks.palet;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class Palet1x1Render extends FTESR_4R<Palet1x1Entity> {
	
	private static final Palet1x1Model model = new Palet1x1Model();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/Palet1x1.png");
	}

	@Override
	public void renderModel(Palet1x1Entity tileentity, float partialticks, int destroystage){
		model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
	}
	
}