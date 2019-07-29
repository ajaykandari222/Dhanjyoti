package com.dhanjyothi.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.dao.impl.RegisterDaoImpl;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	private static Logger log = Logger.getLogger(RegisterServiceImpl.class);
	@Autowired
	private RegisterDaoImpl registerDaoImpl;
	public void saveRegister(User customer) {
		log.info("Saving the user in the database");
		 registerDaoImpl.saveRegister(customer);
	}

	public List<User> getAllUsers() {
		return null;
	}

}
