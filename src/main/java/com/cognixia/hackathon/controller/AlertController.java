package com.cognixia.hackathon.controller;

import java.awt.geom.Point2D;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.hackathon.models.Distraction;
import com.cognixia.hackathon.models.Driver;
import com.cognixia.hackathon.models.HighAccidentZone;
import com.cognixia.hackathon.repositories.DistractionRepository;
import com.cognixia.hackathon.repositories.DriverRepository;
import com.cognixia.hackathon.repositories.HAZRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AlertController {
	
	@Autowired
	DistractionRepository distractionRepo;
	@Autowired
	DriverRepository driverRepo;
	@Autowired
	HAZRepository hazRepo;
	
		@GetMapping("/distracted")
		public ResponseEntity<Distraction> getSignal (@RequestParam float distractLong, @RequestParam float distractLat, 
				@RequestParam String driverName, @RequestParam String driverLicense, @RequestParam String carMake, @RequestParam String carModel) {
			Driver driverDetails = new Driver(driverName, driverLicense, carMake, carModel);
			Distraction distraction = new Distraction(LocalDate.now(), LocalTime.now(), null, distractLong, distractLat, driverDetails);
			driverRepo.save(driverDetails);
			return new ResponseEntity<Distraction>(distraction, HttpStatus.CREATED);
		}
		
		@PostMapping("/distracted")
		public ResponseEntity<Distraction> endDistraction (@RequestBody Distraction distraction) {
			distraction.setDistractionTimeEnd(LocalTime.now());
			distractionRepo.save(distraction);
			return new ResponseEntity<Distraction>(HttpStatus.OK);
		}
		
		@GetMapping("/highaccidentzone")
		public ResponseEntity<Boolean> inHAZ (@RequestParam float currentLong, @RequestParam float currentLat) {
			for(HighAccidentZone haz: hazRepo.findAll()) {
				if(haz.inArea(currentLong, currentLat)) {
					return new ResponseEntity<Boolean>(true, HttpStatus.OK);
				}
			}
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}

}
