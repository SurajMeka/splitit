package com.corp.pocketExpenses.model;

import java.time.LocalDateTime;

public class User {

	private String userName;
	
	private String mailId;
	
	private String age;
	
	private LocalDateTime dtJoined;
	
	private String mobileNo;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public LocalDateTime getDtJoined() {
		return dtJoined;
	}

	public void setDtJoined(LocalDateTime dtJoined) {
		this.dtJoined = dtJoined;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
