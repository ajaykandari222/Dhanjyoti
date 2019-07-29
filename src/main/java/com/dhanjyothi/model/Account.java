package com.dhanjyothi.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "account")
public class Account {
	 @ManyToOne(cascade = CascadeType.ALL, optional=false)
	 @JoinColumn(name = "USER_ID")	
    private User user2;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="accontId")
	private int accontId; 

	@Column(name="accontNum")
	private String accontNum;
	
	@Column(name="accontType")
	private String accontType;
	
	@Column(name="accontBalance")
	private int accontBalance;
	
	@Column(name="createdDate")
	private String createdDate;
	
	@Column(name="updatedDate")
	private String updatedDate;

	

	public int getAccontId() {
		return accontId;
	}

	public void setAccontId(int accontId) {
		this.accontId = accontId;
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

	public User getUser() {
		return user2;
	}

	public void setUser(User user2) {
		this.user2 = user2;
	}
	
	


}