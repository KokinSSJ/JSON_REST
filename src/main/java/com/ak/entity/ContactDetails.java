package com.ak.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactDetails {
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ContactDetails() {
		super();
	}

	
	
	
	

}
