package com.example.MongoExample.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class User {

	@Id
	private String userId;
	private String userName;
	private String userAddress;
	
	
	public User() {
		super();
	}

	public User(String userId, String userName, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
