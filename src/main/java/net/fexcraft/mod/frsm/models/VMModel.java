//FMT-Marker DFM-1.0
//Creator: TCNEX Imported

package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.GenericModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 *  
 *  @author Ferdinand (FEX___96)
 */
@fModel(registryname = "frsm:models/block/vendingmachine")
public class VMModel extends GenericModelBase {

	private int textureX = 256;
	private int textureY = 256;

	public VMModel(){
		base = new ModelRendererTurbo[32];
		base[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape1
		base[0].addBox(0, 0, 0, 16, 4, 16, 0f);
		base[0].setRotationPoint(-8.0f, -4.0f, -8.0f);

		base[1] = new ModelRendererTurbo(this, 0, 21, textureX, textureY); // Shape2
		base[1].addBox(0, 23, 0, 3, 26, 16, 0f);
		base[1].setRotationPoint(5.0f, -53.0f, -8.0f);

		base[2] = new ModelRendererTurbo(this, 39, 21, textureX, textureY); // Shape3
		base[2].addBox(0, 0, 0, 1, 26, 16, 0f);
		base[2].setRotationPoint(-8.0f, -30.0f, -8.0f);

		base[3] = new ModelRendererTurbo(this, 65, 0, textureX, textureY); // Shape4
		base[3].addBox(0, 0, 0, 12, 26, 1, 0f);
		base[3].setRotationPoint(-7.0f, -30.0f, 7.0f);

		base[4] = new ModelRendererTurbo(this, 92, 0, textureX, textureY); // Shape5
		base[4].addBox(0, 0, 0, 16, 2, 16, 0f);
		base[4].setRotationPoint(-8.0f, -32.0f, -8.0f);

		base[5] = new ModelRendererTurbo(this, 23, 21, textureX, textureY); // Shape6
		base[5].addBox(0, 0, 0, 12, 2, 3, 0f);
		base[5].setRotationPoint(-7.0f, -9.0f, -8.0f);

		base[6] = new ModelRendererTurbo(this, 74, 28, textureX, textureY); // Shape7
		base[6].addBox(0, 0, 0, 12, 0, 8, 0f);
		base[6].setRotationPoint(-7.0f, -9.0f, -1.0f);

		base[7] = new ModelRendererTurbo(this, 74, 28, textureX, textureY); // Shape8
		base[7].addBox(0, 0, 0, 12, 0, 8, 0f);
		base[7].setRotationPoint(-7.0f, -14.0f, -1.0f);

		base[8] = new ModelRendererTurbo(this, 74, 28, textureX, textureY); // Shape9
		base[8].addBox(0, 0, 0, 12, 0, 8, 0f);
		base[8].setRotationPoint(-7.0f, -19.0f, -1.0f);

		base[9] = new ModelRendererTurbo(this, 74, 37, textureX, textureY); // Shape10
		base[9].addBox(0, 0, 0, 12, 4, 6, 0f);
		base[9].setRotationPoint(-7.0f, -8.0f, 1.0f);

		base[10] = new ModelRendererTurbo(this, 74, 28, textureX, textureY); // Shape11
		base[10].addBox(0, 0, 0, 12, 0, 8, 0f);
		base[10].setRotationPoint(-7.0f, -24.0f, -1.0f);

		base[11] = new ModelRendererTurbo(this, 74, 48, textureX, textureY); // Shape12
		base[11].addBox(0, 0, 0, 12, 1, 12, 0f);
		base[11].setRotationPoint(-7.0f, -31.0f, -5.0f);

		base[12] = new ModelRendererTurbo(this, 115, 19, textureX, textureY); // Shape13
		base[12].addBox(0, 0, 0, 12, 21, 0, 0f);
		base[12].setRotationPoint(-7.0f, -30.0f, -7.0f);

		base[13] = new ModelRendererTurbo(this, 124, 34, textureX, textureY); // Shape14
		base[13].addBox(0, 0, 0, 0, 17, 7, 0f);
		base[13].setRotationPoint(-4.0f, -26.0f, 0.0f);

		base[14] = new ModelRendererTurbo(this, 124, 34, textureX, textureY); // Shape15
		base[14].addBox(0, 0, 0, 0, 17, 7, 0f);
		base[14].setRotationPoint(-1.0f, -26.0f, 0.0f);

		base[15] = new ModelRendererTurbo(this, 124, 34, textureX, textureY); // Shape16
		base[15].addBox(0, 0, 0, 0, 17, 7, 0f);
		base[15].setRotationPoint(2.0f, -26.0f, 0.0f);

		base[16] = new ModelRendererTurbo(this, 92, 19, textureX, textureY); // Shape171
		base[16].addBox(0, 0, 0, 2, 4, 1, 0f);
		base[16].setRotationPoint(-0.5f, -13.0f, 5.0f);

		base[17] = new ModelRendererTurbo(this, 92, 19, textureX, textureY); // Shape172
		base[17].addBox(0, 0, 0, 2, 4, 1, 0f);
		base[17].setRotationPoint(-0.5f, -13.0f, 3.0f);

		base[18] = new ModelRendererTurbo(this, 92, 19, textureX, textureY); // Shape173
		base[18].addBox(0, 0, 0, 2, 4, 1, 0f);
		base[18].setRotationPoint(-0.5f, -13.0f, 1.0f);

		base[19] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Shape181
		base[19].addBox(0, 0, 0, 2, 1, 1, 0f);
		base[19].setRotationPoint(-3.5f, -20.0f, 6.0f);

		base[20] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Shape182
		base[20].addBox(0, 0, 0, 2, 1, 1, 0f);
		base[20].setRotationPoint(-3.5f, -20.0f, 4.0f);

		base[21] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Shape183
		base[21].addBox(0, 0, 0, 2, 1, 1, 0f);
		base[21].setRotationPoint(-3.5f, -20.0f, 2.0f);

		base[22] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Shape184
		base[22].addBox(0, 0, 0, 2, 1, 1, 0f);
		base[22].setRotationPoint(-3.5f, -20.0f, 0.0f);

		base[23] = new ModelRendererTurbo(this, 99, 19, textureX, textureY); // Shape191
		base[23].addBox(0, 0, 0, 2, 3, 2, 0f);
		base[23].setRotationPoint(-6.5f, -27.0f, 3.0f);

		base[24] = new ModelRendererTurbo(this, 99, 19, textureX, textureY); // Shape192
		base[24].addBox(0, 0, 0, 2, 3, 2, 0f);
		base[24].setRotationPoint(-6.5f, -27.0f, 0.0f);

		base[25] = new ModelRendererTurbo(this, 58, 31, textureX, textureY); // Shape201
		base[25].addBox(0, 0, 0, 2, 3, 2, 0f);
		base[25].setRotationPoint(-0.5f, -22.0f, 3.0f);

		base[26] = new ModelRendererTurbo(this, 58, 31, textureX, textureY); // Shape202
		base[26].addBox(0, 0, 0, 2, 3, 2, 0f);
		base[26].setRotationPoint(-0.5f, -22.0f, 0.0f);

		base[27] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Shape211
		base[27].addBox(0, 0, 0, 2, 2, 1, 0f);
		base[27].setRotationPoint(-6.5f, -11.0f, 2.0f);

		base[28] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Shape212
		base[28].addBox(0, 0, 0, 2, 2, 1, 0f);
		base[28].setRotationPoint(-6.5f, -11.0f, 0.0f);

		base[29] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Shape221
		base[29].addBox(0, 0, 0, 2, 4, 1, 0f);
		base[29].setRotationPoint(2.5f, -18.0f, 5.0f);

		base[30] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Shape222
		base[30].addBox(0, 0, 0, 2, 4, 1, 0f);
		base[30].setRotationPoint(2.5f, -18.0f, 3.0f);

		base[31] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Shape223
		base[31].addBox(0, 0, 0, 2, 4, 1, 0f);
		base[31].setRotationPoint(2.5f, -18.0f, 1.0f);
	}

}
