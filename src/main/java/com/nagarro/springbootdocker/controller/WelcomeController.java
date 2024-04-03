package com.nagarro.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	 @GetMapping("/welcome")
	 public String hello() {
	    return "Welcome to spring boot! ";
	 }
}
