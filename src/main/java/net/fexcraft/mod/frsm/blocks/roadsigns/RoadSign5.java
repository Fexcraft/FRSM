package net.fexcraft.mod.frsm.blocks.roadsigns;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "roadsign5", tileentity = RoadSign5.TE.class)
public class RoadSign5 extends BasicContainer4R {
	
	public RoadSign5() {
		super(Material.GRASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.STREETS);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.4F, 0.0F, 0.4F, 0.6F, 2.2F, 0.6F);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TE();
	}

	public static class TE extends TileEntity {}
	
}