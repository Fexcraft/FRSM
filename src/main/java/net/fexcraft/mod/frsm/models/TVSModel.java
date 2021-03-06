package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.mod.frsm.blocks.tv.TVS;
import net.fexcraft.mod.frsm.util.block.TileRenderer4R;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TVSModel extends ModelBase {

	ModelRenderer Shape4;
	ModelRenderer Shape3;
	ModelRenderer Shape2;
	ModelRenderer Shape1;
	ModelRenderer Shape5;

	public TVSModel(){
		textureWidth = 64; textureHeight = 32;
		Shape4 = new ModelRenderer(this, 7, 12);
		Shape4.addBox(0F, 0F, 0F, 6, 3, 1);
		Shape4.setRotationPoint(-3F, 17F, 0F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 23);
		Shape3.addBox(0F, 0F, 0F, 12, 8, 1);
		Shape3.setRotationPoint(-6F, 13F, -1F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 12);
		Shape2.addBox(0F, 0F, 0F, 2, 3, 1);
		Shape2.setRotationPoint(-1F, 20F, 0F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 0, 17);
		Shape1.addBox(0F, 0F, 0F, 8, 1, 4);
		Shape1.setRotationPoint(-4F, 23F, -2F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 9);
		Shape5.addBox(0F, 0F, 0F, 6, 1, 1);
		Shape5.setRotationPoint(-3F, 18F, 0F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 2.379431F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape4.render(f5);
		Shape3.render(f5);
		Shape2.render(f5);
		Shape1.render(f5);
		Shape5.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

	public static TVSModel INSTANCE = new TVSModel();
	
	@fTESR
	public static class Renderer extends TileRenderer4R<TVS.Entity> {
		
		public Renderer(){ super("frsm:textures/blocks/tvs.png", null); }

		@Override
		public void renderModel(TVS.Entity tileentity, float partialticks, int destroystage){
			INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		
	}

}
