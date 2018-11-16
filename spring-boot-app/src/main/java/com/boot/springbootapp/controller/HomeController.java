package com.boot.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(path = "/test")
	public String test() {
		return "Test Successful";
	}
	
	@RequestMapping("/")
	public String testhome() {
		return "Test Home Successful";
	}

}
