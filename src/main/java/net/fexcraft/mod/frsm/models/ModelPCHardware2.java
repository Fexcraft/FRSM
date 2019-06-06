package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.common.math.RGB;
import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.lib.tmt.GenericModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.blocks.machines.PCHardware2;
import net.fexcraft.mod.frsm.util.block.FTESR_4R;

public class ModelPCHardware2 extends GenericModelBase {
	
	int textureX = 64, textureY = 64;

	public ModelPCHardware2(){
		base = new ModelRendererTurbo[8];
		base[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		base[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		base[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		base[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		base[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		base[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		base[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		base[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 12

		base[0].addBox(-6F, 1F, -2F, 1, 1, 1, 0F); // Box 0
		base[0].setRotationPoint(0F, -2F, 0F);

		base[1].addBox(1F, 1F, -2F, 1, 1, 1, 0F); // Box 1
		base[1].setRotationPoint(0F, -2F, 0F);

		base[2].addBox(-7F, 0F, -6F, 10, 1, 5, 0F); // Box 2
		base[2].setRotationPoint(0F, -2F, 0F);
		base[2].rotationAngleX = 10F;

		base[3].addShapeBox(-4F, 0F, 2F, 8, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		base[3].setRotationPoint(0F, -1F, 0F);

		base[4].addBox(-1F, 0F, 4F, 2, 6, 1, 0F); // Box 4
		base[4].setRotationPoint(0F, -6F, 0F);

		base[5].addBox(-6F, -5F, 3F, 12, 10, 1, 0F); // Box 5
		base[5].setRotationPoint(0F, -9F, 0F);
		base[5].rotationAngleX = -8F;

		base[6].addBox(-1.5F, 1.5F, 4.5F, 3, 2, 1, 0F); // Box 7
		base[6].setRotationPoint(0F, -9F, 0F);
		base[6].rotationAngleX = -8F;

		base[7].addShapeBox(-4F, -2.5F, 5F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 12
		base[7].setRotationPoint(0F, -9F, 0F);
		base[7].rotationAngleX = -8F;


		r0 = new ModelRendererTurbo[5];
		r0[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		r0[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		r0[2] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 9
		r0[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 10
		r0[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 11

		r0[0].addShapeBox(-6F, -2.5F, 4F, 12, 6, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 6
		r0[0].setRotationPoint(0F, -9F, 0F);
		r0[0].rotationAngleX = -8F;

		r0[1].addShapeBox(5F, 0F, -5F, 2, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		r0[1].setRotationPoint(0F, -1F, 0F);

		r0[2].addShapeBox(5F, 0F, -5F, 2, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		r0[2].setRotationPoint(0F, -1F, 0F);

		r0[3].addShapeBox(5F, 0F, -4F, 1, 1, 2, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
		r0[3].setRotationPoint(0F, -1F, 0F);

		r0[4].addShapeBox(6F, 0F, -4F, 1, 1, 2, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		r0[4].setRotationPoint(0F, -1F, 0F);
		
		translate(0F, 24F, 0F);
	}
	
	@fTESR
	public static class Renderer extends FTESR_4R<PCHardware2.Entity> {
		
		public Renderer(){ super("frsm:textures/blocks/pchardware2.png", new ModelPCHardware2()); }

		@Override
		public void renderModel(PCHardware2.Entity tileentity, float partialticks, int destroystage){
			model.render(model.base);
			tileentity.getColor().glColorApply();
			model.render(model.r0);
			RGB.glColorReset();
		}
		
	}
	
}