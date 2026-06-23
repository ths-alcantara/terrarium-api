package com.thais.terrrarium_api.dto;

import com.thais.terrrarium_api.entity.Terrarium;
import com.thais.terrrarium_api.enums.EVENTS;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
public class EventDTO {

    private Long id;
    private EVENTS eventType;
    private String description;
    private LocalDateTime occurredAt;
    private Terrarium terrarium;

}
