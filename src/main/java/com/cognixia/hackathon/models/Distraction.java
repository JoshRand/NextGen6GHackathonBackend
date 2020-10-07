package com.cognixia.hackathon.models;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.time.LocalDateTime;

public class Distraction {
	
	private LocalDateTime distractionTimeStart;
	private LocalDateTime distractionTimeEnd;
	private Point2D.Float distractionCoords;
	
	public Distraction(LocalDateTime distractionTimeStart, LocalDateTime distractionTimeEnd, Point2D.Float distractionCoords) {
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

	public Point2D.Float  getDistractionCoords() {
		return distractionCoords;
	}

	public void setDistractionCoords(Point2D.Float  distractionCoords) {
		this.distractionCoords = distractionCoords;
	}

}
