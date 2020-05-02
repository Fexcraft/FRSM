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
@fModel(registryname = "frsm:models/block/radio1")
public class Radio1Model extends FVTMFormatModel {

	public Radio1Model(){
		super(); textureX = 32; textureY = 32;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 7, textureX, textureY)
			.addBox(0, 0, 0, 2, 4, 8, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-1, -4, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-0.875f, -4, -4).setRotationAngle(8, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 9, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 1.75f, 1, 12, 0, 0.875f, 0.75f, 3,
			null, new boolean[]{ true, false, false, false })
			.setRotationPoint(0.125f, -2, -2.0625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 17, 18, textureX, textureY)
			.addBox(0, 0, 0, 1, 3, 2, 0, 1f, new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(0.0625f, -3.5f, 1.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 24, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 16, 8, 0.5f, 0.5f, 2,
			new net.fexcraft.lib.common.math.Vec3f(0.5, 0.0, 0.0), new boolean[]{ false, false, false, true })
			.setRotationPoint(-0.75f, -2.75f, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 0.25f, 1, 12, 0, 0.6875f, 0.6875f, 3,
			null, new boolean[]{ true, false, true, false })
			.setRotationPoint(0.0625f, -2, -2.0625f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 13, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-0.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 17, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-0.5f, -5, -2.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 25, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-1, -4, -4.25f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 18, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, -4, 3.25f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 4, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(0.0625f, -3.75f, 0.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(0.0625f, -3.75f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 18, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 16, 8, 0.5f, 0.5f, 2,
			new net.fexcraft.lib.common.math.Vec3f(0.5, 0.0, 0.0), new boolean[]{ false, false, false, true })
			.setRotationPoint(-0.75f, -1.25f, 4).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

}
