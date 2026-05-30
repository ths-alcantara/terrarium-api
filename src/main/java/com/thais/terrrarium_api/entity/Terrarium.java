package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.SPECIES;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Terrarium {

    private Organism organism;
    private Integer humidity = 50;
    private Integer luminosity = 60;
    private List<SPECIES> species;
    private List<Event> events = new ArrayList<>();

}
