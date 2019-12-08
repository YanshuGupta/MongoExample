package com.example.MongoExample.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.MongoExample.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
