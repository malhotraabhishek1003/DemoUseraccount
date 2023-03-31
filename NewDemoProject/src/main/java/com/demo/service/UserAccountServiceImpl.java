package com.demo.service;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.demo.entity.Interest;
import com.demo.entity.UserAccount;
import com.demo.repo.InterestRepo;
import com.demo.repo.UserAccountRepo;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	UserAccountRepo accountRepo;
	
	@Autowired
	InterestRepo interestRepo;
	
	

	@Override
	public UserAccount saveNewUserAccount(UserAccount account) {
		try {
			return accountRepo.save(account);
		} catch (ConstraintViolationException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
		}
	}

	
	@Override
	public List<UserAccount> getUsers() {
		// TODO Auto-generated method stub
		return (List<UserAccount>) accountRepo.findAll();

	}


	@Override
	public Interest createInterest(Interest interest) {
		// TODO Auto-generated method stub
		
		UserAccount userAccount = accountRepo.findById(interest.getUserAccount().getId()).orElse(null);
 		interest.setUserAccount(userAccount);
 		return interestRepo.save(interest);
	}

}
