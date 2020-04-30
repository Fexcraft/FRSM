package net.fexcraft.mod.frsm.blocks.streetlamps;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "streetlamp_post", tileentity = StreetLampPostEntity.class)
public class StreetLampPost extends BlockContainer {

	public StreetLampPost(){
		super(Material.IRON);
		this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(3.0F);
    	this.setResistance(32.0F);
		this.setCreativeTab(FRSMTabs.STREETS);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new StreetLampPostEntity();
	}
	
    @Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state){
        return false;
    }
	
	@Override
	public boolean isOpaqueCube(IBlockState state){
        return false;
    }
	
}