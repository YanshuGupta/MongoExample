package com.example.MongoExample.service;

import java.util.List;

import com.example.MongoExample.model.User;

public interface UserService {

	void populate();

	List<User> findAll();

}