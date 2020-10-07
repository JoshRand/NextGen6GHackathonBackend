package com.cognixia.hackathon.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Account account;
	private String currentRoute;
	private List<String> sessions;
	
	public User(Account account) {
		super();
		this.account = account;
		this.currentRoute = "";
		this.sessions = new ArrayList<String>();
	}
	
	public User(Account account, String currentRoute, List<String> sessions) {
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

	public String getCurrentRoute() {
		return currentRoute;
	}

	public void setCurrentRoute(String currentRoute) {
		this.currentRoute = currentRoute;
	}

	public List<String> getSessions() {
		return sessions;
	}

	public void setSessions(List<String> sessions) {
		this.sessions = sessions;
	}

	@Override
	public String toString() {
		return "User [account=" + account + ", currentRoute=" + currentRoute + ", sessions=" + sessions + "]";
	}
}
