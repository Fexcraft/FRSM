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
@fModel(registryname = "frsm:models/block/vendingmachine")
public class VMModel extends FVTMFormatModel {

	public VMModel(){
		super(); textureX = 128; textureY = 128;
		//
		TurboList base = new TurboList("base");
		base.add(new ModelRendererTurbo(base, 49, 3, textureX, textureY).addBox(0, 0, 0, 16, 4, 16)
			.setRotationPoint(-8, -4, -8).setRotationAngle(0, 0, 0).setName("Shape1")
		);
		base.add(new ModelRendererTurbo(base, 0, 37, textureX, textureY)
			.addBox(0, 23, 0, 3, 26, 15, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(5, -53, -7).setRotationAngle(0, 0, 0).setName("Shape2")
		);
		base.add(new ModelRendererTurbo(base, 37, 63, textureX, textureY)
			.addBox(0, 0, 0, 1, 26, 16, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8, -30, -8).setRotationAngle(0, 0, 0).setName("Shape3")
		);
		base.add(new ModelRendererTurbo(base, 75, 24, textureX, textureY)
			.addBox(0, 0, 0, 12, 26, 1, 0, 1f, new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-7, -30, 7).setRotationAngle(0, 0, 0).setName("Shape4")
		);
		base.add(new ModelRendererTurbo(base, 0, 0, textureX, textureY).addBox(0, 0, 0, 16, 2, 16)
			.setRotationPoint(-8, -32, -8).setRotationAngle(0, 0, 0).setName("Shape5")
		);
		base.add(new ModelRendererTurbo(base, 50, 24, textureX, textureY)
			.addBox(0, 0, 0, 12, 2, 3, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-7, -9, -8).setRotationAngle(0, 0, 0).setName("Shape6")
		);
		base.add(new ModelRendererTurbo(base, 0, 10, textureX, textureY)
			.addBox(0, 0, 0, 12, 4, 6, 0, 1f, new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-7, -8, 1).setRotationAngle(0, 0, 0).setName("Shape10")
		);
		base.add(new ModelRendererTurbo(base, 49, 0, textureX, textureY)
			.addBox(0, 0, 0, 12, 1, 12, 0, 1f, new boolean[]{ true, true, true, false, false, true })
			.setRotationPoint(-7, -30.875f, -5).setRotationAngle(0, 0, 0).setName("Shape12")
		);
		base.add(new ModelRendererTurbo(base, 114, 13, textureX, textureY)
			.addBox(0, 0, 0, 12, 21, 1, 0, 1f, new boolean[]{ true, true, true, true, false, true })
			.setRotationPoint(-7, -30, -6.5f).setRotationAngle(0, 0, 0).setName("Shape13")
		);
		base.add(new ModelRendererTurbo(base, 119, 41, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -13, 5).setRotationAngle(0, 2, 0).setName("Shape171")
		);
		base.add(new ModelRendererTurbo(base, 114, 41, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -13, 3).setRotationAngle(0, -2, 0).setName("Shape172")
		);
		base.add(new ModelRendererTurbo(base, 52, 39, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -13, 1).setRotationAngle(0, 2, 0).setName("Shape173")
		);
		base.add(new ModelRendererTurbo(base, 32, 34, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-3.5f, -20, 6).setRotationAngle(0, 0, 0).setName("Shape181")
		);
		base.add(new ModelRendererTurbo(base, 27, 34, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-3.5f, -20, 4).setRotationAngle(0, 0, 0).setName("Shape182")
		);
		base.add(new ModelRendererTurbo(base, 22, 34, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-3.5f, -20, 2).setRotationAngle(0, 0, 0).setName("Shape183")
		);
		base.add(new ModelRendererTurbo(base, 8, 34, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-3.5f, -20, 0).setRotationAngle(0, 0, 0).setName("Shape184")
		);
		base.add(new ModelRendererTurbo(base, 100, 40, textureX, textureY)
			.addBox(0, 0, 0, 2, 3, 2, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -27, 3).setRotationAngle(0, 0, 0).setName("Shape191")
		);
		base.add(new ModelRendererTurbo(base, 64, 38, textureX, textureY)
			.addBox(0, 0, 0, 2, 3, 2, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -27, 0).setRotationAngle(0, 0, 0).setName("Shape192")
		);
		base.add(new ModelRendererTurbo(base, 45, 38, textureX, textureY)
			.addBox(0, 0, 0, 2, 3, 2, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -22, 3).setRotationAngle(0, -4, 0).setName("Shape201")
		);
		base.add(new ModelRendererTurbo(base, 57, 37, textureX, textureY)
			.addBox(0, 0, 0, 2, 3, 2, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -22, 0).setRotationAngle(0, 2, 0).setName("Shape202")
		);
		base.add(new ModelRendererTurbo(base, 100, 36, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -11, 2).setRotationAngle(0, 0, 0).setName("Shape211")
		);
		base.add(new ModelRendererTurbo(base, 42, 36, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -11, 0).setRotationAngle(0, 0, 0).setName("Shape212")
		);
		base.add(new ModelRendererTurbo(base, 37, 36, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(2.5f, -18, 5).setRotationAngle(0, 5, 0).setName("Shape221")
		);
		base.add(new ModelRendererTurbo(base, 119, 35, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(2.5f, -18, 3).setRotationAngle(0, 4, 0).setName("Shape222")
		);
		base.add(new ModelRendererTurbo(base, 114, 35, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(2.5f, -18, 1).setRotationAngle(0, 5, 0).setName("Shape223")
		);
		base.add(new ModelRendererTurbo(base, 100, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 7, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-4, -26, 0).setRotationAngle(0, 0, 0).setName("Shape14cp")
		);
		base.add(new ModelRendererTurbo(base, 53, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 7, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-1, -26, 0).setRotationAngle(0, 0, 0).setName("Shape15cp")
		);
		base.add(new ModelRendererTurbo(base, 37, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 17, 7, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(2, -26, 0).setRotationAngle(0, 0, 0).setName("Shape16cp")
		);
		base.add(new ModelRendererTurbo(base, 25, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(-7, -24, -1).setRotationAngle(0, 0, 0).setName("Shape11cp")
		);
		base.add(new ModelRendererTurbo(base, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(-7, -19, -1).setRotationAngle(0, 0, 0).setName("Shape9cp")
		);
		base.add(new ModelRendererTurbo(base, 98, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(-7, -14, -1).setRotationAngle(0, 0, 0).setName("Shape8cp")
		);
		base.add(new ModelRendererTurbo(base, 50, 30, textureX, textureY).addCylinder(0, 0, 0, 2, 4, 8, 0.5f, 0.5f, 4, null)
			.setRotationPoint(-2.5f, -13, 4).setRotationAngle(0, 47, 0)
		);
		base.add(new ModelRendererTurbo(base, 0, 29, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(3.5f, -25, 1.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 13, 28, textureX, textureY).addCylinder(0, 0, 0, 2, 4, 8, 0.5f, 0.5f, 4, null)
			.setRotationPoint(-2.5f, -13, 1).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 69, 30, textureX, textureY)
			.addBox(0, 23, 0, 3, 8, 1, 0, 1f, new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(5, -53, -8).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 108, 29, textureX, textureY)
			.addBox(0, 23, 0, 3, 14, 1, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(5, -41, -8).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 71, 40, textureX, textureY)
			.addShapeBox(0, 23, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(5, -45, -8).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 9, 29, textureX, textureY)
			.addShapeBox(0, 23, 0, 1, 4, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0,
				new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(7, -45, -8).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 100, 33, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 1, 0, 1f, new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-6.5f, -17, 5).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 42, 33, textureX, textureY)
			.addShapeBox(0, 2, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(-6.5f, -17, 5).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 37, 33, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -17, 5).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 100, 30, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 1, 0, 1f, new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-6.5f, -17, 3).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 109, 24, textureX, textureY)
			.addShapeBox(0, 2, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(-6.5f, -17, 3).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 44, 21, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -17, 3).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 40, 19, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 1, 0, 1f, new boolean[]{ false, false, true, true, false, true })
			.setRotationPoint(-6.5f, -17, 1).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 35, 19, textureX, textureY)
			.addShapeBox(0, 2, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f,
				new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(-6.5f, -17, 1).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 30, 19, textureX, textureY)
			.addShapeBox(0, -1, 0, 2, 1, 1, 0, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0.375f, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -17, 1).setRotationAngle(-30, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 100, 24, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 0.625f, 0.625f, 4, null)
			.setRotationPoint(3.5f, -25, 4.5f).setRotationAngle(0, -37, 0)
		);
		base.add(new ModelRendererTurbo(base, 25, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-3.5f, -25, 0.5f).setRotationAngle(0, 0, 0).setName("Shape184cp")
		);
		base.add(new ModelRendererTurbo(base, 92, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -25, 0.5f).setRotationAngle(0, 0, 0).setName("Shape184cp")
		);
		base.add(new ModelRendererTurbo(base, 87, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-0.5f, -15, 0.5f).setRotationAngle(0, 0, 0).setName("Shape184cp")
		);
		base.add(new ModelRendererTurbo(base, 82, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-3.5f, -15, 0.5f).setRotationAngle(0, 0, 0).setName("Shape184cp")
		);
		base.add(new ModelRendererTurbo(base, 77, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(2.5f, -20, 0.5f).setRotationAngle(0, 0, 0).setName("Shape184cp")
		);
		base.add(new ModelRendererTurbo(base, 72, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(2.5f, -10, 0.5f).setRotationAngle(0, 0, 0).setName("Shape184cp")
		);
		base.add(new ModelRendererTurbo(base, 103, 14, textureX, textureY)
			.addBox(0, 0, 0, 2, 2, 2, 0, 1f, new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-6.5f, -21.25f, 1).setRotationAngle(0, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 98, 0, textureX, textureY)
			.addBox(0, 0, 0, 12, 3, 1, 0, 1f, new boolean[]{ true, true, true, true, false, false })
			.setRotationPoint(-7, -7, -7.5f).setRotationAngle(10, 0, 0).setName("Shape6cp")
		);
		base.add(new ModelRendererTurbo(base, 59, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-7, -22, 0.5f).setRotationAngle(0, 0, 0).setName("Shape212cp")
		);
		base.add(new ModelRendererTurbo(base, 67, 0, textureX, textureY)
			.addBox(0, 23, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(5.5f, -44.875f, -7.25f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 98, 14, textureX, textureY)
			.addShapeBox(0, 23, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(5.5f, -43.625f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 110, 13, textureX, textureY)
			.addShapeBox(0, 23, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.875f, -43.625f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 61, 13, textureX, textureY)
			.addShapeBox(0, 23, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.875f, -43.25f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 123, 9, textureX, textureY)
			.addShapeBox(0, 23, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.875f, -42.875f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 123, 6, textureX, textureY)
			.addShapeBox(0, 23.375f, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.875f, -42.875f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 123, 3, textureX, textureY)
			.addShapeBox(0, 23.375f, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.875f, -42.125f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 123, 0, textureX, textureY)
			.addShapeBox(0, 23.375f, 0, 1, 1, 1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.875f, -41.75f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 62, 0, textureX, textureY)
			.addShapeBox(0, 23.375f, 0, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(5.25f, -41.75f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape2cp")
		);
		base.add(new ModelRendererTurbo(base, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, true, false, true, false, true })
			.setRotationPoint(-7, -9, -1).setRotationAngle(0, 0, 0).setName("Shape7cp")
		);
		this.groups.add(base);
	}

}
