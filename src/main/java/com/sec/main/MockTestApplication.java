package com.sec.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.sec.dao")
@ComponentScan(basePackages = "com.sec.*")
public class MockTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockTestApplication.class, args);
	}

}
