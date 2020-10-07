package com.cognixia.hackathon.models;

public class Account {
	
	private String email;
	private String password;
	private float totalScore;
	
	public Account(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.totalScore = 0;
	}
	
	public Account(String email, String password, float totalScore) {
		super();
		this.email = email;
		this.password = password;
		this.totalScore = totalScore;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Account [email=" + email + ", password=" + password + ", totalScore=" + totalScore + "]";
	}

}
