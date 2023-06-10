package com.binson.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.binson.springapp.SpringExample1Application;

@Controller
public class AppController {
	
	@RequestMapping("/home")
	public String displayHomePage() {
		return "home.html";
	}
	
	@RequestMapping("/restart")
	public void restartApp() {
		SpringExample1Application.restart();
	}
}
