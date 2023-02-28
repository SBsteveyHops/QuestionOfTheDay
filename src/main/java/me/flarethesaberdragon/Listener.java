package me.flarethesaberdragon;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.println("test");
        if (event.getAuthor().isBot()) { return; }
        if (!event.getMessage().getContentRaw().contains("test")) { return; }
        event.getChannel().sendMessage("received").queue();
        Message message = event.getMessage();
        String content = message.getContentRaw();
        MessageChannel channel = event.getChannel();
        if (content.contains("test")) {
            channel.sendMessage("recived and prosessed").queue();
        }

    }

}
