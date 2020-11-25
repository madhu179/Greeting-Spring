package com.Greeting.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Greeting.model.Greeting;
import com.Greeting.model.User;
import com.Greeting.service.IGreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
	
	@Autowired
	private IGreetingService greetingService;
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/get")
	public Greeting greeting(@RequestParam(value="name",defaultValue="Tadashi") String name){
		User user = new User(name,"Hamada");
		return greetingService.addGreeting(user);
	}

}
