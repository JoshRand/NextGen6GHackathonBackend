package com.cognixia.hackathon.models;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
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
	private Point2D.Float distractionCoords;
	
	@ManyToOne(targetEntity = Driver.class)
	private Driver driverInvolved;
	
	public Distraction(LocalDate distractionDate, LocalTime distractionTimeStart, LocalTime distractionTimeEnd,
			Float distractionCoords) {
		super();
		this.distractionDate = distractionDate;
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionCoords = distractionCoords;
		this.driverInvolved = null;
	}
	
	public Distraction(LocalDate distractionDate, LocalTime distractionTimeStart, LocalTime distractionTimeEnd,
			Float distractionCoords, Driver driverInvolved) {
		super();
		this.distractionDate = distractionDate;
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionCoords = distractionCoords;
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

	public Point2D.Float getDistractionCoords() {
		return distractionCoords;
	}

	public void setDistractionCoords(Point2D.Float distractionCoords) {
		this.distractionCoords = distractionCoords;
	}

	public Driver getDriverInvolved() {
		return driverInvolved;
	}

	public void setDriverInvolved(Driver driverInvolved) {
		this.driverInvolved = driverInvolved;
	}

}
