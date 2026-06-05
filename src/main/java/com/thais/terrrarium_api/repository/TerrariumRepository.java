package com.thais.terrrarium_api.repository;

import com.thais.terrrarium_api.entity.Terrarium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrariumRepository extends JpaRepository<Terrarium, Long> {
}
