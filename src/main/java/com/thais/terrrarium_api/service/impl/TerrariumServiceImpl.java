package com.thais.terrrarium_api.service.impl;

import com.thais.terrrarium_api.entity.Event;
import com.thais.terrrarium_api.entity.Organism;
import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.enums.SPECIES;
import com.thais.terrrarium_api.repository.TerrariumRepository;
import com.thais.terrrarium_api.service.TerrariumService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static com.thais.terrrarium_api.enums.EVENTS.TERRARIUM_CREATED;

public class TerrariumServiceImpl implements TerrariumService{

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
        terrarium.setMainOrganism(organism);
        List<Event> terrariumEvent = terrarium.getEvents();
        terrariumEvent.add(event);
        terrarium.setEvents(terrariumEvent);

        terrariumRepository.save(terrarium);
        return terrarium;
    }

    public Terrarium getTerrariumInfo(Long id){
        Optional<Terrarium> terrarium = terrariumRepository.findById(id);
        return terrarium.orElse(null);
    }
}
