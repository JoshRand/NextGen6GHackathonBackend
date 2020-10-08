package com.cognixia.hackathon.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity(name = "route")
public class Route
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "route_id")
	private Integer routeId;
	
	private LocalDateTime startTime;
	private LocalDateTime eta;
	private int distance;
	public LocalDateTime getStartTime()
	{
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime)
	{
		this.startTime = startTime;
	}
	public LocalDateTime getEta()
	{
		return eta;
	}
	public void setEta(LocalDateTime eta)
	{
		this.eta = eta;
	}
	public int getDistance()
	{
		return distance;
	}
	public void setDistance(int distance)
	{
		this.distance = distance;
	}
	@Override
	public String toString()
	{
		return "Route [startTime=" + startTime + ", eta=" + eta + ", distance=" + distance + "]";
	}
	@Autowired
	public Route(LocalDateTime startTime, LocalDateTime eta, int distance)
	{
		super();
		this.startTime = startTime;
		this.eta = eta;
		this.distance = distance;
	}
	@Autowired
	public Route()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
