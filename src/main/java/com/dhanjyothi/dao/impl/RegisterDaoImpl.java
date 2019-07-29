package com.dhanjyothi.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction tx = null;

	private static Logger log = Logger.getLogger(RegisterDaoImpl.class);

	RegisterDaoImpl() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
	}

	

	public List<User> getAllUsers() {
		return null;
	}



	public void saveRegister(User user) {
		try {
			session.save(user);
			 tx.commit();
			log.info("Successfully saved the user details into the database :"+user.getUserName());
		} catch (Exception e) {
			log.error("An error occurred while saving the user details into the database", e);
		}
		
	}



}
