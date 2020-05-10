package net.fexcraft.mod.frsm.guis.client;

import net.fexcraft.lib.mc.gui.GenericGui;
import net.fexcraft.mod.frsm.guis.server.ContainerPalet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class GuiPalet extends GenericGui<ContainerPalet> {

	private static final ResourceLocation palet1loc = new ResourceLocation("frsm:textures/gui/palet1x1_1.png");
	private static final ResourceLocation palet2loc = new ResourceLocation("frsm:textures/gui/palet1x1_2.png");

	public GuiPalet(EntityPlayer player, TileEntity entity, boolean large){
		super(large ? palet2loc : palet1loc, new ContainerPalet(player, entity), player);
		this.defbackground = true;
		this.deftexrect = true;
		this.xSize = 176;
		this.ySize = large ? 220 : 166;
	}

	@Override
	protected void init(){
		//
	}

	@Override
	protected void predraw(float pticks, int mouseX, int mouseY){
		//
	}

	@Override
	protected void drawbackground(float pticks, int mouseX, int mouseY){
		//
	}

	@Override
	protected boolean buttonClicked(int mouseX, int mouseY, int mouseButton, String key, BasicButton button){
		//
		return false;
	}

	@Override
	protected void scrollwheel(int am, int x, int y){
		//
	}

}
