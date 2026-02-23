package net.dv8tion;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import org.jetbrains.annotations.NotNull;

public class SlashCommandListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        switch (event.getName()){
            case "ping":
                event.reply("Pong!").queue();
                break;
            case "hello":
                event.reply("Welcome!!" + event.getUser().getName()).queue();
                break;
        }
    }
}
