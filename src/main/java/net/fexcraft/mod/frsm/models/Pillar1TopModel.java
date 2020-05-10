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
@fModel(registryname = "frsm:models/block/pillar1_top")
public class Pillar1TopModel extends FVTMFormatModel {

	public Pillar1TopModel(){
		super(); textureX = 128; textureY = 128;
		//
		TurboList imported = new TurboList("imported");
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 4)
			.setRotationPoint(-4, -12, -2).setRotationAngle(0, 0, 0).setName("Shape1")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 4)
			.setRotationPoint(2, -12, -2).setRotationAngle(0, 0, 0).setName("Shape2")
		);
		imported.add(new ModelRendererTurbo(imported, 13, 0, textureX, textureY).addBox(0, 0, 0, 4, 12, 2)
			.setRotationPoint(-2, -12, -4).setRotationAngle(0, 0, 0).setName("Shape3")
		);
		imported.add(new ModelRendererTurbo(imported, 13, 0, textureX, textureY).addBox(0, 0, 0, 4, 12, 2)
			.setRotationPoint(-2, -12, 2).setRotationAngle(0, 0, 0).setName("Shape4")
		);
		imported.add(new ModelRendererTurbo(imported, 26, 0, textureX, textureY).addBox(0, 0, 0, 3, 12, 2)
			.setRotationPoint(1.8f, -12, -3.9f).setRotationAngle(0, -45, 0).setName("Shape5")
		);
		imported.add(new ModelRendererTurbo(imported, 37, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 3)
			.setRotationPoint(-1.8f, -12, -3.9f).setRotationAngle(0, -45, 0).setName("Shape6")
		);
		imported.add(new ModelRendererTurbo(imported, 37, 0, textureX, textureY).addBox(0, 0, 0, 2, 12, 3)
			.setRotationPoint(2.5f, -12, 0.4f).setRotationAngle(0, -45, 0).setName("Shape7")
		);
		imported.add(new ModelRendererTurbo(imported, 26, 0, textureX, textureY).addBox(0, 0, 0, 3, 12, 2)
			.setRotationPoint(-2.5f, -12, 0.4f).setRotationAngle(0, -45, 0).setName("Shape8")
		);
		imported.add(new ModelRendererTurbo(imported, 0, 22, textureX, textureY).addBox(0, 0, 0, 8, 2, 8)
			.setRotationPoint(-4, -14, -4).setRotationAngle(0, 0, 0).setName("Shape10")
		);
		imported.add(new ModelRendererTurbo(imported, 33, 21, textureX, textureY).addBox(0, 0, 0, 16, 1, 10)
			.setRotationPoint(-8, -16, -5).setRotationAngle(0, 0, 0).setName("Shape11")
		);
		imported.add(new ModelRendererTurbo(imported, 86, 23, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
			.setRotationPoint(-6, -16, -4).setRotationAngle(0, 0, 45).setName("Shape12")
		);
		imported.add(new ModelRendererTurbo(imported, 86, 23, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
			.setRotationPoint(6, -16, 4).setRotationAngle(0, 180, 45).setName("Shape9")
		);
		imported.add(new ModelRendererTurbo(imported, 86, 13, textureX, textureY).addBox(0, 0, 0, 10, 1, 8)
			.setRotationPoint(-5, -15, -4).setRotationAngle(0, 0, 0).setName("Shape13")
		);
		this.groups.add(imported);
	}

}
