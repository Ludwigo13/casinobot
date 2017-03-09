package casinobot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class database {
	
	void writedb(String guildName, int index, String object, Object tomodi) {
		JSONObject guild = new JSONObject();
		JSONObject obj = new JSONObject();
		JSONArray account = new JSONArray();
		guild.put(guildName, account);
		account.put(index, obj);
		obj.put(object, tomodi);
		
		File file = new File("database.json");
		try {
			BufferedWriter bufWdb = new BufferedWriter(new FileWriter(file));
			bufWdb.write(guild.toString());
			bufWdb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
