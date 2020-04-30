package net.fexcraft.mod.frsm.util.block;

import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class LampMaterial extends Material {

	public static final Material INSTANCE = new LampMaterial();

	private LampMaterial(){
		super(MapColor.BLACK);
		setTranslucent();
		setRequiresTool();
	}

	private boolean isTranslucent;
	private boolean requiresNoTool = true;
	private EnumPushReaction mobilityFlag = EnumPushReaction.NORMAL;

	public boolean blocksMovement(){
		return true;
	}

	private LampMaterial setTranslucent(){
		this.isTranslucent = true;
		return this;
	}

	public boolean isOpaque(){
		return this.isTranslucent ? false : this.blocksMovement();
	}

	protected LampMaterial setRequiresTool(){
		this.requiresNoTool = false;
		return this;
	}

	public boolean isToolNotRequired(){
		return this.requiresNoTool;
	}

	public EnumPushReaction getMobilityFlag(){
		return this.mobilityFlag;
	}

	protected LampMaterial setNoPushMobility(){
		this.mobilityFlag = EnumPushReaction.DESTROY;
		return this;
	}

	protected LampMaterial setImmovableMobility(){
		this.mobilityFlag = EnumPushReaction.BLOCK;
		return this;
	}

}