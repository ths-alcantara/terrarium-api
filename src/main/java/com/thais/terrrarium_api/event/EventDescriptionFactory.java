package com.thais.terrrarium_api.event;

import com.thais.terrrarium_api.entity.Event;

import java.util.concurrent.ThreadLocalRandom;

public class EventDescriptionFactory {
    public String generate(Event type, String organismName) {
        return switch (type.toString()) {

            case "FUNGUS_SPREAD" -> random(
                    organismName + " se espalhou .....",
                    organismName + " cresceu e blá blá",
                    "a umidade permitiu que " + organismName + " aparecesse.");

            default ->
                    "Nada aconteceu no seu terrário.";
        };
    }

    private String random(String... messages) {
        int index = ThreadLocalRandom.current().nextInt(messages.length);
        return messages[index];
    }
}
