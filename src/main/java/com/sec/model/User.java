package com.sec.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	private String name;
	private String pass;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [ name=" + name + ", pass=" + pass + ", email=" + email + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
