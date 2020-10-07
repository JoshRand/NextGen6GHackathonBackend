package com.cognixia.hackathon.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Account account;
	private Route currentRoute;
	private List<Session> sessions;
	
	public User(Account account) {
		super();
		this.account = account;
		this.currentRoute = new Route();
		this.sessions = new ArrayList<Session>();
	}
	
	public User(Account account, Route currentRoute, List<Session> sessions) {
		super();
		this.account = account;
		this.currentRoute = currentRoute;
		this.sessions = sessions;
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

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	@Override
	public String toString() {
		return "User [account=" + account + ", currentRoute=" + currentRoute + ", sessions=" + sessions + "]";
	}
}
