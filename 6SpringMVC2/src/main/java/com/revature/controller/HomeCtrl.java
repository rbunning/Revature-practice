package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

	@RequestMapping("/home")
	public String homePageAll() {
		System.out.println("HomeCtrl -All");
		return ("/static/home.html");
	}
}
