package com.dhanjyothi.service;

import org.springframework.stereotype.Service;

import com.dhanjyothi.model.User;


@Service
public interface LoginService {
	public boolean validateUser(User user);

}
