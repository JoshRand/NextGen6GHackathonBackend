package com.cognixia.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.hackathon.models.Distraction;

@Repository("distractionRepo")
public interface DistractionRepository extends JpaRepository<Distraction, Integer>{

}
