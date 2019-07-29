package com.dhanjyothi.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.LoginDao;
import com.dhanjyothi.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction tx = null;

	private static Logger log = Logger.getLogger(LoginDaoImpl.class);

	LoginDaoImpl() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
	}

	public boolean validateUser(User user) {
		boolean validUser=false;
		try {
			List<User> userObj = session
					.createNativeQuery("select * from user u where u.user_name =? and u.user_password =?",User.class)
					.setParameter(1, user.getUserName())
					.setParameter(2, user.getUserPassword())
					.getResultList();
			if (userObj != null && userObj.size() > 0) {
				log.info("DB query ran successfully **********Id= " + userObj.get(0).getUserId() + ", " + "Name= "
						+ userObj.get(0).getUserName() + ", " + "Password= " + userObj.get(0).getUserPassword());
				validUser = true;
			}
		} catch (Exception e) {
			log.error("An error occurred while fetching the user details from the database", e);
		}
		return validUser;
	}
}