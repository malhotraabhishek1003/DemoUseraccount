package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.demo.entity.Interest;
import com.demo.entity.UserAccount;

public interface UserAccountService {

	// create new Account
	public UserAccount saveNewUserAccount(UserAccount account);

	// create new Account
	public Interest createInterest(Interest interest);

	// Get person
	public List<UserAccount> getUsers();

	// Get UserBy Id
	public Optional<UserAccount> getUsersById(int id);

	// Update UserBy Id
	public ResponseEntity<UserAccount> updateUserAccount(int id);

	// Delete UserBy Id
	public ResponseEntity<String> deleteUserAccount(int id);

}
