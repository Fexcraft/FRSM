//FMT-Marker FVTM-1.4
package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.util.FVTMFormatModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 *  
 *  @author Ferdinand (FEX___96)
 */
@fModel(registryname = "frsm:models/block/printer")
public class PrinterModel extends FVTMFormatModel {

	public PrinterModel(){
		super(); textureX = 64; textureY = 64;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 5, 5, textureX, textureY)
			.addBox(0, 0, 0, 8, 1, 12, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-5, -1, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 36, 25, textureX, textureY)
			.addBox(0, -5, 0, 1, 5, 8, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-5, -4, -4).setRotationAngle(0, 0, -15)
		);
		group0.add(new ModelRendererTurbo(group0, 43, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-3.25f, -6.0625f, 3.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 35, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -33.625f, 0, 0, -33.5f, 0, -13, 0, 0, -13.125f, -0.125f, 0, -13.125f, -33.625f, 0, -13, -33.5f,
				new boolean[]{ false, true, true, true, true, true })
			.setRotationPoint(1.375f, -5.25f, -5.625f).setRotationAngle(0, 0, -45)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 12, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -6, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 38, 0, textureX, textureY)
			.addBox(0, 0, 0, 8, 4, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-5, -5, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 17, 0, textureX, textureY)
			.addBox(0, 0, 0, 8, 4, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-5, -5, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 8, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-5, -5, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 58, 7, textureX, textureY)
			.addBox(0, 0, 0, 1, 1, 2, 0, 1f, new boolean[]{ true, false, false, true, false, false })
			.setRotationPoint(-5, -6, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 3, 4, textureX, textureY)
			.addBox(0, 0, 0, 1, 1, 2, 0, 1f, new boolean[]{ true, false, false, true, false, false })
			.setRotationPoint(-5, -6, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 26, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(3, -2, -4).setRotationAngle(0, 0, -5)
		);
		group0.add(new ModelRendererTurbo(group0, 52, 17, textureX, textureY)
			.addShapeBox(0.125f, -6.5625f, 0, 1, 6, 7, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0,
				new boolean[]{ true, false, false, true, false, false })
			.setRotationPoint(-5.0625f, -4, -3.5f).setRotationAngle(0, 0, -15)
		);
		group0.add(new ModelRendererTurbo(group0, 49, 17, textureX, textureY)
			.addShapeBox(0.125f, -6.5625f, 0, 1, 6, 7, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-5, -4, -3.5f).setRotationAngle(0, 0, -15)
		);
		group0.add(new ModelRendererTurbo(group0, 46, 17, textureX, textureY)
			.addShapeBox(0.125f, -6.5625f, 0, 1, 6, 7, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0,
				new boolean[]{ true, true, false, true, false, false })
			.setRotationPoint(-4.9375f, -4, -3.5f).setRotationAngle(0, 0, -15)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 13, textureX, textureY)
			.addShapeBox(0.125f, -6.5625f, 0, 1, 6, 7, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0,
				new boolean[]{ false, true, false, true, false, false })
			.setRotationPoint(-4.875f, -4, -3.5f).setRotationAngle(0, 0, -15)
		);
		group0.add(new ModelRendererTurbo(group0, 26, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-1.375f, -6.0625f, 4.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 55, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.75f, -6.0625f, 4.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 26, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.125f, -6.0625f, 4.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 58, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(0.5f, -6.0625f, 4.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-1.375f, -6.0625f, 4.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.75f, -6.0625f, 4.125f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 44, 7, textureX, textureY).addBox(0, 0, 0, 1, 1, 8)
			.setRotationPoint(2, -5, -4).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

}
