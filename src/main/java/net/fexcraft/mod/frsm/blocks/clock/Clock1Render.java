package net.fexcraft.mod.frsm.blocks.clock;

import org.lwjgl.opengl.GL11;

import net.fexcraft.mod.frsm.util.block.FTESR_4R;
import net.fexcraft.mod.lib.api.render.fTESR;
import net.fexcraft.mod.lib.util.math.Time;
import net.fexcraft.mod.lib.util.render.RGB;
import net.minecraft.util.ResourceLocation;

@fTESR
public class Clock1Render extends FTESR_4R<Clock1.TE> {
	
	private static final ModelClock1 model = new ModelClock1();
	
	@Override
	public int adjustAngle(){
		return 90;
	}

	@Override
	public ResourceLocation getResourceLocation(){
		return new ResourceLocation("frsm:textures/blocks/clock1.png");
	}

	@Override
	public void renderModel(Clock1.TE tileentity, float partialticks, int destroystage){
		model.render(model.bodyModel);
		tileentity.getColor().glColorApply();
		model.render(model.bodyDoorOpenModel);
		RGB.glColorReset();
		GL11.glTranslatef(0F, 1F, 0F);
		GL11.glRotatef(180, 1.0F, 0.0F, 0.0F);
		//
		int h = Time.getHour12();
		int m = Time.getMinute();
		int s = Time.getSecond();
		//
		int a = 0;
		if(m == 0){
			a = 0;
		}
		else{
			a = Math.round(m / 2);
		}
		GL11.glRotatef((h * -30) - a, 1.0F, 0.0F, 0.0F);
		model.render(model.trailerModel);
		GL11.glRotatef((h * +30) + a, 1.0F, 0.0F, 0.0F);
		//
		GL11.glRotatef(m * -6, 1.0F, 0.0F, 0.0F);
		model.render(model.steeringWheelModel);
		GL11.glRotatef(m * +6, 1.0F, 0.0F, 0.0F);
		//
		GL11.glRotatef(s * -6, 1.0F, 0.0F, 0.0F);
		model.render(model.turretModel);
		GL11.glRotatef(s * +6, 1.0F, 0.0F, 0.0F);
		//
	}
	
}