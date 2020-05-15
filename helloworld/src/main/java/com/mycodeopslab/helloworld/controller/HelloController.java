package com.mycodeopslab.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//nossa classe atente url via web
public class HelloController {
	
	@GetMapping("/exemplo") //metdo queatente a url 
	public String sayHello() {
		return "HelloWorld SpringBoot";
	}
	
	@GetMapping("/goodbye")
	public String sayGoodbye() {
		return "goodby xpto";
	}

}
