// Date: 14.02.2015 20:04:03
//FMT-Marker DFM-1.0
//Creator: FEX___96

package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "frsm:models/block/busstation")
public class BusStationModel extends GenericModelBase {

	private int textureX = 128;
	private int textureY = 128;

	public BusStationModel(){
		base = new ModelRendererTurbo[14];
		//
		base[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape1
		base[0].addBox(0, 0, 0, 48, 30, 1, 0f);
		base[0].setRotationPoint(-24.0f, -30.0f, 7.0f);

		base[1] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Shape2
		base[1].addBox(0, 0, 0, 48, 1, 6, 0f);
		base[1].setRotationPoint(-24.0f, -33.0f, 2.9f);
		base[1].rotationAngleX = -30f;

		base[2] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Shape3
		base[2].addBox(0, 0, 0, 48, 1, 14, 0f);
		base[2].setRotationPoint(-24.0f, -33.0f, -11.0f);

		base[3] = new ModelRendererTurbo(this, 109, 0, textureX, textureY); // Shape4
		base[3].addBox(0, 0, 0, 1, 32, 2, 0f);
		base[3].setRotationPoint(22.0f, -32.0f, -8.0f);

		base[4] = new ModelRendererTurbo(this, 109, 0, textureX, textureY); // Shape5
		base[4].addBox(0, 0, 0, 1, 32, 2, 0f);
		base[4].setRotationPoint(-23.0f, -32.0f, -8.0f);

		base[5] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Shape6
		base[5].addBox(0, 0, 0, 1, 4, 2, 0f);
		base[5].setRotationPoint(20.0f, -4.0f, 4.0f);

		base[6] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Shape7
		base[6].addBox(0, 0, 0, 1, 4, 2, 0f);
		base[6].setRotationPoint(20.0f, -4.0f, 0.0f);

		base[7] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Shape8
		base[7].addBox(0, 0, 0, 1, 4, 2, 0f);
		base[7].setRotationPoint(-21.0f, -4.0f, 4.0f);

		base[8] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Shape9
		base[8].addBox(0, 0, 0, 1, 4, 2, 0f);
		base[8].setRotationPoint(-21.0f, -4.0f, 0.0f);

		base[9] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Shape10
		base[9].addBox(0, 0, 0, 3, 1, 7, 0f);
		base[9].setRotationPoint(19.0f, -5.0f, -0.5f);

		base[10] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Shape11
		base[10].addBox(0, 0, 0, 3, 1, 7, 0f);
		base[10].setRotationPoint(-22.0f, -5.0f, -0.5f);

		base[11] = new ModelRendererTurbo(this, 21, 56, textureX, textureY); // Shape12
		base[11].addBox(0, 0, 0, 48, 1, 2, 0f);
		base[11].setRotationPoint(-24.0f, -6.0f, 5.0f);

		base[12] = new ModelRendererTurbo(this, 21, 60, textureX, textureY); // Shape13
		base[12].addBox(0, 0, 0, 48, 1, 3, 0f);
		base[12].setRotationPoint(-24.0f, -6.0f, 1.5f);

		base[13] = new ModelRendererTurbo(this, 21, 56, textureX, textureY); // Shape14
		base[13].addBox(0, 0, 0, 48, 1, 2, 0f);
		base[13].setRotationPoint(-24.0f, -6.0f, -1.0f);
	}

}
