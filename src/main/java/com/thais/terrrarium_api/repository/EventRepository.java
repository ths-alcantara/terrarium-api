package com.thais.terrrarium_api.repository;

import com.thais.terrrarium_api.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
