package com.dhanjyothi.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dhanjyothi.model.User;
import com.dhanjyothi.service.impl.LoginServiceImpl;

@Controller
@SessionAttributes("user")
public class LoginController {
	private static Logger log = Logger.getLogger(LoginController.class);
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	/*@Autowired
	private User user;*/
	
	@ModelAttribute("user")
	public User setUser() {
		return new User();
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
    public ModelAndView displayLogin()
    {
        ModelAndView model = new ModelAndView("login");
        User user = new User();
        model.addObject("loginBean", user);
        return model;
    }	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("user") User user,HttpServletRequest request, Model model) {
        ModelAndView mav= null;	
		log.info("User details= " + user.getUserId() + user.getUserPassword());		
		try
        {
             boolean isValid = loginServiceImpl.validateUser(user);
            if(isValid)
            {
                log.info("User Login Successful" + isValid);
                log.info(" Login User" + user.getUserName());
                mav = new ModelAndView("accountsummary");                
                mav.addObject("loggedInUser", user.getUserName());               
            }
            else
            {
            	mav = new ModelAndView("login");
               // model.addObject("loginBean", loginBean);
            	mav.addObject("message", "Invalid credentials!!");
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
        return mav;		
	}
	

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("user") User user, HttpServletRequest request, Model model) {
		return null;
	}

	@RequestMapping("/accsummary")
	public String loadAccSummary(HttpServletRequest request, Model model) {
		return null;
	}

	@RequestMapping("/adduser")
	public String addUser(HttpServletRequest request, Model model) {
		return null;
	}

	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request) {

		return null;
	}
}
