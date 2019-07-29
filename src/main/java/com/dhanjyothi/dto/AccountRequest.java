package com.dhanjyothi.dto;

import com.dhanjyothi.model.User;

public class AccountRequest {
	private User user;
	private String accontNum;
	
	private String accontType;
	
	private int accontBalance;
	
	private String createdDate;
	
	private String updatedDate;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAccontNum() {
		return accontNum;
	}

	public void setAccontNum(String accontNum) {
		this.accontNum = accontNum;
	}

	public String getAccontType() {
		return accontType;
	}

	public void setAccontType(String accontType) {
		this.accontType = accontType;
	}

	public int getAccontBalance() {
		return accontBalance;
	}

	public void setAccontBalance(int accontBalance) {
		this.accontBalance = accontBalance;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	
}
