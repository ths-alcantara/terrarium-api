package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.SPECIES;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_organism")
public class Organism {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SPECIES species;

    private Integer size = 10;

    private Integer health = 50;
}
