package com.example.MongoExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MongoExample.model.User;
import com.example.MongoExample.service.UserService;

@RestController
public class IndexController {

	@Autowired
	UserService userService;
	
	@GetMapping("/populate")
	public String populate() {
		userService.populate();
		return "users are created";
	}
	
	@GetMapping("/users")
	public List<User> index() {
		return userService.findAll();
	}	
	
}
