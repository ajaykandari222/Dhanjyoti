package com.dhanjyothi.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.RegisterService;

@Controller
public class RegisterController {
	private static Logger log = Logger.getLogger(RegisterController.class);
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		 log.info("showRegister");	
		 ModelAndView mav = new ModelAndView("registration");
		 User user = new User();
		 mav.addObject("loginBean", user);
	     return mav;
	}


	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user")User user, BindingResult bindingResult,Model model) {
		log.info("Registering User: " + user.getUserId());	
		registerService.saveRegister(user);
		ModelAndView mav= null;			
        mav = new ModelAndView("login");
        // model.addObject("loginBean", loginBean);
     	mav.addObject("message", "Successfully Registered!!!");
     	return  mav;
	}


	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ModelAndView getAllUsers() {

		return new ModelAndView("");
	}
	
	
}
