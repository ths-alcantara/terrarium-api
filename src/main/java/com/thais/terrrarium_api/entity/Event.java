package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.EVENTS;

import java.time.LocalDateTime;

public class Event {
    private EVENTS eventType;
    private String description;
    private LocalDateTime occurredAt;
}
