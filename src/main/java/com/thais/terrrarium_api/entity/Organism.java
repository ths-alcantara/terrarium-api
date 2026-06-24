package com.thais.terrrarium_api.entity;

import com.thais.terrrarium_api.enums.SPECIES;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "tb_organism")
public class Organism {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SPECIES species;

    private Integer size;
    private Integer health;

    public boolean isDead() {
        return health <= 0;
    }

    public void grow() {

        if (health > 50) {
            size = Math.min(size + 2, 100);
        }
    }
}
