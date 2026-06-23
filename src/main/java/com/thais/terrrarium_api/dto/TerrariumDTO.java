package com.thais.terrrarium_api.dto;

import com.thais.terrrarium_api.enums.SPECIES;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TerrariumDTO {

    private Long id;
    private OrganismDTO organism;
    private Integer humidity;
    private Integer luminosity;
    private List<SPECIES> species;
    private List<EventDTO> events = new ArrayList<>();

}
