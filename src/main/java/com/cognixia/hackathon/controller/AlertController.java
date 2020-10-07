package com.cognixia.hackathon.controller;

import java.awt.Point;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.hackathon.models.Distraction;
import com.cognixia.hackathon.repositories.DistractionRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AlertController {
	
	@Autowired
	DistractionRepository distractionRepo;
	
		@GetMapping("/distracted")
		public ResponseEntity<Distraction> getSignal (Point coords) {
			Distraction distraction = new Distraction(LocalDateTime.now(), null, coords);
			return new ResponseEntity<Distraction>(distraction, HttpStatus.CREATED);
		}
		
		@PostMapping("/distracted")
		public ResponseEntity<Distraction> endDistraction (@RequestBody Distraction distraction) {
			distraction.setDistractionTimeEnd(LocalDateTime.now());
			distractionRepo.save(distraction);
			return new ResponseEntity<Distraction>(HttpStatus.OK);
		}

}
