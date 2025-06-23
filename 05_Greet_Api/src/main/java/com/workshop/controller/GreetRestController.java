package com.workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welcomeClient;

	@GetMapping("/greet")
	public String getWelcomeMsg() {
		
		String msg="Good morning";
		String msg2 = welcomeClient.getWelcomeMsg();
		
		return msg+msg2;
	}
	
}
