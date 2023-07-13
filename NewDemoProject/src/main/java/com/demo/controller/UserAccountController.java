package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Interest;
import com.demo.entity.UserAccount;
import com.demo.service.UserAccountService;


@RestController
@RequestMapping("/api")
public class UserAccountController {

     @Autowired
     UserAccountService accountService ;
     
     
     //create user
     @PostMapping("/users/register-user")
     public UserAccount saveUserAccount(@RequestBody UserAccount account)
     {
         return accountService.saveNewUserAccount(account);
     }
  
     // get user-account
     @GetMapping("/users/get/all")
     public List<UserAccount> fetchPersonList()
     {
         return accountService.getUsers();
     }
     
     @PostMapping("/interests/update")
 	public Interest updateInterest(@RequestBody Interest interest) {
 		
 		return accountService.createInterest(interest);

 	}
     
     @GetMapping("/users/get/{id}")
     public Optional<UserAccount> fetchUserById(@PathVariable int id)
     {
         return accountService.getUsersById(id);
     }
     
     @PutMapping("/users/update/{id}")
     public ResponseEntity<UserAccount> updateUserAccount(@PathVariable int id)
     {
         return accountService.updateUserAccount(id);
     }
     
     @DeleteMapping("/users/delete/{id}")
     public ResponseEntity<String> deleteUserAccount(@PathVariable int id)
     {
         return accountService.deleteUserAccount(id);
     }
  
}
