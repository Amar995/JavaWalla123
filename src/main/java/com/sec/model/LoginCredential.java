package com.sec.model;



public class LoginCredential {
	
	
	private String pass;
	private String email;


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
		return "User [  pass=" + pass + ", email=" + email + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
