package casinobot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class trywrite {
	JSONObject bob = new JSONObject();
	JSONObject jacques = new JSONObject();
	JSONObject guildd = new JSONObject();
	JSONArray guild = new JSONArray();
	JSONArray dodo = new JSONArray();
	void test(){
		bob.put("name", "roger");
		guild.put(bob);
		guildd.put("guild", guild);
		jacques.put("bobo", "ouch");
		dodo.put(jacques);
		guildd.put("hoho", dodo);
		write(guildd);
	}
	public static void write(JSONObject file) {
		File dos = new File("bob.json");
		try {
			BufferedWriter buf = new BufferedWriter(new FileWriter(dos));
			buf.write(file.toString());
			buf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static JSONObject read(String guild) {
		File dos = new File("bob.json");
		JSONObject obj = new JSONObject();
		BufferedReader readd;
		try {
			readd = new BufferedReader(new FileReader(dos));
			String value = readd.readLine();
			readd.close();
			JSONObject arr = new JSONObject(value);
			obj = arr.getJSONArray(guild).getJSONObject(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}
}
