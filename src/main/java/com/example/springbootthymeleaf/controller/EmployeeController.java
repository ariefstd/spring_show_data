package com.example.springbootthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootthymeleaf.dao.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/show", "/"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("listemployees");
		mav.addObject("employees", eRepo.findAll());
		return mav;
	}
	
	
}