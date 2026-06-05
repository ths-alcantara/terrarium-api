package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.SPECIES;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Terrarium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Organism organism;
    private Integer humidity = 50;
    private Integer luminosity = 60;
    private List<SPECIES> species;
    private List<Event> events = new ArrayList<>();

}
