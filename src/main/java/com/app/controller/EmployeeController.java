package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController{
	public EmployeeController() {
		System.out.println("controller load succes");
	}
	
	@RequestMapping("/show")
	public String ShowPage(Model m) {
		m.addAttribute("msg", "Welcome to Springboot webApp::"+new Date());
		return"Home";
	}

}
