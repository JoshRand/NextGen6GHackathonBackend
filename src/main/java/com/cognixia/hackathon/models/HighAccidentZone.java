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
	
	private float centerLongitude;
	private float centerLatitude;
	private float radius;
	
	public HighAccidentZone(float centerLongitude, float centerLatitude, float radius) {
		super();
		this.centerLongitude = centerLongitude;
		this.centerLatitude = centerLatitude;
		this.radius = radius;
	}
	
	public float getCenterLongitude() {
		return centerLongitude;
	}

	public void setCenterLongitude(float centerLongitude) {
		this.centerLongitude = centerLongitude;
	}

	public float getCenterLatitude() {
		return centerLatitude;
	}

	public void setCenterLatitude(float centerLatitude) {
		this.centerLatitude = centerLatitude;
	}

	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public boolean inArea(float longitude, float latitude) {
	
		if(radius*radius >= (longitude - this.centerLongitude)*(longitude - this.centerLongitude)
				+ (latitude - this.centerLatitude)*(latitude - this.centerLatitude))
		{
			return true;
		}
		return false;
	}

}
