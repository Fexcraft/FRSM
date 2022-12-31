package net.fexcraft.mod.frsm.commads;

import net.fexcraft.lib.mc.api.registry.fCommand;
import net.fexcraft.lib.mc.utils.Print;
import net.fexcraft.mod.frsm.FRSM;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.RayTraceResult;

@fCommand
public class Command extends CommandBase {
    
    @Override 
    public String getName(){ 
        return "frsm"; 
    } 

    @Override         
    public String getUsage(ICommandSender var1){ 
        return "/frsm help"; 
    }
    
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender){
    	if(sender.getCommandSenderEntity() instanceof EntityPlayer){
    		return true;
    	}
    	else{
    		return true;
    	}
    }

    @Override 
    public void execute(MinecraftServer server, ICommandSender sender, String[] args)  throws CommandException {
        if(args.length < 1){
        	Print.chat(sender, "&9/frsm <args>");
        	return;
        }
        switch(args[0]){
        	case "help":
        	case "?":
        	case "list":
        		Print.chat(sender, FRSM.PREFIX + " Welcome back " + sender.getName() + "!");
        		Print.chat(sender, "&9List of available arguments:");
        		Print.chat(sender, "&fversion, help, grn");
        		Print.chat(sender, "&9Do '/frsm <arg> help to find out more.'");
        		break;
        	case "version":
        		Print.chat(sender, FRSM.PREFIX + "&9 Version: &5" + FRSM.VERSION);
        		break;
        	case "grn":
        		if(args.length < 2){
        			ItemStack stack = ((EntityPlayer)sender.getCommandSenderEntity()).getHeldItemMainhand();
            		Print.chat(sender, FRSM.PREFIX + "&8 RGN: &d" + stack.getItem().getRegistryName() + "&9 [M:" + stack.getItemDamage() + "|A:" + stack.getCount() + "]");
        		}
        		else if(args[1].equals("help")){
        			Print.chat(sender, FRSM.PREFIX + " GRN - Get Registry Name;");
        			Print.chat(sender, "Displays the registry name of the currently held item.");
        			Print.chat(sender, "Use '/frsm grn raytrace' to get the registry name of the block you are currently looking at.");
        		}
        		else if(args[1].equals("raytrace")){
        			RayTraceResult rtr = ((EntityPlayer)sender.getCommandSenderEntity()).rayTrace(4, 1);
        			if(rtr.typeOfHit != RayTraceResult.Type.BLOCK){
        				Print.chat(sender, "No block in reach.");
        			}
        			else{
        				IBlockState state = ((EntityPlayer)sender.getCommandSenderEntity()).getEntityWorld().getBlockState(rtr.getBlockPos());
        				Print.chat(sender, FRSM.PREFIX + "&8 RGN: &d" + state.getBlock().getRegistryName().toString() + "&9 [M:" + state.getBlock().getMetaFromState(state) + "]");
        			}
        		}
        		else{
        			Print.chat(sender, "Invalid argument, try '/frsm grn help';");
        		}
        		break;
        	default:
        		Print.chat(sender, "&4Error, Invalid argument.");
        		break;
        }
    }
}

