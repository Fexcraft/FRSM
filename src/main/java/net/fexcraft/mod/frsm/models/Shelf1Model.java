package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fTESR;
import net.fexcraft.lib.tmt.GenericModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.blocks.other.Shelf1;
import net.fexcraft.mod.frsm.util.block.TileRenderer4R;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class Shelf1Model extends GenericModelBase {
	
	private int textureX = 128, textureY = 64;

	public Shelf1Model(){
		base = new ModelRendererTurbo[5];
		base[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		base[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		base[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		base[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		base[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 4

		base[0].addBox(0F, 0F, 0F, 16, 1, 7, 0F); // Box 0
		base[0].setRotationPoint(-8F, -1F, 1F);

		base[1].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 1
		base[1].setRotationPoint(-8F, -15F, 1F);

		base[2].addBox(0F, 0F, 0F, 16, 1, 7, 0F); // Box 2
		base[2].setRotationPoint(-8F, -16F, 1F);

		base[3].addBox(0F, 0F, 0F, 1, 14, 7, 0F); // Box 3
		base[3].setRotationPoint(7F, -15F, 1F);

		base[4].addBox(0F, 0F, 0F, 14, 14, 1, 0F); // Box 4
		base[4].setRotationPoint(-7F, -15F, 7F);


		open = new ModelRendererTurbo[6];
		open[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 9
		open[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 10
		open[2] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 11
		open[3] = new ModelRendererTurbo(this, 105, 10, textureX, textureY); // Box 12
		open[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		open[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14

		open[0].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 9
		open[0].setRotationPoint(-7F, -6F, 1.5F);

		open[1].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 10
		open[1].setRotationPoint(-7F, -11F, 1.5F);

		open[2].addBox(-1F, 0F, 0F, 1, 16, 8, 0F); // Box 11
		open[2].setRotationPoint(-7F, -16F, -7F);

		open[3].addBox(-7F, 0F, 0F, 1, 16, 8, 0F); // Box 12
		open[3].setRotationPoint(14F, -16F, -8F);

		open[4].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 13
		open[4].setRotationPoint(7.5F, -9.5F, -6F);

		open[5].addBox(5F, 0F, 0F, 1, 3, 1, 0F); // Box 14
		open[5].setRotationPoint(-13.5F, -9.5F, -6F);


		closed = new ModelRendererTurbo[4];
		closed[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 5
		closed[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 6
		closed[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		closed[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8

		closed[0].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 5
		closed[0].setRotationPoint(-8F, -16F, 0F);

		closed[1].addBox(-8F, 0F, 0F, 8, 16, 1, 0F); // Box 6
		closed[1].setRotationPoint(8F, -16F, 0F);

		closed[2].addBox(-7F, 6.5F, -0.5F, 1, 3, 1, 0F); // Box 7
		closed[2].setRotationPoint(8F, -16F, 0F);

		closed[3].addBox(6F, 6.5F, -0.5F, 1, 3, 1, 0F); // Box 8
		closed[3].setRotationPoint(-8F, -16F, 0F);
		
		translate(0F, 24F, 0F);
	}
	
	@fTESR //TODO
	public static class Renderer extends TileRenderer4R<Shelf1.Entity> {
		
		public Renderer(){
			super(temp/*getFromColor(EnumDyeColor.BLACK)*/, new Shelf1Model());
		}
		
		//private static TreeMap<EnumDyeColor, ResourceLocation> LOCS = new TreeMap<>();
		private static ResourceLocation temp = new ResourceLocation("frsm:textures/blocks/shelf1_white.png");
		
		/*private static ResourceLocation getFromColor(EnumDyeColor color){
			if((temp = LOCS.get(color)) == null){
				LOCS.put(color, temp = new ResourceLocation("frsm:textures/blocks/shelf1_" + color.getMetadata() + ".png"));
			} return temp;
		}*/

		@Override
		public void renderModel(Shelf1.Entity tileentity, float partialticks, int destroystage){
			boolean open = tileentity.getState();
			//EnumDyeColor color = tileentity.getColor();
			Minecraft.getMinecraft().renderEngine.bindTexture(temp);//getFromColor(color));
			model.render(model.base);
			if(open == true){
				model.render(model.open);
			}
			if(open == false){
				model.render(model.closed);
			}
		}
		
	}
	
}