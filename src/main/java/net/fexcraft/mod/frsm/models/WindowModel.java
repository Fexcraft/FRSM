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
@fModel(registryname = "frsm:models/block/window")
public class WindowModel extends GenericModelBase {

	private int textureX = 64;
	private int textureY = 64;

	public WindowModel(){
		base = new ModelRendererTurbo[7];
		//
		base[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Shape1
		base[0].addBox(0, 0, 0, 16, 2, 4, 0f);
		base[0].setRotationPoint(-8.0f, -2.0f, -2.0f);

		base[1] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Shape2
		base[1].addBox(0, 0, 0, 3, 12, 2, 0f);
		base[1].setRotationPoint(-8.0f, -14.0f, -1.0f);

		base[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Shape3
		base[2].addBox(0, 0, 0, 3, 12, 2, 0f);
		base[2].setRotationPoint(5.0f, -14.0f, -1.0f);

		base[3] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Shape4
		base[3].addBox(0, 0, 0, 16, 2, 5, 0f);
		base[3].setRotationPoint(-8.0f, -16.0f, -2.5f);

		base[4] = new ModelRendererTurbo(this, 11, 7, textureX, textureY); // Shape5
		base[4].addBox(0, 0, 0, 10, 12, 0, 0f);
		base[4].setRotationPoint(-5.0f, -14.0f, 0.0f);

		base[5] = new ModelRendererTurbo(this, 32, 7, textureX, textureY); // Shape6
		base[5].addBox(0, 0, 0, 1, 1, 1, 0f);
		base[5].setRotationPoint(-7.0f, -9.0f, -2.0f);

		base[6] = new ModelRendererTurbo(this, 32, 10, textureX, textureY); // Shape7
		base[6].addBox(0, 0, 0, 1, 3, 1, 0f);
		base[6].setRotationPoint(-7.0f, -9.0f, -3.0f);
	}

}
