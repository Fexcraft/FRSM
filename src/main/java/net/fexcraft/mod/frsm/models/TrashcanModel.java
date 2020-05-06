//FMT-Marker FVTM-1.4
package net.fexcraft.mod.frsm.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.frsm.util.FVTMFormatModel;
import net.fexcraft.mod.frsm.util.Properties;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.4.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 *  
 * @author Ferdinand (FEX___96)
 */
@fModel(registryname = "frsm:models/block/trashcan")
public class TrashcanModel extends FVTMFormatModel {

	public TrashcanModel(){
		super(); textureX = 64; textureY = 64;
		//
		TurboList base = new TurboList("base");
		base.add(new ModelRendererTurbo(base, 0, 44, textureX, textureY).addHollowCylinder(0, -2, 0, 8, 0.001f, 2, 16, 0, 0.875f, 0.75f, 4,
			null, new boolean[]{ false, false, false, true }));
		base.add(new ModelRendererTurbo(base, 41, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-2, -21, -8.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 32, 0, textureX, textureY).addHollowCylinder(0, -2, 0, 8, 7, 16, 16, 0, 0.9375f, 0.875f, 4, null)
			.setRotationPoint(0, -16, 0).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 0, 0, textureX, textureY).addHollowCylinder(0, -2, 0, 8, 7, 4, 16, 0, 1, 1, 4, null)
			.setRotationPoint(0, -20, 0).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 32, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-2, -21, 7.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(base);
		//
		TurboList cover = new TurboList("cover");
		cover.add(new ModelRendererTurbo(cover, 52, 48, textureX, textureY)
			.addBox(-0.5f, 0.5f, 1.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(0, -25, 0).setRotationAngle(0, 0, 0)
		);
		cover.add(new ModelRendererTurbo(cover, 0, 24, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 0.001f, 2, 16, 0, 1, 0.875f, 5,
			null, new boolean[]{ false, false, false, true })
			.setRotationPoint(0, -24, 0).setRotationAngle(0, 0, 0)
		);
		cover.add(new ModelRendererTurbo(cover, 56, 48, textureX, textureY)
			.addBox(-0.5f, 0.5f, -2.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(0, -25, 0).setRotationAngle(0, 0, 0)
		);
		cover.add(new ModelRendererTurbo(cover, 45, 48, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -2.5f, 1, 1, 5, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -25, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(cover);
	}

	@Override
	public Collection<ModelRendererTurbo> getPolygons(IBlockState state, EnumFacing side, Map<String, String> args, long rand){
		ArrayList<ModelRendererTurbo> mrts = new ArrayList<>();
		mrts.addAll(groups.get(0));
		if(!state.getValue(Properties.OPEN)){
			mrts.addAll(groups.get(1));
		}
		return mrts;
	}

}
