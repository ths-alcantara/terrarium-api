package com.thais.terrrarium_api.dto;

import com.thais.terrrarium_api.enums.SPECIES;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrganismDTO {

    private SPECIES species;
    private Integer size;
    private Integer health;
}
