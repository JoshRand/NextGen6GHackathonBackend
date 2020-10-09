package com.cognixia.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.hackathon.models.Driver;

@Repository("driverRepo")
public interface DriverRepository extends JpaRepository<Driver, Integer>{

}
