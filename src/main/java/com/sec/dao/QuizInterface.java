package com.sec.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sec.model.Quiz;
@Repository
public interface QuizInterface extends MongoRepository<Quiz,Integer> {
	
	@Query("{$sort:{_id:-1}},{$limit:3}")
	public List<Quiz> findByName();
	
}
