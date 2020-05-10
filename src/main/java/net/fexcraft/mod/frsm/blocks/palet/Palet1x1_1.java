package net.fexcraft.mod.frsm.blocks.palet;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.guis.GuiHandler;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "palet1x1_1", tileentity = PaletEntity.Palet1Entity.class, burn_time = 1500)
public class Palet1x1_1 extends BasicContainer4R {
	
	public Palet1x1_1() {
    	super(Material.GLASS);
    	this.setHarvestLevel("pickaxe", 1);
    	this.setHardness(1.0F);
    	this.setResistance(10.0F);
    	this.setCreativeTab(FRSMTabs.BLOCKS);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new PaletEntity.Palet1Entity();
	}
	
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ){
        if(!world.isRemote && player.getHeldItemMainhand().isEmpty()){
            player.openGui(FRSM.getInstance(), GuiHandler.PALET1, world, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
        return false;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state){
    	if(!world.isRemote){
            PaletEntity tile = (PaletEntity)world.getTileEntity(pos);
            for(ItemStack stack : tile.getStacks()){
                if(!stack.isEmpty()){
                    EntityItem entity = new EntityItem(world);
                    entity.setPosition(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
                    entity.setItem(stack);
                    world.spawnEntity(entity);
                }
            }
            tile.getStacks().clear();
        }
        super.breakBlock(world, pos, state);
    }
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.MODEL;
    }
	
}