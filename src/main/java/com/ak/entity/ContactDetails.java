package com.ak.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ContactDetails {
	
	private String email;
	
	private int phoneNumber;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ContactDetails() {
		super();
	}

	
	
	
	

}
