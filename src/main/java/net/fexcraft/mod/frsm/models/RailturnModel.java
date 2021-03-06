package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.mod.frsm.blocks.rail.RailTurn;
import net.fexcraft.mod.frsm.util.block.TileRenderer4R;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class RailturnModel extends ModelBase {
	
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape12;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape13;
	ModelRenderer Shape14;

	public RailturnModel(){
		textureWidth = 64; textureHeight = 32;
		Shape1 = new ModelRenderer(this, 0, 3);
		Shape1.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape1.setRotationPoint(-7.5F, 23.8F, -3F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 6, 1, 1);
		Shape2.setRotationPoint(-3F, 23.8F, -7.5F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 3);
		Shape12.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape12.setRotationPoint(-5.5F, 23.8F, -3F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0.2617994F, 0F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 6, 1, 1);
		Shape3.setRotationPoint(-3F, 23.8F, -5.5F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, -0.2617994F, 0F);
		Shape4 = new ModelRenderer(this, 0, 3);
		Shape4.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape4.setRotationPoint(-4.2F, 23.8F, -3.5F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0.7853982F, 0F);
		Shape5 = new ModelRenderer(this, 0, 12);
		Shape5.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape5.setRotationPoint(-2F, 23.5F, -8F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 17);
		Shape6.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape6.setRotationPoint(1F, 23.5F, -8F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 23);
		Shape7.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape7.setRotationPoint(-8F, 23.5F, 1F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 26);
		Shape8.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape8.setRotationPoint(-8F, 23.5F, -2F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 26);
		Shape9.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape9.setRotationPoint(-5.5F, 23.5F, -2F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0.5235988F, 0F);
		Shape10 = new ModelRenderer(this, 0, 26);
		Shape10.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape10.setRotationPoint(-3.5F, 23.5F, -3F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 1.047198F, 0F);
		Shape11 = new ModelRenderer(this, 0, 23);
		Shape11.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape11.setRotationPoint(-4.5F, 23.5F, 1F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0.5235988F, 0F);
		Shape13 = new ModelRenderer(this, 0, 23);
		Shape13.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape13.setRotationPoint(-1F, 23.5F, -1F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 1.047198F, 0F);
		Shape14 = new ModelRenderer(this, 0, 29);
		Shape14.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape14.setRotationPoint(-1.5F, 23.5F, -0.5F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0.7853982F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape12.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

	public static RailturnModel INSTANCE = new RailturnModel();
	
	@fTESR
	public static class Renderer extends TileRenderer4R<RailTurn.Entity> {
		
		public Renderer(){ super("frsm:textures/blocks/railturn.png", null); }

		@Override
		public void renderModel(RailTurn.Entity tileentity, float partialticks, int destroystage){
			INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		
	}

}
