package com.corp.pocketExpenses.controller;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corp.pocketExpenses.model.User;
import com.corp.pocketExpenses.service.UserDetailsService;

@RestController
public class UserController {

	@Autowired
	UserDetailsService service;
	
	@GetMapping("/getUserData")
	public void getUser() {
		
		System.out.println("Hello user!");
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) throws InterruptedException, ExecutionException {
		
		user.setDtJoined(LocalDateTime.now());
		return service.saveUserdata(user);
	}
	
}
