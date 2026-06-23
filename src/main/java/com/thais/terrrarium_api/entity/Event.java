package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.EVENTS;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@Entity
@Table(name = "tb_event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EVENTS eventType;

    private String description;

    private LocalDateTime occurredAt;

    @ManyToOne
    @JoinColumn(name = "terrarium_id")
    private Terrarium terrarium;
}
