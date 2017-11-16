package net.fexcraft.mod.frsm.blocks.shelf;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.client.Minecraft;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;

@fTESR
public class Shelf1Renderer extends FTESR_4R<Shelf1Entity> {
	
	private static final Shelf1Model model = new Shelf1Model();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return getFromColor(EnumDyeColor.BLACK);
	}
	
	private static ResourceLocation getFromColor(EnumDyeColor color){
		return new ResourceLocation("frsm:textures/blocks/shelf1_" + color.getMetadata() + ".png");
	}

	@Override
	public void renderModel(Shelf1Entity tileentity, float partialticks, int destroystage){
		boolean open = tileentity.getState();
		EnumDyeColor color = tileentity.getColor();
		Minecraft.getMinecraft().renderEngine.bindTexture(getFromColor(color));
		model.render(model.base);
		if(open == true){
			model.render(model.open);
		}
		if(open == false){
			model.render(model.closed);
		}
	}
	
}