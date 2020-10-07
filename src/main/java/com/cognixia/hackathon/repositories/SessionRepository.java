package com.cognixia.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.hackathon.models.Session;

@Repository("sessionRepo")
public interface SessionRepository extends JpaRepository<Session, Integer> {

}
