package com.sec.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sec.model.User;
@Repository
public interface UserInterface1 extends MongoRepository<User, Integer>{
public User findByEmail(String email);
}
