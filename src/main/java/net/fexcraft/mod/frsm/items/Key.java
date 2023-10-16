package net.fexcraft.mod.frsm.items;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import net.fexcraft.lib.common.utils.Formatter;
import net.fexcraft.lib.mc.api.KeyItem;
import net.fexcraft.lib.mc.api.LockableObject;
import net.fexcraft.lib.mc.api.registry.fItem;
import net.fexcraft.lib.mc.network.Network;
import net.fexcraft.lib.mc.utils.Static;
import net.fexcraft.mod.frsm.FRSM;
import net.fexcraft.mod.frsm.util.FRSMTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("deprecation")
@fItem(modid = FRSM.MODID, name = "key", variants = 3)
public class Key extends KeyItem {
	
	public Key(){
		this.setMaxStackSize(1);
		this.setCreativeTab(FRSMTabs.TOOLS);
		this.setHasSubtypes(true);
	}
	
	@Override
	public void onCreated(ItemStack itemstack, World world, EntityPlayer player) {
		setDefaults(true, itemstack, player);
	}
	
	public void setDefaults(boolean crafted, ItemStack stack, Entity entity){
		stack.setTagCompound(new NBTTagCompound());
		NBTTagCompound nbt = stack.getTagCompound();
		nbt.setString("KeyOrigin", crafted ? "crafted" : "cheated");
		nbt.setString("KeyCreator", entity instanceof EntityPlayer ? ((EntityPlayer)entity).getGameProfile().getId().toString() : Static.NULL_UUID_STRING);
		switch(stack.getMetadata()){
			case 0:
				nbt.setString("KeyType", KeyType.PRIVATE.toString());
				break;
			case 1:
				nbt.setString("KeyType", KeyType.COMMON.toString());
				break;
			case 2:
				nbt.setString("KeyType", KeyType.ADMIN.toString());
				break;
		}
		nbt.setString("KeyCode", stack.getMetadata() == 2 ? "--------" : super.getNewKeyCode());
	}
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int itemSlot, boolean isSelected){
		if(itemstack.getTagCompound() == null){
			setDefaults(false, itemstack, entity);
		}
	}
	    
	@Override
	public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag advanced){
		if(stack.getTagCompound() != null){
			NBTTagCompound nbt = stack.getTagCompound();
			String creator = nbt.getString("KeyCreator");
			String name = Network.getMinecraftServer().getPlayerProfileCache().getProfileByUUID(UUID.fromString(creator)).getName();
			KeyType type = KeyType.fromString(nbt.getString("KeyType"));
			tooltip.add("Type: " + type.toText());
			tooltip.add("Code: " + Formatter.format(getCode(type, nbt.getString("KeyCode"), creator, null)));
			tooltip.add("Creator: " + name);
			tooltip.add("Origin: " + nbt.getString("KeyOrigin"));
		}
		else{
			tooltip.add("No Tag Compound.");
		}
	}

	private String getCode(KeyType type, String code, String string, UUID id) {
		if(type == KeyType.PRIVATE){
			//if(id.toString().equals(string)){
				return "&a" + code;
			//}
			//else return TextFormatting.OBFUSCATED + code;
		}
		else return "&3" + code;
	}

	@Override
	public KeyType getType(ItemStack stack){
		if(stack.getItem() instanceof Key){
			return KeyType.fromString(stack.getTagCompound().getString("KeyType"));
		}
		else return null;
	}

	@Override
	public String getCode(ItemStack stack){
		if(stack.getItem() instanceof Key){
			return stack.getTagCompound().getString("KeyCode");
		}
		else return null;
	}

	@Override
	public UUID getCreator(ItemStack stack){
		if(stack.getItem() instanceof Key){
			return UUID.fromString(stack.getTagCompound().getString("KeyCode"));
		}
		else return null;
	}
	
	@SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> list){
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
    }
	
	@Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
        while(world.isRemote || hand == EnumHand.OFF_HAND){
        	return EnumActionResult.PASS;
        }
		if(world.getBlockState(pos).getBlock() instanceof LockableObject){
        	LockableObject object = (LockableObject)world.getBlockState(pos).getBlock();
        	return process(world, player, object);
        }
        else if(world.getTileEntity(pos) instanceof LockableObject){
        	LockableObject object = (LockableObject)world.getTileEntity(pos);
        	return process(world, player, object);
        }
        else{
        	return EnumActionResult.PASS;
        }
    }

	private EnumActionResult process(World world, EntityPlayer player, LockableObject object){
		if(object.isLocked()){
    		return object.unlock(world, player, player.getHeldItemMainhand(), (KeyItem)player.getHeldItemMainhand().getItem()) ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
    	}
    	else{
    		return object.lock(world, player, player.getHeldItemMainhand(), (KeyItem)player.getHeldItemMainhand().getItem()) ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
    	}
	}
	
	@Override
	public int getMetadata(int meta){
		return meta > 2 ? 0 : meta;
	}
	
}