package com.revature.controllers;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.revature.bean.User;

@Controller
public class LoginCtrl {

	// @Autowired
	// private AppServiceImpl service;

	@RequestMapping("/login")
	public String loginPageAll() {
		System.out.println("LoginCtrl -All");
		return ("/static/login.html");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody /* void */ ModelAndView loginPagePost(User user, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("LoginCtrl -Post");
		System.out.println("User entered: " + user);
		System.out.println("request object: " + request.getParameter("username"));

		return new ModelAndView("redirect:/home");
	}
}
