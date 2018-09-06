// Date: 17.02.2015 21:02:44

package net.fexcraft.mod.frsm.models;

import net.fexcraft.mod.frsm.blocks.machines.VM.VMEntity;
import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VMModel extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape171;
	ModelRenderer Shape172;
	ModelRenderer Shape173;
	ModelRenderer Shape181;
	ModelRenderer Shape182;
	ModelRenderer Shape183;
	ModelRenderer Shape184;
	ModelRenderer Shape191;
	ModelRenderer Shape192;
	ModelRenderer Shape201;
	ModelRenderer Shape202;
	ModelRenderer Shape211;
	ModelRenderer Shape212;
	ModelRenderer Shape221;
	ModelRenderer Shape222;
	ModelRenderer Shape223;

	public VMModel(){
		textureWidth = 256; textureHeight = 128;
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 4, 16);
		Shape1.setRotationPoint(-8F, 20F, -8F);
		Shape1.setTextureSize(256, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 21);
		Shape2.addBox(0F, 23F, 0F, 3, 26, 16);
		Shape2.setRotationPoint(5F, -29F, -8F);
		Shape2.setTextureSize(256, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 39, 21);
		Shape3.addBox(0F, 0F, 0F, 1, 26, 16);
		Shape3.setRotationPoint(-8F, -6F, -8F);
		Shape3.setTextureSize(256, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 65, 0);
		Shape4.addBox(0F, 0F, 0F, 12, 26, 1);
		Shape4.setRotationPoint(-7F, -6F, 7F);
		Shape4.setTextureSize(256, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 92, 0);
		Shape5.addBox(0F, 0F, 0F, 16, 2, 16);
		Shape5.setRotationPoint(-8F, -8F, -8F);
		Shape5.setTextureSize(256, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 23, 21);
		Shape6.addBox(0F, 0F, 0F, 12, 2, 3);
		Shape6.setRotationPoint(-7F, 15F, -8F);
		Shape6.setTextureSize(256, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 74, 28);
		Shape7.addBox(0F, 0F, 0F, 12, 0, 8);
		Shape7.setRotationPoint(-7F, 15F, -1F);
		Shape7.setTextureSize(256, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 74, 28);
		Shape8.addBox(0F, 0F, 0F, 12, 0, 8);
		Shape8.setRotationPoint(-7F, 10F, -1F);
		Shape8.setTextureSize(256, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 74, 28);
		Shape9.addBox(0F, 0F, 0F, 12, 0, 8);
		Shape9.setRotationPoint(-7F, 5F, -1F);
		Shape9.setTextureSize(256, 128);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 74, 37);
		Shape10.addBox(0F, 0F, 0F, 12, 4, 6);
		Shape10.setRotationPoint(-7F, 16F, 1F);
		Shape10.setTextureSize(256, 128);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 74, 28);
		Shape11.addBox(0F, 0F, 0F, 12, 0, 8);
		Shape11.setRotationPoint(-7F, 0F, -1F);
		Shape11.setTextureSize(256, 128);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 74, 48);
		Shape12.addBox(0F, 0F, 0F, 12, 1, 12);
		Shape12.setRotationPoint(-7F, -7F, -5F);
		Shape12.setTextureSize(256, 128);
		Shape12.mirror = true;
		setRotation(Shape12, -0.1745329F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 115, 19);
		Shape13.addBox(0F, 0F, 0F, 12, 21, 0);
		Shape13.setRotationPoint(-7F, -6F, -7F);
		Shape13.setTextureSize(256, 128);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 124, 34);
		Shape14.addBox(0F, 0F, 0F, 0, 17, 7);
		Shape14.setRotationPoint(-4F, -2F, 0F);
		Shape14.setTextureSize(256, 128);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 124, 34);
		Shape15.addBox(0F, 0F, 0F, 0, 17, 7);
		Shape15.setRotationPoint(-1F, -2F, 0F);
		Shape15.setTextureSize(256, 128);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 124, 34);
		Shape16.addBox(0F, 0F, 0F, 0, 17, 7);
		Shape16.setRotationPoint(2F, -2F, 0F);
		Shape16.setTextureSize(256, 128);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape171 = new ModelRenderer(this, 92, 19);
		Shape171.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape171.setRotationPoint(-0.5F, 11F, 5F);
		Shape171.setTextureSize(256, 128);
		Shape171.mirror = true;
		setRotation(Shape171, 0F, 0F, 0F);
		Shape172 = new ModelRenderer(this, 92, 19);
		Shape172.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape172.setRotationPoint(-0.5F, 11F, 3F);
		Shape172.setTextureSize(256, 128);
		Shape172.mirror = true;
		setRotation(Shape172, 0F, 0F, 0F);
		Shape173 = new ModelRenderer(this, 92, 19);
		Shape173.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape173.setRotationPoint(-0.5F, 11F, 1F);
		Shape173.setTextureSize(256, 128);
		Shape173.mirror = true;
		setRotation(Shape173, 0F, 0F, 0F);
		Shape181 = new ModelRenderer(this, 92, 25);
		Shape181.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape181.setRotationPoint(-3.5F, 4F, 6F);
		Shape181.setTextureSize(256, 128);
		Shape181.mirror = true;
		setRotation(Shape181, 0F, 0F, 0F);
		Shape182 = new ModelRenderer(this, 92, 25);
		Shape182.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape182.setRotationPoint(-3.5F, 4F, 4F);
		Shape182.setTextureSize(256, 128);
		Shape182.mirror = true;
		setRotation(Shape182, 0F, 0F, 0F);
		Shape183 = new ModelRenderer(this, 92, 25);
		Shape183.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape183.setRotationPoint(-3.5F, 4F, 2F);
		Shape183.setTextureSize(256, 128);
		Shape183.mirror = true;
		setRotation(Shape183, 0F, 0F, 0F);
		Shape184 = new ModelRenderer(this, 92, 25);
		Shape184.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape184.setRotationPoint(-3.5F, 4F, 0F);
		Shape184.setTextureSize(256, 128);
		Shape184.mirror = true;
		setRotation(Shape184, 0F, 0F, 0F);
		Shape191 = new ModelRenderer(this, 99, 19);
		Shape191.addBox(0F, 0F, 0F, 2, 3, 2);
		Shape191.setRotationPoint(-6.5F, -3F, 3F);
		Shape191.setTextureSize(256, 128);
		Shape191.mirror = true;
		setRotation(Shape191, 0F, 0F, 0F);
		Shape192 = new ModelRenderer(this, 99, 19);
		Shape192.addBox(0F, 0F, 0F, 2, 3, 2);
		Shape192.setRotationPoint(-6.5F, -3F, 0F);
		Shape192.setTextureSize(256, 128);
		Shape192.mirror = true;
		setRotation(Shape192, 0F, 0F, 0F);
		Shape201 = new ModelRenderer(this, 58, 31);
		Shape201.addBox(0F, 0F, 0F, 2, 3, 2);
		Shape201.setRotationPoint(-0.5F, 2F, 3F);
		Shape201.setTextureSize(256, 128);
		Shape201.mirror = true;
		setRotation(Shape201, 0F, 0F, 0F);
		Shape202 = new ModelRenderer(this, 58, 31);
		Shape202.addBox(0F, 0F, 0F, 2, 3, 2);
		Shape202.setRotationPoint(-0.5F, 2F, 0F);
		Shape202.setTextureSize(256, 128);
		Shape202.mirror = true;
		setRotation(Shape202, 0F, 0F, 0F);
		Shape211 = new ModelRenderer(this, 48, 33);
		Shape211.addBox(0F, 0F, 0F, 2, 2, 1);
		Shape211.setRotationPoint(-6.5F, 13F, 2F);
		Shape211.setTextureSize(256, 128);
		Shape211.mirror = true;
		setRotation(Shape211, 0F, 0F, 0F);
		Shape212 = new ModelRenderer(this, 48, 33);
		Shape212.addBox(0F, 0F, 0F, 2, 2, 1);
		Shape212.setRotationPoint(-6.5F, 13F, 0F);
		Shape212.setTextureSize(256, 128);
		Shape212.mirror = true;
		setRotation(Shape212, 0F, 0F, 0F);
		Shape221 = new ModelRenderer(this, 40, 31);
		Shape221.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape221.setRotationPoint(2.5F, 6F, 5F);
		Shape221.setTextureSize(256, 128);
		Shape221.mirror = true;
		setRotation(Shape221, -0.0872665F, 0F, 0F);
		Shape222 = new ModelRenderer(this, 40, 31);
		Shape222.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape222.setRotationPoint(2.5F, 6F, 3F);
		Shape222.setTextureSize(256, 128);
		Shape222.mirror = true;
		setRotation(Shape222, -0.0872665F, 0F, 0F);
		Shape223 = new ModelRenderer(this, 40, 31);
		Shape223.addBox(0F, 0F, 0F, 2, 4, 1);
		Shape223.setRotationPoint(2.5F, 6F, 1F);
		Shape223.setTextureSize(256, 128);
		Shape223.mirror = true;
		setRotation(Shape223, -0.0872665F, 0F, 0F);
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
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape171.render(f5);
		Shape172.render(f5);
		Shape173.render(f5);
		Shape183.render(f5);
		Shape182.render(f5);
		Shape183.render(f5);
		Shape184.render(f5);
		Shape191.render(f5);
		Shape192.render(f5);
		Shape201.render(f5);
		Shape202.render(f5);
		Shape211.render(f5);
		Shape212.render(f5);
		Shape221.render(f5);
		Shape222.render(f5);
		Shape223.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

	public static VMModel INSTANCE = new VMModel();
	
	@fTESR
	public static class Renderer extends FTESR_4R<VMEntity> {
		
		public Renderer(){ super("frsm:textures/blocks/vendingmachine.png", null); }

		@Override
		public void renderModel(VMEntity tileentity, float partialticks, int destroystage){
			INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		
	}

}
