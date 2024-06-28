package org.example.actions;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Greetings extends ListenerAdapter {
    @Override // USE THIS WHEN YOU WANT TO OVERRIDE A METHOD
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        String user = event.getMember().getAsMention();
        JDA client = event.getJDA(); // DO NOT CREATE A NEW JDA INSTANCE EVERY TIME
        TextChannel textChannel = client.getTextChannelsByName("приветствие",true).get(0);
        textChannel.sendMessage("MESSAGE" + user).queue();
    }

}
