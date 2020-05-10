package net.fexcraft.mod.frsm.guis.server;

import net.fexcraft.lib.mc.gui.GenericContainer;
import net.fexcraft.mod.frsm.blocks.palet.PaletEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerPalet extends GenericContainer {
	
	private PaletEntity tile;
	private IItemHandler handler;

	public ContainerPalet(EntityPlayer player, TileEntity entity){
		super(player);
		tile = (PaletEntity)entity;
		boolean large = tile.getInventorySize() > 15;
		handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		int rows = large ? 6 : 3, playerY = large ? 138 : 84, playerY2 = large ? 196 : 142;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < 5; col++){
                addSlotToContainer(new SlotItemHandler(handler, col + row * 5, 44 + col * 18, 17 + row * 18));
            }
        }
        //
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 9; col++){
                addSlotToContainer(new Slot(player.inventory, col + row * 9 + 9, 8 + col * 18, playerY + row * 18));
            }
        }
        for(int col = 0; col < 9; col++){
            addSlotToContainer(new Slot(player.inventory, col, 8 + col * 18, playerY2));
        }
	}

	@Override
	protected void packet(Side side, NBTTagCompound packet, EntityPlayer player){
		//
	}
	
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index){
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack()){
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if(index < tile.getInventorySize()){
                if(!this.mergeItemStack(itemstack1, tile.getInventorySize(), this.inventorySlots.size(), true)){
                    return ItemStack.EMPTY;
                }
            }
            else if(!this.mergeItemStack(itemstack1, 0, tile.getInventorySize(), false)){ return ItemStack.EMPTY; }
            if(itemstack1.isEmpty()){ slot.putStack(ItemStack.EMPTY); } else{ slot.onSlotChanged(); }
        } return itemstack;
    }

}
