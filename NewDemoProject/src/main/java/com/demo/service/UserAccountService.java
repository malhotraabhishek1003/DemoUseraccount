package com.demo.service;

import java.util.List;

import com.demo.entity.Interest;
import com.demo.entity.UserAccount;



public interface UserAccountService {

	//create new Account
	public UserAccount saveNewUserAccount(UserAccount account);

	//create new Account
		public Interest createInterest(Interest interest);
		
	// Get person
	public List<UserAccount> getUsers();


}
