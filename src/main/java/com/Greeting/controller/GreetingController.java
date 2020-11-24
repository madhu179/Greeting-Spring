package com.Greeting.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;
import com.Greeting.model.Greeting;

@RestController
@RequestMapping("/main")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
	@PostMapping("/post")
	public Greeting greeting(@RequestBody Greeting greeting){
		return greeting;
	}
	
	@PutMapping("/put/{id}")
	public Greeting putGreeting(@PathVariable long id, @RequestParam(value="message") String message){
		return new Greeting(id,message);
	}

}
