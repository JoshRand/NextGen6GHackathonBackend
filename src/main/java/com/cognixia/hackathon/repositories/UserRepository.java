package com.cognixia.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.hackathon.models.User;

@Repository("userRepo")
public interface UserRepository extends JpaRepository<User, Integer> {

}
