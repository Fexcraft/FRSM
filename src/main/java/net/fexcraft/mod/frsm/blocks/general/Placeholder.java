package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;

@fBlock(modid = FRSM.MODID, name = "placeholder")
public class Placeholder extends Block {
	
	public Placeholder(){
        super(Material.BARRIER);
		this.setCreativeTab(FRSMTabs.EXPERIMENTAL);
    }
    
    @Override
    public boolean isFullBlock(IBlockState state) {
    	return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }
    
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.INVISIBLE;
    }
    
}