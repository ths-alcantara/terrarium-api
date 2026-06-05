package com.thais.terrrarium_api.service;

import com.thais.terrrarium_api.entity.Event;
import com.thais.terrrarium_api.entity.Organism;
import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.enums.EVENTS;
import com.thais.terrrarium_api.enums.SPECIES;
import com.thais.terrrarium_api.repository.TerrariumRepository;

import java.time.LocalDateTime;
import java.util.List;

import static com.thais.terrrarium_api.enums.EVENTS.TERRARIUM_CREATED;

public class TerrariumService {

    private TerrariumRepository terrariumRepository;

    public Terrarium createNewTerrarium(SPECIES species){
        Organism organism = new Organism();
        organism.setSpecies(species);

        Event event = Event.builder()
                .eventType(TERRARIUM_CREATED)
                .description("Seu terrário foi criado com sucesso!")
                .occurredAt(LocalDateTime.now())
                .build();

        Terrarium terrarium = new Terrarium();
        terrarium.setOrganism(organism);
        List<Event> terrariumEvent = terrarium.getEvents();
        terrariumEvent.add(event);
        terrarium.setEvents(terrariumEvent);

        return terrarium;
    }

    public Terrarium getTerrariumInfo(Long id){
        return terrariumRepository.findById(id);
    }
}
