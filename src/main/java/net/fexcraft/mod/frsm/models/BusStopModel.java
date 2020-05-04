// Date: 14.02.2015 14:14:07
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
@fModel(registryname = "frsm:models/block/busstop")
public class BusStopModel extends GenericModelBase {

	private int textureX = 64;
	private int textureY = 64;

	public BusStopModel(){
		base = new ModelRendererTurbo[3];
		//
		base[0] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Shape1
		base[0].addBox(0, 0, 0, 8, 1, 8, 0f);
		base[0].setRotationPoint(-4.0f, 1.0f, -4.0f);

		base[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape2
		base[1].addBox(0, 0, 0, 2, 33, 1, 0f);
		base[1].setRotationPoint(-1.0f, -32.0f, -1.0f);

		base[2] = new ModelRendererTurbo(this, 9, 10, textureX, textureY); // Shape3
		base[2].addBox(0, 0, 0, 12, 12, 1, 0f);
		base[2].setRotationPoint(-6.0f, -35.0f, -1.5f);
	}

}