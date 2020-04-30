package net.fexcraft.mod.frsm.blocks.general;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.Basic4R;
import net.minecraft.block.material.Material;

public class Cobble extends Basic4R {
    
    public Cobble(){
        super(Material.WOOD);
        this.setHarvestLevel("axe", 1);
        this.setHardness(1.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(FRSMTabs.BLOCKS);
    }
    
    @fBlock(modid = FRSM.MODID, name = "cobble1")
    public static class Cobble1 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble2")
    public static class Cobble2 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble3")
    public static class Cobble3 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble4")
    public static class Cobble4 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble5")
    public static class Cobble5 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble5b")
    public static class Cobble5b extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble6")
    public static class Cobble6 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble6b")
    public static class Cobble6b extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble7")
    public static class Cobble7 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble7b")
    public static class Cobble7b extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble8")
    public static class Cobble8 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble8b")
    public static class Cobble8b extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble9")
    public static class Cobble9 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble9b")
    public static class Cobble9b extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble10")
    public static class Cobble10 extends Cobble {}
    
    @fBlock(modid = FRSM.MODID, name = "cobble10b")
    public static class Cobble10b extends Cobble {}
    
}