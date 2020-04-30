package net.fexcraft.mod.frsm.blocks.other;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4RFalling;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "trashcan", tileentity = Trashcan.Entity.class)
public class Trashcan extends BasicContainer4RFalling {

	public Trashcan(){
		super(Material.ANVIL);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(5.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.BLOCKS);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Trashcan.Entity();
	}
	
	public static class Entity extends TileEntity {}

	
}