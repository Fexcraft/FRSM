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
@fModel(registryname = "frsm:models/block/iron_barrel")
public class IronBarrel extends FVTMFormatModel {

	public IronBarrel(){
		super(); textureX = 64; textureY = 64;
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 32, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 0.001f, 2, 12, 0, 1, 1, 4, null)
			.setRotationPoint(0, -2, 0).setRotationAngle(0, 0, 0).setName("bottom")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 4, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 0.001f, 20, 12, 0, 0.9375f, 0.9375f, 4,
			null, new boolean[]{ true, true, false, true })
			.setRotationPoint(0, -22, 0).setRotationAngle(0, 0, 0).setName("center")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 56, textureX, textureY).addHollowCylinder(4.5f, 0, 0, 1, 0.5f, 1, 8, 0, 1, 1, 4, null)
			.setRotationPoint(0, -24, 0).setRotationAngle(0, 0, 0).setName("entry")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 0.001f, 2, 12, 0, 1, 1, 4, new net.fexcraft.lib.common.math.Vec3f(0.0, -0.25, 0.0))
			.setRotationPoint(0, -23.75f, 0).setRotationAngle(0, 0, 0).setName("top")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 7, 2, 12, 0, 1, 1, 4, new net.fexcraft.lib.common.math.Vec3f(0.0, -1.75, 0.0))
			.setRotationPoint(0, -24, 0).setRotationAngle(0, 0, 0).setName("top_border")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 60, textureX, textureY).addHollowCylinder(4.5f, 0, 0, 1, 0.001f, 1, 8, 0, 0.5f, 0.5f, 4,
			null, new boolean[]{ false, false, false, true })
			.setRotationPoint(0, -23.875f, 0).setRotationAngle(0, 0, 0).setName("entry_notch")
		);
		this.groups.add(group0);
	}

}
