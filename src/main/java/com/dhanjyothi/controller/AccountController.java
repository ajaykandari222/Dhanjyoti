package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.dhanjyothi.dto.AccountRequest;
import com.dhanjyothi.model.Account;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.AccountService;

@Controller
public class AccountController {
	private static Logger log = Logger.getLogger(AccountController.class);
	@Autowired
	private AccountService accountService;
	
	/*@GetMapping("/createsavingsaccount")
	public String loadAccountCreationPage(Model model, HttpServletRequest request) {
		return null;

	}*/
	/*@RequestMapping(value = "/createsavingsaccount", method = RequestMethod.GET)
	public ModelAndView showAccountsummary() {
		 log.info("showRegister");	
		 ModelAndView mav = new ModelAndView("accountsummary");
		 Account account = new Account();
		 mav.addObject("loginBean", account);
	     return mav;
	}*/
	@RequestMapping(value = "/createsavingsaccount", method = RequestMethod.POST)
	public ModelAndView processAccountCreationPage(@ModelAttribute("account") AccountRequest account, Model model,HttpSession session,BindingResult bindingResult) throws Exception {
		User user=(User)session.getAttribute("user");
		log.info("User details= " + user.getUserName());	
		accountService.openSavingsAccount(account,user);
		ModelAndView mav= null;			
        mav = new ModelAndView("accountsummary");
        // model.addObject("loginBean", loginBean);
     	mav.addObject("message", "Successfully Created!!!");
     	return  mav;
	}
	@GetMapping("/loadtermaccount")
	public String loadTermAccount(@ModelAttribute("account") Account account, Model model) {

		return null;
	}

	@PostMapping("/createtermaccount")
	public String createTermAccount(@ModelAttribute("account") Account account, Model model, HttpServletRequest request,
			BindingResult bindingResult) {
		return null;
	}

	@GetMapping("/viewtransactions")
	public String loadTransactionDetails(Model model, HttpServletRequest request) {
		return null;
	}
}
