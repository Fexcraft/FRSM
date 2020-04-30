package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.lib.tmt.GenericModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.blocks.streetlamps.StreetLamp;
import net.fexcraft.mod.frsm.util.block.TileRenderer4R;

public class ModelStreetLampTop extends GenericModelBase {
	
	private int textureX = 64, textureY = 32;

	public ModelStreetLampTop(){
		base = new ModelRendererTurbo[7];
		base[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		base[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		base[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		base[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 4
		base[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 5
		base[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		base[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 7
		base[0].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		base[0].setRotationPoint(-4F, 0.5F, -2.5F);
		base[1].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		base[1].setRotationPoint(-8F, 1F, -1F);
		base[2].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 3
		base[2].setRotationPoint(-3F, 2.5F, -1.5F);
		base[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		base[3].setRotationPoint(-4F, 2.5F, -2.5F);
		base[4].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		base[4].setRotationPoint(-4F, 2.5F, 2F);
		base[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		base[5].setRotationPoint(-4F, 2.5F, -2F);
		base[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		base[6].setRotationPoint(3.5F, 2.5F, -2F);
		translate(0F, 14F, 0F);
	}
	
	@fTESR
	public static class Renderer extends TileRenderer4R<StreetLamp.Entity> {
		
		public Renderer(){ super("frsm:textures/blocks/streetlamp1e.png", new ModelStreetLampTop()); }
		
		@Override
		public int adjustAngle(){ return 90; }

		@Override
		public void renderModel(StreetLamp.Entity tileentity, float partialticks, int destroystage){ model.render(); }
		
	}
	
}