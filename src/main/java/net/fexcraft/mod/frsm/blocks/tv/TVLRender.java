package net.fexcraft.mod.frsm.blocks.tv;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class TVLRender extends FTESR_4R<TVL.TEB> {
	
	private static final TVLModel model = new TVLModel();
			
	public int adjustAngleBy(){
		return 0;
	}
	
	public String getTexturePath(){
		return "frsm:textures/blocks/TVL.png";
	}
	
	private static final ResourceLocation texture = new ResourceLocation("frsm:textures/blocks/TVL.png");
	
	@Override
	public ResourceLocation getResourceLocation(){
		return texture ;
	}

	@Override
	public void renderModel(TVL.TEB tileentity, float partialticks, int destroystage) {
		model.render();
	}
	
}