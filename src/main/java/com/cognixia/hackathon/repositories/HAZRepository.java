package com.cognixia.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.hackathon.models.HighAccidentZone;

@Repository("hazRepo")
public interface HAZRepository extends JpaRepository<HighAccidentZone, Integer>{

}
