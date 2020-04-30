package net.fexcraft.mod.frsm.blocks.general;

import static net.fexcraft.mod.frsm.util.Properties.DYECOLOR;

import net.fexcraft.lib.common.math.RGB;
import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.registry.FCLRegistry;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.DyePaintable;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FM;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@fBlock(modid = FI.MODID, name = "lampoff", variants = 16, burn_time = 100, item = Lamp.IB.class)
public class LampOff extends Block implements DyePaintable {
	
	public LampOff() {
		super(FM.normal);
		this.setHarvestLevel("axe", 1);
		this.setHardness(1.0F);
		this.setResistance(32.0F);
		this.setCreativeTab(CD.EXPERIMENTAL);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.4F, 1.0F, 0.4F, 0.6F, 0.9F, 0.6F);
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
	
    @Override
    public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
    	if(!w.isRemote && !p.getHeldItemMainhand().isEmpty()){
    		w.setBlockState(pos, FCLRegistry.getBlock("frsm:lamp").getDefaultState().withProperty(DYECOLOR, state.getValue(DYECOLOR)));
    	}
		return true;
	}
    
    @Override
    public int damageDropped(IBlockState state){
        return ((EnumDyeColor)state.getValue(DYECOLOR)).getMetadata();
    }
    
    @SideOnly(Side.CLIENT) @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list){
        for (int i = 0; i < 16; ++i){
            list.add(new ItemStack(this, 1, i));
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(DYECOLOR, EnumDyeColor.byMetadata(meta));
    }
    
    @Override
    public int getMetaFromState(IBlockState state){
        return ((EnumDyeColor)state.getValue(DYECOLOR)).getMetadata();
    }
    
    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, DYECOLOR);
    }

	@Override
	public void onPaintItemUse(RGB rgb, EnumDyeColor color, ItemStack stack, EntityPlayer player, BlockPos pos, World world){
		world.setBlockState(pos, this.getDefaultState().withProperty(DYECOLOR, color));
	}
	
}