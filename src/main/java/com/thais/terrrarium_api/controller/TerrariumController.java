package com.thais.terrrarium_api.controller;

import com.thais.terrrarium_api.dto.EventDTO;
import com.thais.terrrarium_api.dto.TerrariumDTO;
import com.thais.terrrarium_api.entity.Event;
import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.enums.ACTIONS;
import com.thais.terrrarium_api.enums.SPECIES;
import com.thais.terrrarium_api.service.ActionService;
import com.thais.terrrarium_api.service.EventsService;
import com.thais.terrrarium_api.service.TerrariumService;
import com.thais.terrrarium_api.utils.TerrariumMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/terrarium")
public class TerrariumController {

    private TerrariumService terrariumService;
    private ActionService actionService;
    private EventsService eventsService;
    private TerrariumMapper mapper;

    @PostMapping("/create")
    public ResponseEntity<TerrariumDTO> createTerrarium(@RequestHeader SPECIES species){
        Terrarium terrariumCreated = terrariumService.createNewTerrarium(species);
        TerrariumDTO terrariumDTO = mapper.entityToDto(terrariumCreated);
        return ResponseEntity.ok().body(terrariumDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TerrariumDTO> getTerrarium(Long id){
        Terrarium terrarium = terrariumService.getTerrariumInfo(id);
        TerrariumDTO terrariumDTO = mapper.entityToDto(terrarium);
        return ResponseEntity.ok().body(terrariumDTO);
    }

    @PostMapping("/{id}/actions")
    public ResponseEntity<EventDTO> updateTerrarium(@RequestHeader ACTIONS action){
        Event event = actionService.processNewAction(action);
        EventDTO eventDTO = mapper.entityToDto(event);
        return ResponseEntity.ok().body(eventDTO);
    }

//    @GetMapping("/{id}/events")
//    public List<EventDTO> getEvents(@RequestHeader){
//        eventsService.;
//        return ResponseEntity.ok().body();
//    }
}
