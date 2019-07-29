package com.dhanjyothi.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.dao.impl.LoginDaoImpl;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	
	private static Logger log = Logger.getLogger(LoginServiceImpl.class);
	@Autowired
	private LoginDaoImpl loginDaoImpl;
	public boolean validateUser(User user) {
		log.info("Checking the user in the database");
		return loginDaoImpl.validateUser(user);
	}


	
}
