package com.thais.terrrarium_api.event;

import com.thais.terrrarium_api.entity.Event;
import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.repository.EventRepository;
import com.thais.terrrarium_api.repository.TerrariumRepository;

import java.util.List;

public class EventProcessor {

    private EventRepository eventRepository;

    private TerrariumRepository terrariumRepository;

    public void processEvent(Event event){

    }

    public void salveEvent(Event event){
        Terrarium terrarium = terrariumRepository.getById();
        List<Event> terrariumEvents = terrarium.getEvents();
        terrariumEvents.add(event);
        terrariumRepository.save();
        eventRepository.save(event);
    }


}
