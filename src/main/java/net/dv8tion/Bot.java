package net.dv8tion;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.build.Commands;


// .build : active bot
// .queue : send request to API
public class Bot {
    public static void main(String[] args) throws Exception {
        String token = System.getenv("DISCORD_TOKEN");
        JDABuilder.createDefault(token)
                .addEventListeners(new SlashCommandListener())
                .build()
                .updateCommands()
                        .addCommands(
                                Commands.slash("ping", "Bot response Pong !"),
                                Commands.slash("hello", "Hello user")
                        ).queue();
        System.out.println("Bot is ready");
    }
}
