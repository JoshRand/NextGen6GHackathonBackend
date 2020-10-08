package com.cognixia.hackathon.models;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Distraction {
	
//	private LocalDateTime distractionTimeStart;
//	private LocalDateTime distractionTimeEnd;
	
	private LocalDate distractionDate;
	private LocalTime distractionTimeStart;
	private LocalTime distractionTimeEnd;
	private Point2D.Float distractionCoords;
	
	public Distraction(LocalDate distractionDate, LocalTime distractionTimeStart, LocalTime distractionTimeEnd,
			Float distractionCoords) {
		super();
		this.distractionDate = distractionDate;
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionCoords = distractionCoords;
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

}
