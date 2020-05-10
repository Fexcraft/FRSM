package net.fexcraft.mod.frsm.blocks.other;

import static net.fexcraft.mod.frsm.util.Properties.FACING;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4R;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "window1", burn_time = 600)
public class Window extends Basic4R {
	
	//Exported via FMT AABB Utils
	private static final AxisAlignedBB Z = new AxisAlignedBB(0.0F, 0.0F, 0.34375F, 1.0F, 1.0F, 0.65625F);
	private static final AxisAlignedBB X = new AxisAlignedBB(0.34375F, 0.0F, 0.0F, 0.65625F, 1.0F, 1.0F);
	
	public Window() {
		super(Material.GLASS);
		this.setHarvestLevel("axe", 1);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
		this.setCreativeTab(FRSMTabs.BLOCKS);
	}
    
    @Override
    public BlockRenderLayer getRenderLayer(){
        return BlockRenderLayer.CUTOUT;
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return state.getValue(FACING).getAxis() == Axis.X ? X : Z;
    }
	
	@Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos){
        return getBoundingBox(state, world, pos).offset(pos);
    }
	
}