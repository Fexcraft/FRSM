package net.fexcraft.mod.frsm.items;

import java.util.List;

import javax.annotation.Nullable;

import net.fexcraft.lib.common.math.RGB;
import net.fexcraft.lib.mc.capabilities.FCLCapabilities;
import net.fexcraft.lib.mc.registry.FCLRegistry;
import net.fexcraft.lib.mc.utils.Formatter;
import net.fexcraft.lib.mc.utils.Print;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.guis.GuiHandler;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.DyePaintable;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PaintSet extends Item {
	
	public static PaintSet[] SETS;
	private RGB color = new RGB();
	private EnumDyeColor dye;
	//private String name;
	private boolean custom = false;
	
	public static void register(){
		SETS = new PaintSet[17];
		for(int i = 0; i < 17; i++){
			SETS[i] = new PaintSet(i, i == 16);
		}
	}
	
	public PaintSet(int name){
		String id = "paintset" + name;
		this.dye = EnumDyeColor.byMetadata(name);
		this.color = RGB.fromDyeColor(dye);
		this.setCreativeTab(FRSMTabs.TOOLS);
		this.setMaxStackSize(1);
		FCLRegistry.getAutoRegistry("frsm").addItem(id, this, 1, null);
	}

	public PaintSet(int i, boolean b){
		this(i);
		custom = b;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if(world.isRemote) return EnumActionResult.PASS;
		//
		IBlockState state = world.getBlockState(pos); TileEntity tile;
		if(state.getBlock() instanceof DyePaintable){
			((DyePaintable)state.getBlock()).onPaintItemUse(color, dye, player.getHeldItem(hand), player, pos, world);
		}
		else if(state.getBlock() == Blocks.WOOL){
			world.setBlockState(pos, Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, dye));
		}
		else if(state.getBlock() == Blocks.STAINED_HARDENED_CLAY){
			world.setBlockState(pos, Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, dye));
		}
		else if(state.getBlock() instanceof BlockStainedGlass){
			world.setBlockState(pos, Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockColored.COLOR, dye));
		}
		else if(state.getBlock() instanceof BlockStainedGlassPane){
			world.setBlockState(pos, Blocks.STAINED_GLASS_PANE.getDefaultState().withProperty(BlockColored.COLOR, dye));
		}
		else if(state.getBlock() instanceof BlockCarpet){
			world.setBlockState(pos, Blocks.CARPET.getDefaultState().withProperty(BlockColored.COLOR, dye));
		}
		else if((tile = world.getTileEntity(pos)) != null){
			if(tile.hasCapability(FCLCapabilities.PAINTABLE, facing)){
				tile.getCapability(FCLCapabilities.PAINTABLE, facing).setColor(color);
				Print.bar(player, "Color Updated! " + color.toString() + "-[" + dye.getDyeColorName() + "];");
				tile.getCapability(FCLCapabilities.PAINTABLE, facing).updateClient();
				return EnumActionResult.SUCCESS;
			} return EnumActionResult.PASS;
		}
		else{
			if(custom){
				player.openGui(FRSM.getInstance(), GuiHandler.RGB, world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
				return EnumActionResult.SUCCESS;
			} return EnumActionResult.PASS;
		}
		return EnumActionResult.SUCCESS;
    }

	@Override
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced){
		tooltip.add(Formatter.format("&6" + color.toString()));
		if(custom){
			tooltip.add(Formatter.format("&3Customisable"));
		}
		else{
			tooltip.add(Formatter.format("&a" + dye.getName()));
		}
    }
	
}