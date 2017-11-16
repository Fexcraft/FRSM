package net.fexcraft.mod.frsm.items.tools;

import java.util.List;

import javax.annotation.Nullable;

import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.guis.GuiHandler;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.lib.api.common.PaintableObject;
import net.fexcraft.mod.lib.api.item.PaintItem;
import net.fexcraft.mod.lib.util.common.Formatter;
import net.fexcraft.mod.lib.util.registry.RegistryUtil;
import net.fexcraft.mod.lib.util.render.RGB;
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
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PaintSet extends Item implements PaintItem {
	
	public static PaintSet[] SETS;
	private RGB color = new RGB();
	private EnumDyeColor dye;
	//private String name;
	private boolean custom = false;
	
	public static void register(){
		SETS = new PaintSet[]{
			new PaintSet(0, EnumDyeColor.byMetadata(0)),
			new PaintSet(1, EnumDyeColor.byMetadata(1)),
			new PaintSet(2, EnumDyeColor.byMetadata(2)),
			new PaintSet(3, EnumDyeColor.byMetadata(3)),
			new PaintSet(4, EnumDyeColor.byMetadata(4)),
			new PaintSet(5, EnumDyeColor.byMetadata(5)),
			new PaintSet(6, EnumDyeColor.byMetadata(6)),
			new PaintSet(7, EnumDyeColor.byMetadata(7)),
			new PaintSet(8, EnumDyeColor.byMetadata(8)),
			new PaintSet(9, EnumDyeColor.byMetadata(9)),
			new PaintSet(10, EnumDyeColor.byMetadata(10)),
			new PaintSet(11, EnumDyeColor.byMetadata(11)),
			new PaintSet(12, EnumDyeColor.byMetadata(12)),
			new PaintSet(13, EnumDyeColor.byMetadata(13)),
			new PaintSet(14, EnumDyeColor.byMetadata(14)),
			new PaintSet(15, EnumDyeColor.byMetadata(15)),
			new PaintSet(16, EnumDyeColor.byMetadata(16), true),
		};
	}
	
	public PaintSet(int name, EnumDyeColor c){
		String id = "paintset" + name;
		this.color.fromDyeColor(c);
		this.dye = c;
		this.setCreativeTab(CD.TOOLS);
		this.setMaxStackSize(1);
		RegistryUtil.get("frsm").addItem(id, this, 1, null);
	}

	public PaintSet(int i, EnumDyeColor meta, boolean b){
		this(i, meta);
		custom = b;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if(world.isRemote){
			return EnumActionResult.PASS;
		}
		else{
			IBlockState state = world.getBlockState(pos);
			if(state.getBlock() instanceof PaintableObject){
				((PaintableObject)state.getBlock()).onPaintItemUse(this.getRGBColor(), this.getColor(), player.getHeldItem(hand), player, pos, world);
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
			else if(state.getBlock().hasTileEntity(state)){
				if(world.getTileEntity(pos) instanceof PaintableObject){
					((PaintableObject)world.getTileEntity(pos)).onPaintItemUse(this.getRGBColor(), this.getColor(), player.getHeldItem(hand), player, pos, world);
				}
			}
			else{
				if(this.getRegistryName().toString().contains("16")){
					player.openGui(FRSM.getInstance(), GuiHandler.RGB, world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
					return EnumActionResult.SUCCESS;
				}
				else return EnumActionResult.PASS;
			}
			return EnumActionResult.SUCCESS;
		}
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

	@Override
	public EnumDyeColor getColor(){
		return dye;
	}

	@Override
	public RGB getRGBColor(){
		return color;
	}
	
}