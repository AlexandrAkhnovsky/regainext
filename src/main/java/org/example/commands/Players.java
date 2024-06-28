package org.example.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.example.ICommand;

import java.awt.*;
import java.util.List;

public class Players implements ICommand {
    @Override
    public String getName() {
        return "игроки";
    }

    @Override
    public String getDescription() {
        return "Показывает список игроков";
    }

    @Override
    public List<OptionData> getOptions() {
        return null;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Выберите тир игроков");
        builder.setColor(Color.BLACK);

        Button oneButton = Button.primary("one-button", "Тир 1");
        Button twoButton = Button.primary("two-button", "Тир 2");
        Button threeButton = Button.primary("three-button", "Тир 3");

        event.replyEmbeds(builder.build())
                .addActionRow(oneButton)
                .addActionRow(twoButton)
                .addActionRow(threeButton)
                .queue();

    }


}
