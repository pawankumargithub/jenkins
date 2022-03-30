package com.pawan.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hii")
	
	public String sayHello() {
		return "welcome to CICD world plz start rocking....";
	}
}
