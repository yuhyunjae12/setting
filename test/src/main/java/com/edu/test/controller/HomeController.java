package com.edu.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.test.Service.TestService;


@Controller
public class HomeController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("list",service.testList());
		return "home";
	}
	
}
