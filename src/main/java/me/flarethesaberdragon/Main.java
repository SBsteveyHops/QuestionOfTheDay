package me.flarethesaberdragon;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class Main {
    private final String discordAPIKey = "";
    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault(args[0]);
        builder.addEventListeners(

                new Listener()

        );

        builder.enableIntents(GatewayIntent.GUILD_MESSAGES);

        builder.setActivity(Activity.watching("the weather."));

        builder.build();
    }
}