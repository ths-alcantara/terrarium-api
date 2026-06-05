package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.EVENTS;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private EVENTS eventType;
    private String description;
    private LocalDateTime occurredAt;
    @ManyToOne
    @JoinColumn(name = "terrarium_id")
    private Terrarium terrarium;
}
