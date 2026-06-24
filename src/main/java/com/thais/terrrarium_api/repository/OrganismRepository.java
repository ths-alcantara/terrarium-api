package com.thais.terrrarium_api.repository;

import com.thais.terrrarium_api.entity.Organism;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganismRepository extends JpaRepository<Organism, Long> {
}
