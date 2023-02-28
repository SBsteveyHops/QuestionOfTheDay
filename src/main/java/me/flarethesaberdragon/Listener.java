package me.flarethesaberdragon;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // If message contains `test` (in any case), the bot will reply with `received`.
        if (event.getAuthor().isBot()) { return; }
        if (!event.getMessage().getContentRaw().toLowerCase().contains("test")) { return; }
        event.getMessage().reply("received").queue();
    }
}
