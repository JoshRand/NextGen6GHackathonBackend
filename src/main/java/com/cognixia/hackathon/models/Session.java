package com.cognixia.hackathon.models;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class Session
{
private LocalDateTime totalFocusTime;
private LocalDateTime totalDistractedTime;
private int distractNum;
private LocalDateTime longestFocusStreak;
private LocalDateTime currentFocusStreak;
@Autowired
public Session(LocalDateTime totalFocusTime, LocalDateTime totalDistractedTime, int distractNum,
		LocalDateTime longestFocusStreak, LocalDateTime currentFocusStreak, LocalDateTime currentDistractedStreak)
{
	super();
	this.totalFocusTime = totalFocusTime;
	this.totalDistractedTime = totalDistractedTime;
	this.distractNum = distractNum;
	this.longestFocusStreak = longestFocusStreak;
	this.currentFocusStreak = currentFocusStreak;
	this.currentDistractedStreak = currentDistractedStreak;
}
@Autowired
public Session()
{
	super();
	// TODO Auto-generated constructor stub
}

public LocalDateTime getTotalFocusTime()
{
	return totalFocusTime;
}
public void setTotalFocusTime(LocalDateTime totalFocusTime)
{
	this.totalFocusTime = totalFocusTime;
}
public LocalDateTime getTotalDistractedTime()
{
	return totalDistractedTime;
}
public void setTotalDistractedTime(LocalDateTime totalDistractedTime)
{
	this.totalDistractedTime = totalDistractedTime;
}
public int getDistractNum()
{
	return distractNum;
}
public void setDistractNum(int distractNum)
{
	this.distractNum = distractNum;
}
public LocalDateTime getLongestFocusStreak()
{
	return longestFocusStreak;
}
public void setLongestFocusStreak(LocalDateTime longestFocusStreak)
{
	this.longestFocusStreak = longestFocusStreak;
}
public LocalDateTime getCurrentFocusStreak()
{
	return currentFocusStreak;
}
public void setCurrentFocusStreak(LocalDateTime currentFocusStreak)
{
	this.currentFocusStreak = currentFocusStreak;
}
public LocalDateTime getCurrentDistractedStreak()
{
	return currentDistractedStreak;
}
public void setCurrentDistractedStreak(LocalDateTime currentDistractedStreak)
{
	this.currentDistractedStreak = currentDistractedStreak;
}
private LocalDateTime currentDistractedStreak;
}
