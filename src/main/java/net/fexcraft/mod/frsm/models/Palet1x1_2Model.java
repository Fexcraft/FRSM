//FMT-Marker DFM-1.0
//Creator: FEX___96

package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "frsm:models/block/palet1x1_2")
public class Palet1x1_2Model extends GenericModelBase {

	private int textureX = 256;
	private int textureY = 256;

	public Palet1x1_2Model(){
		base = new ModelRendererTurbo[58];
		//
		base[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box01
		base[0].addBox(0, 0, 0, 3, 1, 16, 0f);
		base[0].setRotationPoint(5.0f, -1.0f, -8.0f);

		base[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box02
		base[1].addBox(0, 0, 0, 3, 1, 16, 0f);
		base[1].setRotationPoint(-8.0f, -1.0f, -8.0f);

		base[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box03
		base[2].addBox(0, 0, 0, 3, 1, 16, 0f);
		base[2].setRotationPoint(-1.5f, -1.0f, -8.0f);

		base[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box04
		base[3].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[3].setRotationPoint(-8.0f, -3.0f, -8.0f);

		base[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box05
		base[4].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[4].setRotationPoint(-1.5f, -3.0f, -8.0f);

		base[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box06
		base[5].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[5].setRotationPoint(5.0f, -3.0f, -8.0f);

		base[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box07
		base[6].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[6].setRotationPoint(-8.0f, -3.0f, 5.0f);

		base[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box08
		base[7].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[7].setRotationPoint(5.0f, -3.0f, 5.0f);

		base[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box09
		base[8].addBox(0, 0, 0, 3, 2, 3, 0f);
		base[8].setRotationPoint(-1.5f, -3.0f, 5.0f);

		base[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box10
		base[9].addBox(0, 0, 0, 16, 1, 3, 0f);
		base[9].setRotationPoint(-8.0f, -4.0f, -8.0f);

		base[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box11
		base[10].addBox(0, 0, 0, 16, 1, 3, 0f);
		base[10].setRotationPoint(-8.0f, -4.0f, 5.0f);

		base[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box12
		base[11].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[11].setRotationPoint(-8.0f, -5.0f, -8.0f);

		base[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box13
		base[12].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[12].setRotationPoint(-5.5f, -5.0f, -8.0f);

		base[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box14
		base[13].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[13].setRotationPoint(6.0f, -5.0f, -8.0f);

		base[14] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box15
		base[14].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[14].setRotationPoint(3.5f, -5.0f, -8.0f);

		base[15] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box16
		base[15].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[15].setRotationPoint(0.5f, -5.0f, -8.0f);

		base[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box17
		base[16].addBox(0, 0, 0, 2, 1, 16, 0f);
		base[16].setRotationPoint(-2.5f, -5.0f, -8.0f);

		base[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box18
		base[17].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[17].setRotationPoint(1.8f, -10.0f, -7.8f);

		base[18] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box19
		base[18].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[18].setRotationPoint(-4.5f, -10.0f, -7.8f);

		base[19] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box20
		base[19].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[19].setRotationPoint(1.8f, -10.0f, 0.8f);

		base[20] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box21
		base[20].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[20].setRotationPoint(-4.5f, -10.0f, 0.8f);

		base[21] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box22
		base[21].addBox(0, 0, 0, 3, 5, 8, 0f);
		base[21].setRotationPoint(-7.8f, -10.0f, -7.8f);

		base[22] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box23
		base[22].addBox(0, 0, 0, 3, 5, 7, 0f);
		base[22].setRotationPoint(-7.8f, -10.0f, 0.8f);

		base[23] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box24
		base[23].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[23].setRotationPoint(-8.0f, -11.0f, -7.0f);

		base[24] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box25
		base[24].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[24].setRotationPoint(-8.0f, -11.0f, -2.0f);

		base[25] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box26
		base[25].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[25].setRotationPoint(-8.0f, -11.0f, 6.0f);

		base[26] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box27
		base[26].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[26].setRotationPoint(-8.0f, -11.0f, 1.0f);

		base[27] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box28
		base[27].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[27].setRotationPoint(1.8f, -16.0f, -7.8f);

		base[28] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box29
		base[28].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[28].setRotationPoint(1.8f, -16.0f, 0.8f);

		base[29] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box30
		base[29].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[29].setRotationPoint(-4.5f, -16.0f, 0.8f);

		base[30] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box31
		base[30].addBox(0, 0, 0, 3, 5, 7, 0f);
		base[30].setRotationPoint(-7.8f, -16.0f, 0.8f);

		base[31] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box32
		base[31].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[31].setRotationPoint(-4.5f, -16.0f, -7.8f);

		base[32] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box33
		base[32].addBox(0, 0, 0, 3, 5, 8, 0f);
		base[32].setRotationPoint(-7.8f, -16.0f, -7.8f);

		base[33] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box_33
		base[33].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[33].setRotationPoint(-8.0f, -17.0f, -7.0f);

		base[34] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box_34
		base[34].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[34].setRotationPoint(-8.0f, -17.0f, -2.0f);

		base[35] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box_35
		base[35].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[35].setRotationPoint(-8.0f, -17.0f, 1.0f);

		base[36] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box_36
		base[36].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[36].setRotationPoint(-8.0f, -17.0f, 6.0f);

		base[37] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box37
		base[37].addBox(0, 0, 0, 16, 3, 16, 0f);
		base[37].setRotationPoint(-8.0f, -32.0f, -8.0f);

		base[38] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box_38
		base[38].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[38].setRotationPoint(1.8f, -22.0f, -7.8f);

		base[39] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box_39
		base[39].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[39].setRotationPoint(1.8f, -22.0f, 0.8f);

		base[40] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box_40
		base[40].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[40].setRotationPoint(-4.5f, -22.0f, 0.8f);

		base[41] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box_41
		base[41].addBox(0, 0, 0, 3, 5, 7, 0f);
		base[41].setRotationPoint(-7.8f, -22.0f, 0.8f);

		base[42] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box_42
		base[42].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[42].setRotationPoint(-4.5f, -22.0f, -7.8f);

		base[43] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box_43
		base[43].addBox(0, 0, 0, 3, 5, 8, 0f);
		base[43].setRotationPoint(-7.8f, -22.0f, -7.8f);

		base[44] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box_44
		base[44].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[44].setRotationPoint(-8.0f, -23.0f, -7.0f);

		base[45] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box_45
		base[45].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[45].setRotationPoint(-8.0f, -23.0f, -2.0f);

		base[46] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box_46
		base[46].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[46].setRotationPoint(-8.0f, -23.0f, 1.0f);

		base[47] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box_47
		base[47].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[47].setRotationPoint(-8.0f, -23.0f, 6.0f);

		base[48] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box_48
		base[48].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[48].setRotationPoint(1.8f, -28.0f, 0.8f);

		base[49] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box_49
		base[49].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[49].setRotationPoint(1.8f, -28.0f, -7.8f);

		base[50] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box_50
		base[50].addBox(0, 0, 0, 6, 5, 7, 0f);
		base[50].setRotationPoint(-4.5f, -28.0f, 0.8f);

		base[51] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box_51
		base[51].addBox(0, 0, 0, 6, 5, 8, 0f);
		base[51].setRotationPoint(-4.5f, -28.0f, -7.8f);

		base[52] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box_52
		base[52].addBox(0, 0, 0, 3, 5, 7, 0f);
		base[52].setRotationPoint(-7.8f, -28.0f, 0.8f);

		base[53] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box_53
		base[53].addBox(0, 0, 0, 3, 5, 8, 0f);
		base[53].setRotationPoint(-7.8f, -28.0f, -7.8f);

		base[54] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box_54
		base[54].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[54].setRotationPoint(-8.0f, -29.0f, -7.0f);

		base[55] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box_55
		base[55].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[55].setRotationPoint(-8.0f, -29.0f, -2.0f);

		base[56] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box_56
		base[56].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[56].setRotationPoint(-8.0f, -29.0f, 1.0f);

		base[57] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box_57
		base[57].addBox(0, 0, 0, 16, 1, 1, 0f);
		base[57].setRotationPoint(-8.0f, -29.0f, 6.0f);
	}

}
