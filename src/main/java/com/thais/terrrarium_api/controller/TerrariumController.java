package com.thais.terrrarium_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/terrarium")
public class TerrariumController {

    @PostMapping("/create")
    public dto createTerrarium(){
        return dto;
    }

    @GetMapping("/{id}")
    public dto getTerrarium(){
        return dto;
    }

    @PostMapping("/{id}/actions")
    public dto updateTerrarium(){
        return dto;
    }

    @GetMapping("/{id}/events")
    public dto getEvents(){
        return dto;
    }
}
