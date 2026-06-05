package com.thais.terrrarium_api.event;

import com.thais.terrrarium_api.entity.Event;

public class EventGenerator {

    private EventProcessor eventProcessor;
    private EventDescriptionFactory eventDescriptionFactory;

    public void createNewEvent(){
        Event event = new Event();
        //criacao randomica de evento
        eventDescriptionFactory.generate(event, species);
        eventProcessor.salveEvent(event);
    }
}
