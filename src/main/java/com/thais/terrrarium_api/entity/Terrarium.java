package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.SPECIES;

import java.util.List;

public class Terrarium {

    private Organism organism;
    private Integer humidity;
    private Integer luminosity;
    private List<SPECIES> species;
    private List<Event> events;

}
