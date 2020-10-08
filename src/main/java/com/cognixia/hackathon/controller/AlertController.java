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
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.hackathon.models.Distraction;
import com.cognixia.hackathon.models.Driver;
import com.cognixia.hackathon.models.HighAccidentZone;
import com.cognixia.hackathon.repositories.DistractionRepository;
import com.cognixia.hackathon.repositories.HAZRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AlertController {
	
	@Autowired
	DistractionRepository distractionRepo;
	@Autowired
	HAZRepository hazRepo;
	
		@GetMapping("/distracted")
		public ResponseEntity<Distraction> getSignal (Point2D.Float coords, Driver driver) {
			Distraction distraction = new Distraction(LocalDate.now(), LocalTime.now(), null, coords, driver);
			return new ResponseEntity<Distraction>(distraction, HttpStatus.CREATED);
		}
		
		@PostMapping("/distracted")
		public ResponseEntity<Distraction> endDistraction (@RequestBody Distraction distraction) {
			distraction.setDistractionTimeEnd(LocalTime.now());
			distractionRepo.save(distraction);
			return new ResponseEntity<Distraction>(HttpStatus.OK);
		}
		
		@GetMapping("/highaccidentzone")
		public ResponseEntity<Boolean> inHAZ (Point2D.Float coords) {
			for(HighAccidentZone haz: hazRepo.findAll()) {
				if(haz.inArea(coords)) {
					return new ResponseEntity<Boolean>(true, HttpStatus.OK);
				}
			}
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}

}
