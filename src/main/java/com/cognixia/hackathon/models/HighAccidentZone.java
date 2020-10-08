package com.cognixia.hackathon.models;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;

public class HighAccidentZone {
	
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
	
	public boolean inArea(Point2D.Float coords) {
	
		if(radius*radius >= (coords.x - this.center.x)*(coords.x - this.center.x) + (coords.y - this.center.y)*(coords.y - this.center.y))
		{
			return true;
		}
		return false;
	}

}
