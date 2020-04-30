package net.fexcraft.mod.frsm.models;

import org.lwjgl.opengl.GL11;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.lib.tmt.GenericModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.blocks.streetlamps.StreetLampPostEntity;
import net.fexcraft.mod.frsm.util.block.TileRenderer4R;

public class ModelStreetLampPost extends GenericModelBase {
	
	private static final short ts = 16;

	public ModelStreetLampPost(){
		base = new ModelRendererTurbo[1];
		base[0] = new ModelRendererTurbo(this, 0, 0, ts, ts);
		base[0].addBox(-1F, -1F, -1F, 2, 2, 2, 0F);
		base[0].setRotationPoint(0F, 16F, 0F);
		//
		r0 = new ModelRendererTurbo[1];
		r0[0] = new ModelRendererTurbo(this, 0, 0, ts, ts);
		r0[0].addBox(-1F, 1F, -1F, 2, 7, 2, 0F);
		r0[0].setRotationPoint(0F, 16F, 0F);
		//
		translate(0F, 0F, 0F);
	}
	
	@fTESR
	public static class Renderer extends TileRenderer4R<StreetLampPostEntity> {
		
		public Renderer(){ super("minecraft:textures/blocks/anvil_base.png", new ModelStreetLampPost()); }

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
	
}