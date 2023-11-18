package com.sgtesting.testcases.stepDefinitions;

public class User {
     private String address;
     private String emailId;
     private String firstName;
     private String lastName;
     private String phoneNumber;
     private String userRole;
     private Long Zipcode;
     
     public User()
     {
    	 
     }

	public User(String address, String emailId, String firstName, String lastName, String phoneNumber, String userRole,
			Long zipcode) {
		super();
		this.address = address;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.userRole = userRole;
		Zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Long getZipcode() {
		return Zipcode;
	}

	public void setZipcode(Long zipcode) {
		Zipcode = zipcode;
	}
     
     
}
