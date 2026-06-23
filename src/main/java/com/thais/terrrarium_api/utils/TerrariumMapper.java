package com.thais.terrrarium_api.utils;

import com.thais.terrrarium_api.dto.EventDTO;
import com.thais.terrrarium_api.dto.TerrariumDTO;
import com.thais.terrrarium_api.entity.Event;
import com.thais.terrrarium_api.entity.Terrarium;
import org.mapstruct.Mapper;

@Mapper
public interface TerrariumMapper {

    Terrarium dtoToEntity(TerrariumDTO terrariumDTO);
    TerrariumDTO entityToDto(Terrarium terrarium);

    Event dtoToEntity(EventDTO eventDTO);
    EventDTO entityToDto(Event event);



}
