package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.SPECIES;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Organism {

    private SPECIES species;
    private Integer size = 10;
    private Integer health = 50;

}
