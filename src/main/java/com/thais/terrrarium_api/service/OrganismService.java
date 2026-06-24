package com.thais.terrrarium_api.service;

import com.thais.terrrarium_api.entity.Organism;
import com.thais.terrrarium_api.enums.SPECIES;

public interface OrganismService {

    Organism createOrganism(SPECIES species);
}
