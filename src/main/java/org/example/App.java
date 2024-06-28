package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.actions.Greetings;
import org.example.commands.Queue;
import org.example.commands.Players;

import javax.security.auth.login.LoginException;

public class App
{
    public static void main( String[] args ) throws LoginException {
        JDA jda = JDABuilder.createDefault(Token.TOKEN).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        jda.addEventListener(new Listeners());
        CommandManager manager = new CommandManager();
        manager.add(new Players());
        manager.add(new Queue());
        jda.addEventListener(manager);

    }


}
