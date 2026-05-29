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
        terrarium service;
        return dto;
    }

    @GetMapping("/{id}")
    public dto getTerrarium(){
        terrarium service;
        return dto;
    }

    @PostMapping("/{id}/actions")
    public dto updateTerrarium(){
        action service;
        return dto;
    }

    @GetMapping("/{id}/events")
    public dto getEvents(){
        events service;
        return dto;
    }
}
