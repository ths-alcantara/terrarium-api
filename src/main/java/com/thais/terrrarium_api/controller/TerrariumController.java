package com.thais.terrrarium_api.controller;

import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.enums.ACTIONS;
import com.thais.terrrarium_api.enums.SPECIES;
import com.thais.terrrarium_api.service.ActionService;
import com.thais.terrrarium_api.service.EventsService;
import com.thais.terrrarium_api.service.TerrariumService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/terrarium")
public class TerrariumController {

    private TerrariumService terrariumService;
    private ActionService actionService;
    private EventsService eventsService;

    @PostMapping("/create")
    public ResponseEntity<Terrarium> createTerrarium(@RequestHeader SPECIES species){
        Terrarium terrariumCreated = terrariumService.createNewTerrarium(species);
        return ResponseEntity.ok().body(terrariumCreated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Terrarium> getTerrarium(Long id){
        return ResponseEntity.ok().body(terrariumService.getTerrariumInfo(id));
    }

    @PostMapping("/{id}/actions")
    public dto updateTerrarium(@RequestHeader ACTIONS action){
        actionService.processNewAction(action);
        return dto;
    }

    @GetMapping("/{id}/events")
    public dto getEvents(@RequestHeader ){
        eventsService.;
        return dto;
    }
}
