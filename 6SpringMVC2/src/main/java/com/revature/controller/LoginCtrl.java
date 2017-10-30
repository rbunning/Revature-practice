package com.revature.controller;

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

import com.revature.bean.SchoolUser;
import com.revature.service.AppService;

@Controller
public class LoginCtrl {

	 @Autowired
	 private AppService service;

	@RequestMapping("/login")
	public String loginPageAll() {
		System.out.println("LoginCtrl -All");
		return ("/static/login.html");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody /* void */ ModelAndView loginPagePost(SchoolUser user, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("LoginCtrl -Post");
		System.out.println("User entered: " + user);
		System.out.println("request object: " + request.getParameter("userName"));
		
		SchoolUser authUser = service.SchoolUserWithUsename(request.getParameter("userName"));
		if (authUser != null) {
			return new ModelAndView("redirect:/home");
		} else {
			return new ModelAndView("/static/index.html");
		}
	}
}
