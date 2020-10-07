package com.cognixia.hackathon.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognixia.hackathon.models.Account;
import com.cognixia.hackathon.models.User;
import com.cognixia.hackathon.repositories.AccountRepository;
import com.cognixia.hackathon.repositories.UserRepository;

public class AccountService
{
	@Autowired
	private AccountRepository accountRepo;
	
	public boolean accountExists(String email)
	{
		return true;
	}
	
	public void addAccount(Account account)
	{
		accountRepo.save(account);
	}
}
