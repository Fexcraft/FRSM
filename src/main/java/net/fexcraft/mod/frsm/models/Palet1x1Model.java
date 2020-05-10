//FMT-Marker DFM-1.0
//Creator: FEX___96

package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.GenericModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "frsm:models/block/palet1x1")
public class Palet1x1Model extends GenericModelBase {

	private int textureX = 128;
	private int textureY = 128;

	public Palet1x1Model(){
		base = new ModelRendererTurbo[17];
		//
		base[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box_0
		base[0].addBox(0, 0, 0, 3, 1, 16, 0f);
		base[0].setRotationPoint(5.0f, -1.0f, -8.0f);

		base[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box_1
		base[1].addBox(0, 0, 0, 3, 1, 16, 0f);
		base[1].setRotationPoint(-8.0f, -1.0f, -8.0f);

		base[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box_2
		base[2].addBox(0, 0, 0, 3, 1, 16, 0f);
		base[2].setRotationPoint(-1.5f, -1.0f, -8.0f);

		base[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box_3
		base[3].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[3].setRotationPoint(-8.0f, -3.0f, -8.0f);

		base[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box_4
		base[4].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[4].setRotationPoint(-1.5f, -3.0f, -8.0f);

		base[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box_5
		base[5].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[5].setRotationPoint(5.0f, -3.0f, -8.0f);

		base[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box_6
		base[6].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[6].setRotationPoint(-8.0f, -3.0f, 5.0f);

		base[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box_7
		base[7].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[7].setRotationPoint(5.0f, -3.0f, 5.0f);

		base[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box_8
		base[8].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[8].setRotationPoint(-1.5f, -3.0f, 5.0f);

		base[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box_9
		base[9].addBox(0, 0, 0, 16, 1, 3, 0f);
		base[9].setRotationPoint(-8.0f, -4.0f, -8.0f);

		base[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box_10
		base[10].addBox(0, 0, 0, 16, 1, 3, 0f);
		base[10].setRotationPoint(-8.0f, -4.0f, 5.0f);

		base[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box_11
		base[11].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[11].setRotationPoint(-8.0f, -5.0f, -8.0f);

		base[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box_12
		base[12].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[12].setRotationPoint(-5.5f, -5.0f, -8.0f);

		base[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box_13
		base[13].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[13].setRotationPoint(6.0f, -5.0f, -8.0f);

		base[14] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box_14
		base[14].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[14].setRotationPoint(3.5f, -5.0f, -8.0f);

		base[15] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box_15
		base[15].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[15].setRotationPoint(0.5f, -5.0f, -8.0f);

		base[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box_16
		base[16].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[16].setRotationPoint(-2.5f, -5.0f, -8.0f);
	}

}
