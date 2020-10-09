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
	
	private Integer driver_id;
	
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
		this.driver_id = null;
	}
	
	public Distraction(LocalDate distractionDate, LocalTime distractionTimeStart, LocalTime distractionTimeEnd,
			float distractionLongitude, float distractionLatitude, Integer driverId) {
		super();
		this.distractionDate = distractionDate;
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionLongitude = distractionLongitude;
		this.distractionLatitude = distractionLatitude;
		this.driver_id = driverId;
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

	public Integer getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(Integer driver_id) {
		this.driver_id = driver_id;
	}

}
