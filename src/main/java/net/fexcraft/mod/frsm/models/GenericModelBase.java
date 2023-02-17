package net.fexcraft.mod.frsm.models;

import net.fexcraft.lib.common.math.RGB;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

import java.util.ArrayList;

public class GenericModelBase extends ModelBase {

    public ModelRendererTurbo[] base, open, closed, r0, r1, r2, r3, r4;

    public void translate(float x, float y, float z){}

    public void applyColor(ModelRendererTurbo[] mrt, RGB color) {}

    public void addAll(ArrayList<ModelRendererTurbo> mrts, ModelRendererTurbo[] mrts1) {}

    public void render(){}
}
