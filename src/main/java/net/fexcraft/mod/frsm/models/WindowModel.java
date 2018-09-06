package net.fexcraft.mod.frsm.models;

import net.fexcraft.mod.frsm.blocks.other.Window;
import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WindowModel extends ModelBase {
	
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;

	public WindowModel(){
		textureWidth = 64; textureHeight = 32;
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 4);
		Shape1.setRotationPoint(-8F, 22F, -2F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 7);
		Shape2.addBox(0F, 0F, 0F, 3, 12, 2);
		Shape2.setRotationPoint(-8F, 10F, -1F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 7);
		Shape3.addBox(0F, 0F, 0F, 3, 12, 2);
		Shape3.setRotationPoint(5F, 10F, -1F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 22);
		Shape4.addBox(0F, 0F, 0F, 16, 2, 5);
		Shape4.setRotationPoint(-8F, 8F, -2.5F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 11, 7);
		Shape5.addBox(0F, 0F, 0F, 10, 12, 0);
		Shape5.setRotationPoint(-5F, 10F, 0F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 32, 7);
		Shape6.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6.setRotationPoint(-7F, 15F, -2F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 32, 10);
		Shape7.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7.setRotationPoint(-7F, 15F, -3F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

	public static WindowModel INSTANCE = new WindowModel();
	
	@fTESR
	public static class Renderer extends FTESR_4R<Window.Entity> {
		
		public Renderer(){ super("frsm:textures/blocks/window.png", null); }

		@Override
		public void renderModel(Window.Entity tileentity, float partialticks, int destroystage){
			INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		
	}

}