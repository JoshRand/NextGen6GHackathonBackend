package com.cognixia.hackathon.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "distraction")
public class Distraction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "distraction_id")
	private Integer distractionId;
	
	private LocalDate distractionDate;
	private LocalTime distractionTimeStart;
	private LocalTime distractionTimeEnd;
	private float distractionLongitude;
	private float distractionLatitude;
	
	@ManyToOne(targetEntity = Driver.class)
	private Driver driverInvolved;
	
	public Distraction() {
		
	}
	
	public Distraction(LocalDate distractionDate, LocalTime distractionTimeStart, LocalTime distractionTimeEnd,
			float distractionLongitude, float distractionLatitude) {
		super();
		this.distractionDate = distractionDate;
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionLongitude = distractionLongitude;
		this.distractionLatitude = distractionLatitude;
		this.driverInvolved = null;
	}
	
	public Distraction(LocalDate distractionDate, LocalTime distractionTimeStart, LocalTime distractionTimeEnd,
			float distractionLongitude, float distractionLatitude, Driver driverInvolved) {
		super();
		this.distractionDate = distractionDate;
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionLongitude = distractionLongitude;
		this.distractionLatitude = distractionLatitude;
		this.driverInvolved = driverInvolved;
	}

	public LocalDate getDistractionDate() {
		return distractionDate;
	}

	public void setDistractionDate(LocalDate distractionDate) {
		this.distractionDate = distractionDate;
	}

	public LocalTime getDistractionTimeStart() {
		return distractionTimeStart;
	}

	public void setDistractionTimeStart(LocalTime distractionTimeStart) {
		this.distractionTimeStart = distractionTimeStart;
	}

	public LocalTime getDistractionTimeEnd() {
		return distractionTimeEnd;
	}

	public void setDistractionTimeEnd(LocalTime distractionTimeEnd) {
		this.distractionTimeEnd = distractionTimeEnd;
	}

	public float getDistractionLongitude() {
		return distractionLongitude;
	}

	public void setDistractionLongitude(float distractionLongitude) {
		this.distractionLongitude = distractionLongitude;
	}

	public float getDistractionLatitude() {
		return distractionLatitude;
	}

	public void setDistractionLatitude(float distractionLatitude) {
		this.distractionLatitude = distractionLatitude;
	}

	public Driver getDriverInvolved() {
		return driverInvolved;
	}

	public void setDriverInvolved(Driver driverInvolved) {
		this.driverInvolved = driverInvolved;
	}

}
