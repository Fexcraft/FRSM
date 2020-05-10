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
@fModel(registryname = "frsm:models/block/pillar1_bottom")
public class Pillar1BottomModel extends FVTMFormatModel {

	public Pillar1BottomModel(){
		super(); textureX = 64; textureY = 64;
		//
		TurboList imported = new TurboList("imported");
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 4)
			.setRotationPoint(-4, -16, -2).setRotationAngle(0, 0, 0).setName("Shape1")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 4)
			.setRotationPoint(2, -16, -2).setRotationAngle(0, 0, 0).setName("Shape2")
		);
		imported.add(new ModelRendererTurbo(imported, 13, 0, textureX, textureY).addBox(0, 0, 0, 4, 12, 2)
			.setRotationPoint(-2, -16, -4).setRotationAngle(0, 0, 0).setName("Shape3")
		);
		imported.add(new ModelRendererTurbo(imported, 13, 0, textureX, textureY).addBox(0, 0, 0, 4, 12, 2)
			.setRotationPoint(-2, -16, 2).setRotationAngle(0, 0, 0).setName("Shape4")
		);
		imported.add(new ModelRendererTurbo(imported, 26, 0, textureX, textureY).addBox(0, 0, 0, 3, 12, 2)
			.setRotationPoint(1.8f, -16, -3.9f).setRotationAngle(0, -45, 0).setName("Shape5")
		);
		imported.add(new ModelRendererTurbo(imported, 37, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 3)
			.setRotationPoint(-1.8f, -16, -3.9f).setRotationAngle(0, -45, 0).setName("Shape6")
		);
		imported.add(new ModelRendererTurbo(imported, 37, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 3)
			.setRotationPoint(2.5f, -16, 0.4f).setRotationAngle(0, -45, 0).setName("Shape7")
		);
		imported.add(new ModelRendererTurbo(imported, 26, 0, textureX, textureY).addBox(0, 0, 0, 3, 12, 2)
			.setRotationPoint(-2.5f, -16, 0.4f).setRotationAngle(0, -45, 0).setName("Shape8")
		);
		imported.add(new ModelRendererTurbo(imported, 2, 19, textureX, textureY).addBox(0, 0, 0, 12, 1, 12)
			.setRotationPoint(-6, -1, -6).setRotationAngle(0, 0, 0).setName("Shape9")
		);
		imported.add(new ModelRendererTurbo(imported, 13, 0, textureX, textureY).addBox(0, 0, 0, 4, 3, 2)
			.setRotationPoint(-2, -4, -5).setRotationAngle(0, 0, 0).setName("Shape10")
		);
		imported.add(new ModelRendererTurbo(imported, 13, 0, textureX, textureY).addBox(0, 0, 0, 4, 3, 2)
			.setRotationPoint(-2, -4, 3).setRotationAngle(0, 0, 0).setName("Shape11")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 3, 4)
			.setRotationPoint(3, -4, -2).setRotationAngle(0, 0, 0).setName("Shape12")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 3, 4)
			.setRotationPoint(-5, -4, -2).setRotationAngle(0, 0, 0).setName("Shape13")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 3, 4)
			.setRotationPoint(1.2f, -4, -4.1f).setRotationAngle(0, 45, 0).setName("Shape14")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 3, 4)
			.setRotationPoint(4.1f, -4, 1.2f).setRotationAngle(0, -45, 0).setName("Shape15")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 3, 4)
			.setRotationPoint(-4.8f, -4, 1.9f).setRotationAngle(0, 45, 0).setName("Shape16")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 3, 4)
			.setRotationPoint(-1.9f, -4, -4.8f).setRotationAngle(0, -45, 0).setName("Shape17")
		);
		this.groups.add(imported);
	}

}
