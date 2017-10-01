package net.fexcraft.mod.frsm.blocks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Car1DModel extends ModelBase{
	
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
  
  public Car1DModel(){
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 10, 1, 10);
      Shape1.setRotationPoint(-5F, 23F, -5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 12);
      Shape2.addBox(0F, 0F, 0F, 6, 1, 1);
      Shape2.setRotationPoint(-3F, 22.3F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, -0.7853982F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 15);
      Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape3.setRotationPoint(-3F, 22F, -1F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 15);
      Shape4.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape4.setRotationPoint(2F, 22F, -1F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 15);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape5.setRotationPoint(-3F, 22F, 2F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 15);
      Shape6.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape6.setRotationPoint(2F, 22F, 2F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 18);
      Shape7.addBox(0F, 0F, 0F, 8, 1, 4);
      Shape7.setRotationPoint(-4F, 21.5F, -1F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 24);
      Shape8.addBox(0F, 0F, 0F, 3, 1, 4);
      Shape8.setRotationPoint(-4F, 21.2F, -1F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, -0.1047198F);
      Shape9 = new ModelRenderer(this, 15, 24);
      Shape9.addBox(0F, 0F, 0F, 3, 1, 4);
      Shape9.setRotationPoint(1F, 20.9F, -1F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0.0349066F);
      Shape10 = new ModelRenderer(this, 26, 12);
      Shape10.addBox(0F, 0F, 0F, 3, 2, 4);
      Shape10.setRotationPoint(-1.5F, 20F, -1F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, -0.0523599F);
      Shape11 = new ModelRenderer(this, 15, 13);
      Shape11.addBox(0F, 0F, 0F, 1, 0, 4);
      Shape11.setRotationPoint(3.5F, 21F, -1F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, -0.296706F);
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
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z){
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
