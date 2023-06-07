package com.gl.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String  password;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return emailAddress;
	}

	public String getPassword() {
		return password;
	}
	
	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

}
