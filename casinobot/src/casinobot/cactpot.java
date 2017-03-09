/**
 * 
 */
/**
 * @author Ludwigo
 *
 */
package casinobot;

import javax.security.auth.login.LoginException;
import java.util.List;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.*;

public class cactpot extends ListenerAdapter {
	
	public static void main(String[] args) {
		try {
			new JDABuilder(AccountType.BOT)
			.setToken("Mjg2OTA3NjU1MjM3MjcxNTUy.C5nlJA.8SYQDkro428pmEFZrtI4znyZJkU")
			.addListener(new cactpot())
			.buildAsync();
			database db = new database();
			db.writedb("lys", 1, "name", "Shunko");
		} catch (LoginException | IllegalArgumentException | RateLimitedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Build JDA - connect to discord
	}
		@Override	
		public void onMessageReceived(MessageReceivedEvent event) {
			JDA jda = event.getJDA();
			long reponseNumber = event.getResponseNumber();
		}
}