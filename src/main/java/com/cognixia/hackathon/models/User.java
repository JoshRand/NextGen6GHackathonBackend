package com.cognixia.hackathon.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;
	
	@ManyToOne(targetEntity = Account.class)
	private Account account;
	
	@ManyToOne(targetEntity = Route.class)
	private Route currentRoute;
	
	public User(Account account) {
		super();
		this.account = account;
		this.currentRoute = new Route();
	}
	
	public User(Account account, Route currentRoute, List<Session> sessions) {
		super();
		this.account = account;
		this.currentRoute = currentRoute;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Route getCurrentRoute() {
		return currentRoute;
	}

	public void setCurrentRoute(Route currentRoute) {
		this.currentRoute = currentRoute;
	}

	@Override
	public String toString() {
		return "User [account=" + account + ", currentRoute=" + currentRoute + "]";
	}
}
