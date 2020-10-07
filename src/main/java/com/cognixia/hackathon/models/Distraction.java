package com.cognixia.hackathon.models;

import java.awt.Point;
import java.time.LocalDateTime;

public class Distraction {
	
	private LocalDateTime distractionTimeStart;
	private LocalDateTime distractionTimeEnd;
	private Point distractionCoords;
	
	public Distraction(LocalDateTime distractionTimeStart, LocalDateTime distractionTimeEnd, Point distractionCoords) {
		super();
		this.distractionTimeStart = distractionTimeStart;
		this.distractionTimeEnd = distractionTimeEnd;
		this.distractionCoords = distractionCoords;
	}

	public LocalDateTime getDistractionTimeStart() {
		return distractionTimeStart;
	}

	public void setDistractionTimeStart(LocalDateTime distractionTimeStart) {
		this.distractionTimeStart = distractionTimeStart;
	}

	public LocalDateTime getDistractionTimeEnd() {
		return distractionTimeEnd;
	}

	public void setDistractionTimeEnd(LocalDateTime distractionTimeEnd) {
		this.distractionTimeEnd = distractionTimeEnd;
	}

	public Point getDistractionCoords() {
		return distractionCoords;
	}

	public void setDistractionCoords(Point distractionCoords) {
		this.distractionCoords = distractionCoords;
	}

}
