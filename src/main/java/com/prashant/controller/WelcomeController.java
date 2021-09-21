package com.prashant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.model.Welcome;

@RestController
@RequestMapping("/")
public class WelcomeController {

	
	@RequestMapping("/hello")
	public Welcome hello() {
		return new Welcome("welcome to springboot");
	}
}
