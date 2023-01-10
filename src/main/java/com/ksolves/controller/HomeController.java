package com.ksolves.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ksolves.entity.User;

@Controller
public class HomeController {

	@RequestMapping(value = "home", method= RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = {"register"})
	public ModelAndView register() {
		System.out.println("register page");
		ModelAndView mv = new ModelAndView();
		mv.addObject(new User());
		mv.setViewName("register");
		return mv;
	}
}
