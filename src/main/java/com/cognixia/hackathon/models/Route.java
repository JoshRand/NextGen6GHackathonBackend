package com.cognixia.hackathon.models;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class Route
{
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
