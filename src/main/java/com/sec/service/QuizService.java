package com.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.sec.model.Quiz;

@Service
public class QuizService {
    
	@Autowired
	MongoTemplate mon;
	
	public List<Quiz> getData()
	{
		Query query = new Query();
		query.with(Sort.by(Sort.Order.desc("_id")));
		query.with(Pageable.ofSize(8));
		List<Quiz> users = mon.find(query,Quiz.class);
		return users;
	}
}
