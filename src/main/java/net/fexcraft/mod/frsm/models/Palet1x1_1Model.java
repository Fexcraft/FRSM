//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.fexcraft.mod.frsm.models;

import net.fexcraft.mod.frsm.blocks.palet.Palet1x1_1;
import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Palet1x1_1Model extends ModelBase {
	
	ModelRenderer Box01, Box02, Box03;
	ModelRenderer Box04, Box05, Box06;
	ModelRenderer Box07, Box08, Box09;
	ModelRenderer Box10, Box11, Box12;
	ModelRenderer Box13, Box14, Box15;
	ModelRenderer Box16, Box17, Box18;
	ModelRenderer Box19, Box20, Box21;
	ModelRenderer Box22, Box23, Box24;
	ModelRenderer Box25, Box26, Box27;
	ModelRenderer Box28, Box29, Box30;
	ModelRenderer Box31, Box32, Box33;

	public Palet1x1_1Model(){
		textureWidth = 128; textureHeight = 128;
		Box01 = new ModelRenderer(this, 1, 1);
		Box01.addBox(0F, 0F, 0F, 3, 1, 16);
		Box01.setRotationPoint(5F, 23F, -8F);
		Box01.setTextureSize(128, 128);
		Box01.mirror = true;
		setRotation(Box01, 0F, 0F, 0F);
		Box02 = new ModelRenderer(this, 41, 1);
		Box02.addBox(0F, 0F, 0F, 3, 1, 16);
		Box02.setRotationPoint(-8F, 23F, -8F);
		Box02.setTextureSize(128, 128);
		Box02.mirror = true;
		setRotation(Box02, 0F, 0F, 0F);
		Box03 = new ModelRenderer(this, 81, 1);
		Box03.addBox(0F, 0F, 0F, 3, 1, 16);
		Box03.setRotationPoint(-1.5F, 23F, -8F);
		Box03.setTextureSize(128, 128);
		Box03.mirror = true;
		setRotation(Box03, 0F, 0F, 0F);
		Box04 = new ModelRenderer(this, 1, 1);
		Box04.addBox(0F, 0F, 0F, 3, 2, 3);
		Box04.setRotationPoint(-8F, 21F, -8F);
		Box04.setTextureSize(128, 128);
		Box04.mirror = true;
		setRotation(Box04, 0F, 0F, 0F);
		Box05 = new ModelRenderer(this, 25, 1);
		Box05.addBox(0F, 0F, 0F, 3, 2, 3);
		Box05.setRotationPoint(-1.5F, 21F, -8F);
		Box05.setTextureSize(128, 128);
		Box05.mirror = true;
		setRotation(Box05, 0F, 0F, 0F);
		Box06 = new ModelRenderer(this, 41, 1);
		Box06.addBox(0F, 0F, 0F, 3, 2, 3);
		Box06.setRotationPoint(5F, 21F, -8F);
		Box06.setTextureSize(128, 128);
		Box06.mirror = true;
		setRotation(Box06, 0F, 0F, 0F);
		Box07 = new ModelRenderer(this, 65, 1);
		Box07.addBox(0F, 0F, 0F, 3, 2, 3);
		Box07.setRotationPoint(-8F, 21F, 5F);
		Box07.setTextureSize(128, 128);
		Box07.mirror = true;
		setRotation(Box07, 0F, 0F, 0F);
		Box08 = new ModelRenderer(this, 81, 1);
		Box08.addBox(0F, 0F, 0F, 3, 2, 3);
		Box08.setRotationPoint(5F, 21F, 5F);
		Box08.setTextureSize(128, 128);
		Box08.mirror = true;
		setRotation(Box08, 0F, 0F, 0F);
		Box09 = new ModelRenderer(this, 105, 1);
		Box09.addBox(0F, 0F, 0F, 3, 2, 3);
		Box09.setRotationPoint(-1.5F, 21F, 5F);
		Box09.setTextureSize(128, 128);
		Box09.mirror = true;
		setRotation(Box09, 0F, 0F, 0F);
		Box10 = new ModelRenderer(this, 1, 25);
		Box10.addBox(0F, 0F, 0F, 16, 1, 3);
		Box10.setRotationPoint(-8F, 20F, -8F);
		Box10.setTextureSize(128, 128);
		Box10.mirror = true;
		setRotation(Box10, 0F, 0F, 0F);
		Box11 = new ModelRenderer(this, 41, 25);
		Box11.addBox(0F, 0F, 0F, 16, 1, 3);
		Box11.setRotationPoint(-8F, 20F, 5F);
		Box11.setTextureSize(128, 128);
		Box11.mirror = true;
		setRotation(Box11, 0F, 0F, 0F);
		Box12 = new ModelRenderer(this, 65, 25);
		Box12.addBox(0F, 0F, 0F, 2, 1, 16);
		Box12.setRotationPoint(-8F, 19F, -8F);
		Box12.setTextureSize(128, 128);
		Box12.mirror = true;
		setRotation(Box12, 0F, 0F, 0F);
		Box13 = new ModelRenderer(this, 1, 33);
		Box13.addBox(0F, 0F, 0F, 2, 1, 16);
		Box13.setRotationPoint(-5.5F, 19F, -8F);
		Box13.setTextureSize(128, 128);
		Box13.mirror = true;
		setRotation(Box13, 0F, 0F, 0F);
		Box14 = new ModelRenderer(this, 41, 33);
		Box14.addBox(0F, 0F, 0F, 2, 1, 16);
		Box14.setRotationPoint(6F, 19F, -8F);
		Box14.setTextureSize(128, 128);
		Box14.mirror = true;
		setRotation(Box14, 0F, 0F, 0F);
		Box15 = new ModelRenderer(this, 89, 33);
		Box15.addBox(0F, 0F, 0F, 2, 1, 16);
		Box15.setRotationPoint(3.5F, 19F, -8F);
		Box15.setTextureSize(128, 128);
		Box15.mirror = true;
		setRotation(Box15, 0F, 0F, 0F);
		Box16 = new ModelRenderer(this, 65, 49);
		Box16.addBox(0F, 0F, 0F, 2, 1, 16);
		Box16.setRotationPoint(0.5F, 19F, -8F);
		Box16.setTextureSize(128, 128);
		Box16.mirror = true;
		setRotation(Box16, 0F, 0F, 0F);
		Box17 = new ModelRenderer(this, 1, 57);
		Box17.addBox(0F, 0F, 0F, 2, 1, 16);
		Box17.setRotationPoint(-2.5F, 19F, -8F);
		Box17.setTextureSize(128, 128);
		Box17.mirror = true;
		setRotation(Box17, 0F, 0F, 0F);
		Box18 = new ModelRenderer(this, 25, 33);
		Box18.addBox(0F, 0F, 0F, 6, 5, 8);
		Box18.setRotationPoint(1.8F, 14F, -7.8F);
		Box18.setTextureSize(128, 128);
		Box18.mirror = true;
		setRotation(Box18, 0F, 0F, 0F);
		Box19 = new ModelRenderer(this, 25, 57);
		Box19.addBox(0F, 0F, 0F, 6, 5, 8);
		Box19.setRotationPoint(-4.5F, 14F, -7.8F);
		Box19.setTextureSize(128, 128);
		Box19.mirror = true;
		setRotation(Box19, 0F, 0F, 0F);
		Box20 = new ModelRenderer(this, 97, 65);
		Box20.addBox(0F, 0F, 0F, 6, 5, 7);
		Box20.setRotationPoint(1.8F, 14F, 0.800000000000001F);
		Box20.setTextureSize(128, 128);
		Box20.mirror = true;
		setRotation(Box20, 0F, 0F, 0F);
		Box21 = new ModelRenderer(this, 33, 73);
		Box21.addBox(0F, 0F, 0F, 6, 5, 7);
		Box21.setRotationPoint(-4.5F, 14F, 0.800000000000001F);
		Box21.setTextureSize(128, 128);
		Box21.mirror = true;
		setRotation(Box21, 0F, 0F, 0F);
		Box22 = new ModelRenderer(this, 65, 73);
		Box22.addBox(0F, 0F, 0F, 3, 5, 8);
		Box22.setRotationPoint(-7.8F, 14F, -7.8F);
		Box22.setTextureSize(128, 128);
		Box22.mirror = true;
		setRotation(Box22, 0F, 0F, 0F);
		Box23 = new ModelRenderer(this, 1, 81);
		Box23.addBox(0F, 0F, 0F, 3, 5, 7);
		Box23.setRotationPoint(-7.8F, 14F, 0.800000000000001F);
		Box23.setTextureSize(128, 128);
		Box23.mirror = true;
		setRotation(Box23, 0F, 0F, 0F);
		Box24 = new ModelRenderer(this, 89, 25);
		Box24.addBox(0F, 0F, 0F, 16, 1, 1);
		Box24.setRotationPoint(-8F, 13F, -7F);
		Box24.setTextureSize(128, 128);
		Box24.mirror = true;
		setRotation(Box24, 0F, 0F, 0F);
		Box25 = new ModelRenderer(this, 89, 57);
		Box25.addBox(0F, 0F, 0F, 16, 1, 1);
		Box25.setRotationPoint(-8F, 13F, -2F);
		Box25.setTextureSize(128, 128);
		Box25.mirror = true;
		setRotation(Box25, 0F, 0F, 0F);
		Box26 = new ModelRenderer(this, 89, 81);
		Box26.addBox(0F, 0F, 0F, 16, 1, 1);
		Box26.setRotationPoint(-8F, 13F, 6F);
		Box26.setTextureSize(128, 128);
		Box26.mirror = true;
		setRotation(Box26, 0F, 0F, 0F);
		Box27 = new ModelRenderer(this, 25, 89);
		Box27.addBox(0F, 0F, 0F, 16, 1, 1);
		Box27.setRotationPoint(-8F, 13F, 1F);
		Box27.setTextureSize(128, 128);
		Box27.mirror = true;
		setRotation(Box27, 0F, 0F, 0F);
		Box28 = new ModelRenderer(this, 57, 89);
		Box28.addBox(0F, 0F, 0F, 6, 5, 8);
		Box28.setRotationPoint(1.8F, 8F, -7.8F);
		Box28.setTextureSize(128, 128);
		Box28.mirror = true;
		setRotation(Box28, 0F, 0F, 0F);
		Box29 = new ModelRenderer(this, 89, 89);
		Box29.addBox(0F, 0F, 0F, 6, 5, 7);
		Box29.setRotationPoint(1.8F, 8F, 0.800000000000001F);
		Box29.setTextureSize(128, 128);
		Box29.mirror = true;
		setRotation(Box29, 0F, 0F, 0F);
		Box30 = new ModelRenderer(this, 1, 97);
		Box30.addBox(0F, 0F, 0F, 6, 5, 7);
		Box30.setRotationPoint(-4.5F, 8F, 0.800000000000001F);
		Box30.setTextureSize(128, 128);
		Box30.mirror = true;
		setRotation(Box30, 0F, 0F, 0F);
		Box31 = new ModelRenderer(this, 33, 97);
		Box31.addBox(0F, 0F, 0F, 3, 5, 7);
		Box31.setRotationPoint(-7.8F, 8F, 0.800000000000001F);
		Box31.setTextureSize(128, 128);
		Box31.mirror = true;
		setRotation(Box31, 0F, 0F, 0F);
		Box32 = new ModelRenderer(this, 49, 105);
		Box32.addBox(0F, 0F, 0F, 6, 5, 8);
		Box32.setRotationPoint(-4.5F, 8F, -7.8F);
		Box32.setTextureSize(128, 128);
		Box32.mirror = true;
		setRotation(Box32, 0F, 0F, 0F);
		Box33 = new ModelRenderer(this, 81, 105);
		Box33.addBox(0F, 0F, 0F, 3, 5, 8);
		Box33.setRotationPoint(-7.8F, 8F, -7.8F);
		Box33.setTextureSize(128, 128);
		Box33.mirror = true;
		setRotation(Box33, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Box01.render(f5); Box02.render(f5); Box03.render(f5);
		Box04.render(f5); Box05.render(f5); Box06.render(f5);
		Box07.render(f5); Box08.render(f5); Box09.render(f5);
		Box10.render(f5); Box11.render(f5); Box12.render(f5);
		Box13.render(f5); Box14.render(f5); Box15.render(f5);
		Box16.render(f5); Box17.render(f5); Box18.render(f5);
		Box19.render(f5); Box20.render(f5); Box21.render(f5);
		Box22.render(f5); Box23.render(f5); Box24.render(f5);
		Box25.render(f5); Box26.render(f5); Box27.render(f5);
		Box28.render(f5); Box29.render(f5); Box30.render(f5);
		Box31.render(f5); Box32.render(f5); Box33.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

	public static Palet1x1_1Model INSTANCE = new Palet1x1_1Model();
	
	@fTESR
	public static class Renderer extends FTESR_4R<Palet1x1_1.Entity> {
		
		public Renderer(){ super("frsm:textures/blocks/Palet1x1_1.png", null); }

		@Override
		public void renderModel(Palet1x1_1.Entity tileentity, float partialticks, int destroystage){
			INSTANCE.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		
	}

}