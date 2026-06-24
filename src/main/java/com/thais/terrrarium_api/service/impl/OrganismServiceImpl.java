package com.thais.terrrarium_api.service.impl;

import com.thais.terrrarium_api.entity.Organism;
import com.thais.terrrarium_api.enums.SPECIES;
import com.thais.terrrarium_api.repository.OrganismRepository;
import com.thais.terrrarium_api.service.OrganismService;
import org.springframework.stereotype.Service;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrganismServiceImpl implements OrganismService {

    private final OrganismRepository repository;

    public OrganismServiceImpl(OrganismRepository repository) {
        this.repository = repository;
    }

    public Organism createOrganism(SPECIES species){
        Organism newOrganism = Organism.builder()
                .species(species)
                .size(randomValue())
                .health(randomValue())
                .build();

        repository.save(newOrganism);
        return newOrganism;
    }

    private int randomValue(){
        return ThreadLocalRandom.current().nextInt(0,101);
    }

}
