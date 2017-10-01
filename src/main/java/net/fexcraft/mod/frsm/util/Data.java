package net.fexcraft.mod.frsm.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.fexcraft.mod.frsm.util.FI;
import net.fexcraft.mod.lib.FCL;
import net.fexcraft.mod.lib.network.Network;

public class Data{
	
	private static JsonObject data;
	
	public static void getDataFromServer(){
		JsonObject json = Network.getModData("frsm", FI.VERSION);
		if(json == null){
			setDefault();
		}
		else{
			boolean found = false;
			for(JsonElement elm : json.get("versions").getAsJsonArray()){
				if(elm.getAsJsonObject().get("version").getAsString().equals(FCL.mcv)){
					data = elm.getAsJsonObject();
					found = true; break;
				}
			}
			if(!found){
				setDefault();
			}
		}
	}
	
	private static void setDefault(){
		data = new JsonObject();
		data.addProperty("latest_version", FI.VERSION);
		data.addProperty("latest_mc_version", FCL.mcv);
		data.addProperty("changelog", "error.could.not.connect.to.server\nNo Internet?");
		
		JsonObject obj = new JsonObject();
			obj.addProperty("id", "null");
			obj.addProperty("link", "http://localhost");
			obj.addProperty("name", "no.internet.connection");
		
		JsonArray array = new JsonArray();
			array.add(obj);
		
		data.add("download_links", array);
		data.addProperty("update_note", "null");
		data.addProperty("welcome_message", "null");
	}

	public static JsonObject getData(){
		return data;
	}
}