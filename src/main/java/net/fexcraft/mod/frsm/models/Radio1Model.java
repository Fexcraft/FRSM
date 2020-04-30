// Date: 21.02.2015 15:06:19

package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.mod.frsm.blocks.machines.Radio1;
import net.fexcraft.mod.frsm.util.block.TileRenderer4R;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Radio1Model extends ModelBase{

    ModelRenderer Shape1;
    ModelRenderer Shape2;

    public Radio1Model(){
    	textureWidth = 32; textureHeight = 32;
    	Shape1 = new ModelRenderer(this, 0, 0);
    	Shape1.addBox(0F, 0F, 0F, 8, 4, 2);
    	Shape1.setRotationPoint(-4F, 20F, -1F);
    	Shape1.setTextureSize(32, 32);
    	Shape1.mirror = true;
    	setRotation(Shape1, 0F, 0F, 0F);
    	Shape2 = new ModelRenderer(this, 0, 7);
    	Shape2.addBox(0F, 0F, 0F, 8, 1, 0);
    	Shape2.setRotationPoint(-4F, 20F, 1F);
    	Shape2.setTextureSize(32, 32);
    	Shape2.mirror = true;
    	setRotation(Shape2, 0F, 0F, -0.8726646F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	setRotationAngles(f, f1, f2, f3, f4, f5);
    	Shape1.render(f5);
    	Shape2.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z){
    	model.rotateAngleX = x;
    	model.rotateAngleY = y;
    	model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }

	public static Radio1Model INSTANCE = new Radio1Model();
    
    @fTESR
    public static class Renderer extends TileRenderer4R<Radio1.Entity> {
    	
    	public Renderer(){ super("frsm:textures/blocks/Radio1.png", null); }

    	@Override
    	public void renderModel(Radio1.Entity tileentity, float partialticks, int destroystage){
    		INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    	}
    	
    }

}
