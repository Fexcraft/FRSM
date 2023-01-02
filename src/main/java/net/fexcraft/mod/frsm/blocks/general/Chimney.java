package net.fexcraft.mod.frsm.blocks.general;

import java.util.Random;

import net.fexcraft.lib.mc.api.registry.fBlock;
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
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@fBlock(modid = FRSM.MODID, name = "chimney", variants = 5)
public class Chimney extends Block {
	
	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 3);

	public Chimney(){
		super(Material.ROCK);
		this.setCreativeTab(FRSMTabs.BLOCKS);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
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
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState state, World w, BlockPos pos, Random random){
		double d0 = (double)((float)pos.getX() + 0.4F + random.nextFloat() * 0.2F);
		double d1 = (double)((float)pos.getY() + 0.7F + random.nextFloat() * 0.3F);
		double d2 = (double)((float)pos.getZ() + 0.4F + random.nextFloat() * 0.2F);
		EnumParticleTypes particle0 = EnumParticleTypes.SMOKE_LARGE;
		EnumParticleTypes particle1 = EnumParticleTypes.SMOKE_NORMAL;
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
		w.spawnParticle(particle0, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		w.spawnParticle(particle1, d0, d1, d2, 0.0D, 0.1D, 0.0D);
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
    	for (int i = 0; i < 5; ++i){
    		list.add(new ItemStack(this, 1, i));
    	}
    }
	
}