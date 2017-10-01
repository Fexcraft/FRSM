package net.fexcraft.mod.frsm.blocks.streetlamps;

import org.lwjgl.opengl.GL11;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.util.ResourceLocation;

@fTESR
public class StreetLampPostRender extends FTESR_4R<StreetLampPostEntity> {
	
	private static final ModelStreetLampPost model = new ModelStreetLampPost();
	
	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("minecraft:textures/blocks/anvil_base.png");
	}

	@Override
	public void renderModel(StreetLampPostEntity tileentity, float partialticks, int destroystage){
		model.render(model.base);
		boolean[] arr = tileentity.getArray();
		if(arr[0]){
			GL11.glRotatef(-90, 1, 0, 0);
			GL11.glTranslatef(0, -1.0f,  1f);
			model.render(model.r0);
			GL11.glTranslatef(0,  1.0f, -1f);
			GL11.glRotatef( 90, 1, 0, 0);
		}
		if(arr[1]){
			GL11.glRotatef(-90, 1, 0, 0);
			GL11.glTranslatef(0,  1f,  1f);
			GL11.glRotatef(-180, 0, 0, 1);
			model.render(model.r0);
			GL11.glRotatef( 180, 0, 0, 1);
			GL11.glTranslatef(0, -1f, -1f);
			GL11.glRotatef( 90, 1, 0, 0);
		}
		if(arr[2]){
			GL11.glRotatef(-90, 1, 0, 0);
			GL11.glTranslatef(-1f, 0,  1f);
			GL11.glRotatef(-90, 0, 0, 1);
			model.render(model.r0);
			GL11.glRotatef( 90, 0, 0, 1);
			GL11.glTranslatef( 1f, 0, -1f);
			GL11.glRotatef( 90, 1, 0, 0);
		}
		if(arr[3]){
			GL11.glRotatef(-90, 1, 0, 0);
			GL11.glTranslatef( 1f, 0,  1f);
			GL11.glRotatef( 90, 0, 0, 1);
			model.render(model.r0);
			GL11.glRotatef(-90, 0, 0, 1);
			GL11.glTranslatef(-1f,  0, -1f);
			GL11.glRotatef( 90, 1, 0, 0);
		}
		if(arr[4]){
			GL11.glRotatef( 180, 1, 0, 0);
			GL11.glTranslatef(0, -2f, 0);
			model.render(model.r0);
			GL11.glTranslatef(0,  2f, 0);
			GL11.glRotatef(-180, 1, 0, 0);
		}
		if(arr[5]){
			model.render(model.r0);
		}
	}
	
}