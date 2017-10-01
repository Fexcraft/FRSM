package net.fexcraft.mod.frsm.blocks.fridge;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.fexcraft.mod.lib.util.render.RGB;
import net.minecraft.util.ResourceLocation;

@fTESR
public class FridgeRenderer extends FTESR_4R<FridgeTileEntity> {
	
	private static final FridgeModel model = new FridgeModel();
	
	private static final  ResourceLocation texture = new ResourceLocation("frsm:textures/blocks/fridge.png");

	@Override
	public ResourceLocation getResourceLocation(){
		return texture;
	}

	@Override
	public void renderModel(FridgeTileEntity tileentity, float partialticks, int destroystage) {
		boolean open = tileentity.getState();
		RGB color = tileentity.getColor();
		
		model.render(model.base);
		if(open == true){
			model.render(model.open);
		}
		if(open == false){
			model.render(model.closed);
		}
		color.glColorApply();
		model.render(model.r0);
		if(open == true){
			model.render(model.r2);
		}
		if(open == false){
			model.render(model.r1);
		}
		RGB.glColorReset();
	}
	
}