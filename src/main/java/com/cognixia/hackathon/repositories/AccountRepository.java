package com.cognixia.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.hackathon.models.Account;

@Repository("accountRepo")
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
