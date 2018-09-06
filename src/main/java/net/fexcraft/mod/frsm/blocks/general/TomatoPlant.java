package net.fexcraft.mod.frsm.blocks.general;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.fexcraft.mod.frsm.util.CD;
import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.lib.api.block.fBlock;
import net.fexcraft.mod.lib.util.registry.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@fBlock(modid = FI.MODID, name = "tomatoplant")
public class TomatoPlant extends BlockBush implements IGrowable {
	
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);
    
    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[] {
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D,  1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D,   1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D,  1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D),
    		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D,   1.0D)};

    public TomatoPlant(){
        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
        this.setTickRandomly(true);
        //float f = 0.5F;
        this.setHardness(0.0F);
        this.setSoundType(SoundType.PLANT);
        this.disableStats();
        this.setCreativeTab(CD.EXPERIMENTAL);
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return CROPS_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }

    @Override
    protected boolean canSustainBush(IBlockState state){
        return state.getBlock() == Blocks.FARMLAND;
    }

    protected PropertyInteger getAgeProperty(){
        return AGE;
    }

    public int getMaxAge(){
        return 7;
    }

    protected int getAge(IBlockState state){
        return ((Integer)state.getValue(this.getAgeProperty())).intValue();
    }

    public IBlockState withAge(int age){
        return this.getDefaultState().withProperty(this.getAgeProperty(), Integer.valueOf(age));
    }

    public boolean isMaxAge(IBlockState state){
        return ((Integer)state.getValue(this.getAgeProperty())).intValue() >= this.getMaxAge();
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
        super.updateTick(worldIn, pos, state, rand);
        if (worldIn.getLightFromNeighbors(pos.up()) >= 9){
            int i = this.getAge(state);
            if (i < this.getMaxAge()){
                float f = getGrowthChance(this, worldIn, pos);
                if (rand.nextInt((int)(25.0F / f) + 1) == 0){
                    worldIn.setBlockState(pos, this.withAge(i + 1), 2);
                }
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state){
        int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
        int j = this.getMaxAge();
        if (i > j){
            i = j;
        }
        worldIn.setBlockState(pos, this.withAge(i), 2);
    }

    protected int getBonemealAgeIncrease(World worldIn){
        return worldIn.rand.nextInt(3) + 2;//MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);
    }

    protected static float getGrowthChance(Block blockIn, World worldIn, BlockPos pos){
        float f = 1.0F;
        BlockPos blockpos = pos.down();
        for (int i = -1; i <= 1; ++i){
            for (int j = -1; j <= 1; ++j){
                float f1 = 0.0F;
                IBlockState iblockstate = worldIn.getBlockState(blockpos.add(i, 0, j));
                if (iblockstate.getBlock().canSustainPlant(iblockstate, worldIn, blockpos.add(i, 0, j), net.minecraft.util.EnumFacing.UP, (net.minecraftforge.common.IPlantable)blockIn)){
                    f1 = 1.0F;
                    if (iblockstate.getBlock().isFertile(worldIn, blockpos.add(i, 0, j))){
                        f1 = 3.0F;
                    }
                }
                if (i != 0 || j != 0){
                    f1 /= 4.0F;
                }
                f += f1;
            }
        }
        BlockPos blockpos1 = pos.north();
        BlockPos blockpos2 = pos.south();
        BlockPos blockpos3 = pos.west();
        BlockPos blockpos4 = pos.east();
        boolean flag = blockIn == worldIn.getBlockState(blockpos3).getBlock() || blockIn == worldIn.getBlockState(blockpos4).getBlock();
        boolean flag1 = blockIn == worldIn.getBlockState(blockpos1).getBlock() || blockIn == worldIn.getBlockState(blockpos2).getBlock();
        if (flag && flag1){
            f /= 2.0F;
        }
        else{
            boolean flag2 = blockIn == worldIn.getBlockState(blockpos3.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.south()).getBlock() || blockIn == worldIn.getBlockState(blockpos3.south()).getBlock();
            if (flag2){
                f /= 2.0F;
            }
        }
        return f;
    }

    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state){
        IBlockState soil = worldIn.getBlockState(pos.down());
        return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
    }

    protected Item getSeed(){
        return RegistryUtil.getItem("frsm:tomatoseeds");
    }

    protected Item getCrop(){
        return RegistryUtil.getItem("frsm:tomato");
    }

    @SuppressWarnings("deprecation")
	@Override
    public List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
        List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (age >= getMaxAge()){
            //int k = 3 + fortune;
            for (int i = 0; i < 3 + fortune; ++i){
                if (rand.nextInt(2 * getMaxAge()) <= age){
                    ret.add(new ItemStack(this.getSeed(), 1, 0));
                }
            }
        }
        return ret;
    }

    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, 0);
        if (!worldIn.isRemote){
            int i = this.getAge(state);
            if (i >= this.getMaxAge()){
                int j = 3 + fortune;
                for (int k = 0; k < j; ++k){
                    if (worldIn.rand.nextInt(2 * this.getMaxAge()) <= i){
                        spawnAsEntity(worldIn, pos, new ItemStack(this.getSeed()));
                    }
                }
            }
        }
    }
    
    @Override @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return this.isMaxAge(state) ? this.getCrop() : this.getSeed();
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state){
        return new ItemStack(this.getSeed());
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient){
        return !this.isMaxAge(state);
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state){
        return true;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state){
        this.grow(worldIn, pos, state);
    }

    @Override
    public IBlockState getStateFromMeta(int meta){
        return this.withAge(meta);
    }

    @Override
    public int getMetaFromState(IBlockState state){
        return this.getAge(state);
    }

    @Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }
    
}