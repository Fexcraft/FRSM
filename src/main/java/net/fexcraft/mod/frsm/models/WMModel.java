//FMT-Marker FVTM-1.4
package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.util.FVTMFormatModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 *  
 *  @author Ferdinand Calo' (FEX___96)
 */
@fModel(registryname = "frsm:models/block/washingmachine")
public class WMModel extends FVTMFormatModel {

	public WMModel(){
		super(); textureX = 64; textureY = 64;
		//
		TurboList base = new TurboList("base");
		base.add(new ModelRendererTurbo(base, 0, 37, textureX, textureY)
			.addBox(0, 0, 0, 16, 15, 11, 0, 1f, new boolean[]{ false, false, true, false, true, false })
			.setRotationPoint(-8, -15, -4).setRotationAngle(0, 0, 0).setName("Shape1")
		);
		base.add(new ModelRendererTurbo(base, 23, 19, textureX, textureY)
			.addBox(0, 0, 0, 16, 14, 3, 0, 1f, new boolean[]{ false, false, true, false, false, true })
			.setRotationPoint(-8, -14, -7).setRotationAngle(0, 0, 0).setName("Shape2")
		);
		base.add(new ModelRendererTurbo(base, 46, 22, textureX, textureY)
			.addBox(0, 0, 0, 4, 2, 1, 0, 1f, new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-7.5f, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3")
		);
		base.add(new ModelRendererTurbo(base, 0, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 6, 4, 2, 12, 0, 1, 0.875f, 1, null)
			.setRotationPoint(0, -6, -8).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 3, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, true })
			.setRotationPoint(-8, -16, -7).setRotationAngle(0, 0, 0).setName("Shape4cp")
		);
		base.add(new ModelRendererTurbo(base, 58, 0, textureX, textureY).addHollowCylinder(0, -0.25f, 0, 1, 0.001f, 1, 8, 0, 0.5f, 0.75f, 4,
			null, new boolean[]{ false, false, false, true })
			.setRotationPoint(7, -15, -6).setRotationAngle(45, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 0, 17, textureX, textureY)
			.addBox(0, 0, 0, 1, 3, 1, 0, 1f, new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(4.75f, -7.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 12, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(3.5f, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 8, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(4.25f, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 4, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(5, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 0, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(5.75f, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 47, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(6.5f, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 43, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(7.25f, -13.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 53, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(2.25f, -15.75f, -5.375f).setRotationAngle(-45, 0, 0).setName("Shape3cp")
		);
		base.add(new ModelRendererTurbo(base, 53, 0, textureX, textureY).addHollowCylinder(0, -0.25f, 0, 1, 0.001f, 1, 8, 0, 0.5f, 0.75f, 4,
			null, new boolean[]{ false, false, false, true })
			.setRotationPoint(1.5f, -15, -6).setRotationAngle(45, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 48, 0, textureX, textureY).addHollowCylinder(0, -0.25f, 0, 1, 0.001f, 1, 8, 0, 0.5f, 0.75f, 4,
			null, new boolean[]{ false, false, false, true })
			.setRotationPoint(0.25f, -15, -6).setRotationAngle(45, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 13, 5, textureX, textureY)
			.addBox(0, 0, 0, 16, 1, 12, 0, 1f, new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-8, -16, -4).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 58, 7, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(5, -14, 6.5f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 58, 4, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-7, -14, 6.5f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 42, 2, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(5, -5, 6.5f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 36, 2, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 1, 0, 1f, new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-7, -5, 6.5f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 20, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, false })
			.setRotationPoint(5.5f, -14.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 56, 22, textureX, textureY)
			.addBox(0, 0, 0, 1, 11, 1, 0, 1f, new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(5.5f, -13.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 60, 20, textureX, textureY)
			.addBox(0, 0, 0, 1, 11, 1, 0, 1f, new boolean[]{ false, false, true, true, true, false })
			.setRotationPoint(-6.5f, -13.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 25, 0, textureX, textureY)
			.addBox(0, 0, 0, 11, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(-5.5f, -2.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 61, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-6.5f, -14.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 58, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-6.5f, -14.5f, 7).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 61, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, true, false, true, false })
			.setRotationPoint(5.5f, -2.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		base.add(new ModelRendererTurbo(base, 58, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0,
				new boolean[]{ true, false, true, false, true, false })
			.setRotationPoint(-6.5f, -2.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Shape1cp")
		);
		this.groups.add(base);
	}

}
