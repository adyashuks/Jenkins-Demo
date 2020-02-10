package com.example.Jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

	@RequestMapping("/hello")
	public String name() {
		return "Adya"; 
	}
}
