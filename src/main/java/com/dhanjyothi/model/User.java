package com.dhanjyothi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

//@Component
@Entity
@Table(name = "user")
public class User {
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user2")	
    private List<Account> account;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="user_id")
	private int userId; 

	@Column(name="fName")
	private String fName;
	
	@Column(name="lName")
	private String lName;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="addrL1")
	private String addrL1;
	
	@Column(name="addrL2")
	private String addrL2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pin")
	private int pin;
	
	@Column(name="mobile")
	private long mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="aadhar")
	private long aadhar;
	
	@Column(name="pan")
	private String pan;
	
	@Column(name="user_name")
	String userName;
	
	@Column(name="user_password")
	String userPassword;
	
	@Column(name="passwordconf")
	private String passwordconf;
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddrL1() {
		return addrL1;
	}
	public void setAddrL1(String addrL1) {
		this.addrL1 = addrL1;
	}
	public String getAddrL2() {
		return addrL2;
	}
	public void setAddrL2(String addrL2) {
		this.addrL2 = addrL2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getPasswordconf() {
		return passwordconf;
	}
	public void setPasswordconf(String passwordconf) {
		this.passwordconf = passwordconf;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	
}
