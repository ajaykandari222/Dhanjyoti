package com.dhanjyothi.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.controller.AccountController;
import com.dhanjyothi.dao.AccountDao;
import com.dhanjyothi.dto.AccountRequest;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.Beneficiaries;
import com.dhanjyothi.model.Transaction;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	private static Logger log = Logger.getLogger(AccountServiceImpl.class);
	@Autowired
	private AccountDao accountDao;

	public Account getAccountDetails(int userId, String accountType) throws Exception {
		return null;
	}

	public void openSavingsAccount(AccountRequest account,User user) throws Exception {
		log.info("opening Saving Account for  User : " + user.getUserName());	
		account.setUser(user);
		Account a=new Account();
		a.setAccontNum(account.getAccontNum());
		a.setAccontType(account.getAccontType());
		a.setAccontBalance(account.getAccontBalance());
		a.setCreatedDate(account.getCreatedDate());
		a.setUpdatedDate(account.getUpdatedDate());
		a.setUser(user);
		accountDao.openSavingsAccount(a);

	}

	public void openTermAccount(Account account, User user) throws Exception {

	}

	public List<Account> getTermAccountDetails(int userId, String accountType) throws Exception {
		return null;
	}

	public Map<Integer, String> getTenureDetails() {
		return null;
	}

	public boolean checkSavingsAccBalance(long termAmt) throws Exception {
		return true;
	}

	public void updateSavingsAccount(Account account, User cust) throws Exception {

	}

	public User getUserDetails(User user) throws Exception {
		return null;
	}

	public void saveBeneficiaries(Account account, Beneficiaries beneficiaries) throws Exception {

	}

	public boolean checkAccountExists(Beneficiaries beneficiaries) throws Exception {
		return true;
	}

	public List<Beneficiaries> getAllBeneficiaries(int accountId) throws Exception {
		return null;
	}

	public void updateFromAccount(Account account, long transAmt, Transaction transaction) throws Exception {

	}

	public void updateToAccount(Transaction transaction) throws Exception {

	}

	public List<Transaction> loadAllTransactions(int accId) throws Exception {
		return null;
	}

	public boolean isUserNameExists(String name) throws Exception {
		return true;
	}

	public Account checkAccountExists(int accountId) throws Exception {
		return null;

	}

	public User getUserById(int userId) throws Exception {
		return null;
	}
}
