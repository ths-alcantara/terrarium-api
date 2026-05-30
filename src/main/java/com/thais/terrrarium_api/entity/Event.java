package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.EVENTS;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
    private EVENTS eventType;
    private String description;
    private LocalDateTime occurredAt;
}
