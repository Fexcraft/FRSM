// Date: 14.02.2015 20:04:03

package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class BusStation extends ModelBase {
	
	protected static BusStation INSTANCE = new BusStation();

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

	public BusStation(){
		textureWidth = 128;
		textureHeight = 64;
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 48, 30, 1);
		Shape1.setRotationPoint(-24F, -6F, 7F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 32);
		Shape2.addBox(0F, 0F, 0F, 48, 1, 6);
		Shape2.setRotationPoint(-24F, -9F, 2.9F);
		Shape2.setTextureSize(128, 64);
		Shape2.mirror = true;
		setRotation(Shape2, -0.5235988F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 40);
		Shape3.addBox(0F, 0F, 0F, 48, 1, 14);
		Shape3.setRotationPoint(-24F, -9F, -11F);
		Shape3.setTextureSize(128, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 109, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 32, 2);
		Shape4.setRotationPoint(22F, -8F, -8F);
		Shape4.setTextureSize(128, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 109, 0);
		Shape5.addBox(0F, 0F, 0F, 1, 32, 2);
		Shape5.setRotationPoint(-23F, -8F, -8F);
		Shape5.setTextureSize(128, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 100, 0);
		Shape6.addBox(0F, 0F, 0F, 1, 4, 2);
		Shape6.setRotationPoint(20F, 20F, 4F);
		Shape6.setTextureSize(128, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 100, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 4, 2);
		Shape7.setRotationPoint(20F, 20F, 0F);
		Shape7.setTextureSize(128, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 100, 0);
		Shape8.addBox(0F, 0F, 0F, 1, 4, 2);
		Shape8.setRotationPoint(-21F, 20F, 4F);
		Shape8.setTextureSize(128, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 100, 0);
		Shape9.addBox(0F, 0F, 0F, 1, 4, 2);
		Shape9.setRotationPoint(-21F, 20F, 0F);
		Shape9.setTextureSize(128, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 56);
		Shape10.addBox(0F, 0F, 0F, 3, 1, 7);
		Shape10.setRotationPoint(19F, 19F, -0.5F);
		Shape10.setTextureSize(128, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 56);
		Shape11.addBox(0F, 0F, 0F, 3, 1, 7);
		Shape11.setRotationPoint(-22F, 19F, -0.5F);
		Shape11.setTextureSize(128, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 21, 56);
		Shape12.addBox(0F, 0F, 0F, 48, 1, 2);
		Shape12.setRotationPoint(-24F, 18F, 5F);
		Shape12.setTextureSize(128, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 21, 60);
		Shape13.addBox(0F, 0F, 0F, 48, 1, 3);
		Shape13.setRotationPoint(-24F, 18F, 1.5F);
		Shape13.setTextureSize(128, 64);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 21, 56);
		Shape14.addBox(0F, 0F, 0F, 48, 1, 2);
		Shape14.setRotationPoint(-24F, 18F, -1F);
		Shape14.setTextureSize(128, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
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
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}
	
	@fTESR
	public static class Renderer extends FTESR_4R<net.fexcraft.mod.frsm.blocks.other.BusStation.Entity> {
	       
		public Renderer(){
			super(new ResourceLocation("frsm:textures/blocks/busstation.png"), null);
		}
		
		@Override
		public void renderModel(net.fexcraft.mod.frsm.blocks.other.BusStation.Entity tileentity, float partialticks, int destroystage){
			INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		
	}

}
