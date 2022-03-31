package com.pawan.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hii")
	
	public String sayHello() {
		return "welcome to CICD world now start using jenkins and rock....";
	}
	///boot-jenkins/target/dockerdemo.jar
}
