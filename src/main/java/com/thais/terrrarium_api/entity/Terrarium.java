package com.thais.terrrarium_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_terrarium")
public class Terrarium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer humidity = 50;

    private Integer luminosity = 60;

    @OneToOne
    @JoinColumn(name = "main_organism_id")
    private Organism mainOrganism;

    @OneToMany
    @JoinColumn(name = "terrarium_id")
    private List<Organism> organisms = new ArrayList<>();

    @OneToMany(mappedBy = "terrarium")
    private List<Event> events = new ArrayList<>();
}
