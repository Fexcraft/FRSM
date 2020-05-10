package net.fexcraft.mod.frsm.blocks.palet;

import javax.annotation.Nullable;

import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class PaletEntity extends TileEntity {
	
	public static class Palet1Entity extends PaletEntity {
		
		public Palet1Entity(){
			super(15);
		}
		
	}
	
	public static class Palet2Entity extends PaletEntity {

		public Palet2Entity(){
			super(30);
		}
		
	}
	
	private final int size;
    private NonNullList<ItemStack> stacks;
	
	public PaletEntity(int size){
		stacks = NonNullList.<ItemStack>withSize(this.size = size, ItemStack.EMPTY);
	}

    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing){
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
        return super.hasCapability(capability, facing);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Nullable
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing){
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return (T)new ItemStackHandler(stacks);
        }
        return super.getCapability(capability, facing);
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket(){
        return new SPacketUpdateTileEntity(this.getPos(), this.getBlockMetadata(), this.getUpdateTag());
    }

    @Override
    public NBTTagCompound getUpdateTag(){
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt){
        this.readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);
        compound.setTag("Items", ItemStackHelper.saveAllItems(new NBTTagCompound(), stacks));
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        if(compound.hasKey("Items")){
        	ItemStackHelper.loadAllItems(compound.getCompoundTag("Items"), stacks);
        }
    }

	public int getInventorySize(){
		return size;
	}

	public NonNullList<ItemStack> getStacks(){
		return stacks;
	}

}
