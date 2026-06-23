package com.thais.terrrarium_api.service;

import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.enums.SPECIES;

public interface TerrariumService {

    Terrarium createNewTerrarium(SPECIES species);

    Terrarium getTerrariumInfo(Long id);
}
