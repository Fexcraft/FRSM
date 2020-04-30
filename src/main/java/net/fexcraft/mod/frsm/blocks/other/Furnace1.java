package net.fexcraft.mod.frsm.blocks.other;

import static net.fexcraft.mod.frsm.util.Properties.FACING;

import java.util.List;

import javax.annotation.Nullable;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.lib.mc.registry.FCLRegistry;
import net.fexcraft.lib.mc.utils.Formatter;
import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.frsm.util.block.FBC_4R;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@fBlock(modid = FI.MODID, name = "furnace1", item = Furnace1.Item.class, tileentity = Furnace1.Entity.class)
public class Furnace1 extends FBC_4R {
	
	public Furnace1() {
    	super(Material.IRON);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(3.0F);
    	this.setResistance(32.0F);
    	this.setCreativeTab(CD.BLOCKS);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new Furnace1.Entity();
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
	}
	
    @Override
    public boolean onBlockActivated(World w, BlockPos pos, IBlockState state, EntityPlayer p, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
    	EnumFacing ef = (EnumFacing)state.getValue(FACING);
		if(!p.getHeldItemMainhand().isEmpty() && p.getHeldItemMainhand().getItem() == Items.FLINT_AND_STEEL){
			w.setBlockState(pos, FCLRegistry.getBlock("frsm:furnace1b").getDefaultState().withProperty(FACING, ef));
			p.getHeldItemMainhand().damageItem(1, p);
			return true;
		}
		return false;
    }
    
    public static class Entity extends TileEntity {}
    
    public static class Item extends ItemBlock {

		public Item(Block block){ super(block); }
		
	    @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag flag){
	    	tooltip.add(Formatter.format("&9Rightlick with &7Flint and Steel&9 to put the fire on."));
	    }
    	
    }

}