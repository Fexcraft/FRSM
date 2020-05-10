package net.fexcraft.mod.frsm.blocks.machines;

import static net.fexcraft.mod.frsm.util.Properties.COLOR;
import static net.fexcraft.mod.frsm.util.Properties.FACING;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.items.PaintableInfo;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.fexcraft.mod.frsm.util.block.PaintableTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.property.IExtendedBlockState;

@fBlock(modid = FRSM.MODID, name = "pchardware2", tileentity = PCHardware2.Entity.class, item = PaintableInfo.class)
public class PCHardware2 extends BasicContainer4R {

	public PCHardware2(){
		super(Material.GLASS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.TECHNIC);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new Entity();
	}
	
	@Override
    protected BlockStateContainer createBlockState(){
		return new BlockStateContainer.Builder(this).add(FACING).add(COLOR).build();
    }
	
	@Override
	public IExtendedBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos){
		Entity ent = (Entity)world.getTileEntity(pos);
		if(ent == null){
			return ((IExtendedBlockState)state).withProperty(COLOR, 0);
		}
		else return ((IExtendedBlockState)state).withProperty(COLOR, ent.getColor().packed);
	}

	public static class Entity extends PaintableTileEntity {}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }

}