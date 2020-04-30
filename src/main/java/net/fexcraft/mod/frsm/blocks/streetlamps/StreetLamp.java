package net.fexcraft.mod.frsm.blocks.streetlamps;

import net.fexcraft.lib.mc.api.registry.fBlock;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.fexcraft.mod.frsm.util.block.BasicContainer4R;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@fBlock(modid = FRSM.MODID, name = "streetlamp_lamp", tileentity = StreetLamp.Entity.class)
public class StreetLamp extends BasicContainer4R implements StreetLampPostEntity.Connectable {

	public StreetLamp(){
		super(Material.IRON);
		this.setCreativeTab(FRSMTabs.STREETS);
		this.setLightLevel(2F);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new StreetLamp.Entity();
	}
	
	public static class Entity extends TileEntity {}
	
}