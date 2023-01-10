package com.ksolves.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.ksolves.entity.User;
import com.ksolves.service.UserService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "saveUser",method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user") User user) {
		userService.insert(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("status",true);
		mv.addObject("description","User Saved Successfully!");
		mv.setViewName("usersaved");
		return mv;
	}
}
