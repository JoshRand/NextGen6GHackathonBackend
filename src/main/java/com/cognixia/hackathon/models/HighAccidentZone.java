package com.cognixia.hackathon.models;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "haz")
public class HighAccidentZone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "haz_id")
	private Integer hazId;
	
	private Point2D.Float center;
	private float radius;
	
	public HighAccidentZone(Float center, float radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	
	public Point2D.Float getCenter() {
		return center;
	}
	public void setCenter(Point2D.Float center) {
		this.center = center;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// TODO: Update to check circle, not square area
	public boolean inArea(Point2D.Float coords) {
		if ((coords.x <= this.center.x + radius || coords.x >= this.center.x - radius)
		&& (coords.y <= this.center.y + radius || coords.y >= this.center.y - radius)) {
			return true;
		}
		
		return false;
	}

}
