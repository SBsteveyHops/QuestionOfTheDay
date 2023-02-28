package me.flarethesaberdragon;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;

import java.util.ArrayList;

public class Main {

    public static final int shards = 1;
    public static ArrayList<String> newUsers = new ArrayList<>();

    public static JDABuilder builder = JDABuilder.createDefault("MTA4MDAwMzA4MTY1MzIwNzA3MQ.Gzd1n1.RCEPOTg9XTEeUue3LZQ36fk3PhotrbMDkwA9cQ")
            .setActivity(Activity.watching("the weather."))
            .addEventListeners(

                    new Listener()

            );

    public static ArrayList<JDA> jda = new ArrayList<>(shards);

    public static void main(String[] args) {

        for (int i = 0; i < shards; i++) {
            jda.add(builder.useSharding(i, shards).build());
        }

        Message.suppressContentIntentWarning();

    }

}