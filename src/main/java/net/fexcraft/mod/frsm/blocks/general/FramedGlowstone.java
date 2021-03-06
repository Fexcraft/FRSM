package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.registry.ItemBlock16;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@fBlock(modid = FRSM.MODID, name = "framedglowstone", variants = 6, item = FramedGlowstone.IB.class, burn_time = 900)
public class FramedGlowstone extends Block {
	
	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 5);
	
    public FramedGlowstone(){
        super(Material.WOOD);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(1.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(FRSMTabs.BLOCKS);
    }
    
	public static class IB extends ItemBlock16 {
		
		public IB(Block block){
			super(block);
		}
		
		@Override
		public int getMetadata(int meta){
			return meta >= 6 ? 0 : meta;
		}
		
	}
	
    @Override
    public int damageDropped(IBlockState state){
        return state.getValue(TYPE);
    }
    
    @Override
    protected BlockStateContainer createBlockState(){
    	return new BlockStateContainer(this, new IProperty[] {TYPE});
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta){
    	return this.getDefaultState().withProperty(TYPE, Integer.valueOf(meta));
    }
    
    @Override
    public int getMetaFromState(IBlockState state){
    	return state.getValue(TYPE).intValue();
    }
    
    @SideOnly(Side.CLIENT) @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list){
    	for (int i = 0; i < 6; ++i){
    		list.add(new ItemStack(this, 1, i));
    	}
    }
    
}