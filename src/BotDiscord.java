/**
 * Created by justin on 22/07/2017.
 */
import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class BotDiscord {

    public static void main(String[] args) {
        try {
            JDA jda = new JDABuilder(AccountType.BOT).setToken("MzM2NjEyNTg3MzI2NDA2NjY3.DE682A.J0oLzC1EU7tEXvjng7lQ2wE6tLo").buildAsync();
            jda.addEventListener(new BotListener());
            System.out.println("Bot connected");
        } catch (LoginException | IllegalArgumentException | RateLimitedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
