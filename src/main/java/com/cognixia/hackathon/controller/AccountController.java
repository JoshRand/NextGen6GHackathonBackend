package com.cognixia.hackathon.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.hackathon.models.Account;
import com.cognixia.hackathon.models.User;
import com.cognixia.hackathon.services.AccountService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AccountController
{
	
	@Autowired
	AccountService accountService;
	@PostMapping("/register")
	public ResponseEntity<Account> createAccount( @RequestBody Account account)
	{
		
		System.out.println(account.toString());
		if(accountService.accountExists(account.getEmail()))
		{
			return null;
		}
		else
		{
			Account acc = new Account(account.getEmail(),"",account.getTotalScore());
			accountService.addAccount(account);
			return new ResponseEntity<Account>(acc,HttpStatus.CREATED);
		}
		
	}
	
	
	
	
}
