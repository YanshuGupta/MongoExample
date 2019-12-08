package com.example.MongoExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MongoExample.DAO.UserRepository;
import com.example.MongoExample.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void populate() {
		for(int i=10; i<1000; i++) {
			User user = new User(String.valueOf(i), "andy"+i, "vbhkrv"+i);
			userRepo.save(user);
		}
	}
	
	@Override
	public List<User> findAll(){
		return userRepo.findAll();
	}
	
}
