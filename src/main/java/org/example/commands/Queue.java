package org.example.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.example.ICommand;

import java.awt.*;
import java.util.List;

public class Queue implements ICommand{
    @Override
    public String getName() {
        return "поиск";
    }

    @Override
    public String getDescription() {
        return "Поиск матча";
    }

    @Override
    public List<OptionData> getOptions() {
        return null;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Начать подбор");
        builder.setColor(Color.BLACK);
        builder.setFooter("сейчас в подборе: "+"0 игроков");

        event.replyEmbeds(builder.build())
                .addActionRow(Button.primary("queue", "Поиск матча"))
                .queue();
    }
}
