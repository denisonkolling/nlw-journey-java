package com.rocketseat.planner.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.planner.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, UUID>{
    List<Participant> findByTripId(UUID tripId);
}
