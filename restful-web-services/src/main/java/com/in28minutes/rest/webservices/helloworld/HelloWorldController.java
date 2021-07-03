package com.in28minutes.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	// GET
	// URI- /hello-world
	// method - "Hello World"
	// @RequestMapping(method=RequestMethod.GET,path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("Some Error Occured.Please contact support!");
		return new HelloWorldBean("Hello World");
	}
}
