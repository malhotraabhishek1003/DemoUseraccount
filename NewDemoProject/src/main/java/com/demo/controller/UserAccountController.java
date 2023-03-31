package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
  
}
