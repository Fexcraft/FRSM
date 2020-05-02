//FMT-Marker FVTM-1.4
package net.fexcraft.mod.frsm.models;

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
 *  @author Ferdinand (FEX___96)
 */
@fModel(registryname = "frsm:models/block/stove")
public class StoveModel extends FVTMFormatModel {

	public StoveModel(){
		super(); textureX = 128; textureY = 128;
		//
		TurboList door = new TurboList("door");
		door.add(new ModelRendererTurbo(door, 26, 34, textureX, textureY).addBox(0, -10, 0, 1, 11, 1)
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 121, 24, textureX, textureY).addBox(0, -10, 15, 1, 11, 1)
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 85, 51, textureX, textureY)
			.addBox(0, 0, 1, 1, 1, 14, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 0, 49, textureX, textureY)
			.addBox(0, -10, 1, 1, 2, 14, 0, 1f, new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 38, 49, textureX, textureY).addBox(0.5f, -8, 1, 0, 8, 14)
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 21, 47, textureX, textureY)
			.addShapeBox(0.75f, -9.5f, 1, 1, 1, 14, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(6.5f, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 13, 6, textureX, textureY)
			.addShapeBox(0.25f, -9.5f, 3, 1, 1, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		door.add(new ModelRendererTurbo(door, 13, 3, textureX, textureY)
			.addShapeBox(0.25f, -9.5f, 12, 1, 1, 1, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(6, -2, -8).setRotationAngle(0, 0, 0)
		);
		this.groups.add(door);
		//
		TurboList base = new TurboList("base");
		base.add(new ModelRendererTurbo(base, 47, 26, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 2, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(3, -1, -7).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 47, 14, textureX, textureY).addBox(0, 0, 0, 14, 1, 16)
			.setRotationPoint(-8, -2, -8).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 118, 7, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 1.25f, 1, 16, 0, 1.125f, 1.375f, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(-4, -14.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 116, 24, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 6, 0, 0.625f, 0.875f, 4,
			new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0), new boolean[]{ false, true, false, false })
			.setRotationPoint(6.75f, -13, -6).setRotationAngle(0, 0, 65)
		);
		base.add(new ModelRendererTurbo(base, 100, 25, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 2, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-7, -1, -7).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 38, 25, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 2, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(3, -1, 5).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 21, 25, textureX, textureY)
			.addBox(0, 0, 0, 2, 1, 2, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(-7, -1, 5).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 78, 3, textureX, textureY)
			.addBox(0, 0, 0, 14, 10, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8, -12, -8).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 47, 3, textureX, textureY)
			.addBox(0, 0, 0, 14, 10, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-8, -12, 7).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 70, 45, textureX, textureY)
			.addBox(0, 0, 0, 1, 10, 14, 0, 1f, new boolean[]{ false, false, true, true, true, true })
			.setRotationPoint(-8, -12, -7).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 16, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, -14, -8).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 78, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-8, -15, -8).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 47, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-8, -15, 7).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 54, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, true, true, true })
			.setRotationPoint(-8, -15, -7).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 54, 24, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 8, 0, 0.625f, 1.375f, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(-4, -14.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 109, 7, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 1.25f, 1, 16, 0, 1, 1.25f, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(-4, -14.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 33, 24, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 8, 0, 0.5f, 1.25f, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(-4, -14.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 118, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 1.25f, 1, 16, 0, 0.75f, 1, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(2.5f, -14.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 97, 23, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 8, 0, 0.5f, 1, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(2.5f, -14.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 109, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 1.25f, 1, 16, 0, 1, 1.25f, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(2.5f, -14.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 92, 23, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 8, 0, 0.5f, 1.25f, 4,
			null, new boolean[]{ false, true, false, false })
			.setRotationPoint(2.5f, -14.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 119, 14, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 6, 0, 0.625f, 0.875f, 4,
			new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0), new boolean[]{ false, true, false, false })
			.setRotationPoint(6.75f, -13, -4.5f).setRotationAngle(0, 0, 65)
		);
		base.add(new ModelRendererTurbo(base, 114, 14, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 6, 0, 0.625f, 0.875f, 4,
			new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0), new boolean[]{ false, true, false, false })
			.setRotationPoint(6.75f, -13, 5).setRotationAngle(0, 0, 65)
		);
		base.add(new ModelRendererTurbo(base, 10, 9, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 6, 0, 0.625f, 0.875f, 4,
			new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0), new boolean[]{ false, true, false, false })
			.setRotationPoint(6.75f, -13, 6.5f).setRotationAngle(0, 0, 65)
		);
		base.add(new ModelRendererTurbo(base, 5, 9, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 6, 0, 0.625f, 0.875f, 4,
			new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0), new boolean[]{ false, true, false, false })
			.setRotationPoint(6.75f, -13, -2).setRotationAngle(0, 0, 65)
		);
		base.add(new ModelRendererTurbo(base, 0, 9, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.001f, 1, 6, 0, 0.625f, 0.875f, 4,
			new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0), new boolean[]{ false, true, false, false })
			.setRotationPoint(6.75f, -13, 2).setRotationAngle(0, 0, 65)
		);
		base.add(new ModelRendererTurbo(base, 13, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0,
				new boolean[]{ true, true, false, false, true, true })
			.setRotationPoint(6.4f, -13.3625f, -1).setRotationAngle(0, 0, 64)
		);
		this.groups.add(base);
		//
		TurboList inner = new TurboList("inner");
		inner.add(new ModelRendererTurbo(inner, 104, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(-5, -4, 6).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 42, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, true, false, false, true, false })
			.setRotationPoint(-5, -4, -7).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 21, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(-5, -7, 6).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 92, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, true, false, false, true, false })
			.setRotationPoint(-5, -7, -7).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 42, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(-5, -10, 6).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 21, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0,
				new boolean[]{ false, true, false, false, true, false })
			.setRotationPoint(-5, -10, -7).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 34, 32, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 10, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-5, -3.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 0, 19, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 10, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-5, -9.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 92, 17, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-5, -6.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 92, 14, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, true, false, false, false, false })
			.setRotationPoint(-5, -6.75f, 5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 101, 38, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, true, false, false, true, true })
			.setRotationPoint(-5, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 12, 36, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(4, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 0, 34, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(2.25f, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 78, 32, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(0.25f, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 55, 32, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-3.25f, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 98, 25, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0,
				new boolean[]{ false, false, false, false, true, true })
			.setRotationPoint(-1.5f, -6.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 0, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(3, 2).setLength(1).setSegments(16, 0).setScale(0.25f, 1).setDirection(3)
			.setRadialTexture(0, 0).setSidesVisible(false, false, false, false).setTopOffset(new net.fexcraft.lib.common.math.Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(1.0, 0.0, 46.0)).build()
			.setRotationPoint(-7, -7, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(inner);
	}

	@Override
	public Collection<ModelRendererTurbo> getPolygons(IBlockState state, EnumFacing side, Map<String, String> args, long rand){
		boolean bool = state.getValue(Properties.OPEN);
		groups.get(0).forEach(mrt -> {
			mrt.rotationAngleZ = bool ? 80 : 0;
		});
		return super.getPolygons(state, side, args, rand);
	}

}
