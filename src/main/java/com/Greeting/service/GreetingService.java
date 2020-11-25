package com.Greeting.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.Greeting.model.Greeting;
import com.Greeting.model.User;

@Service
public class GreetingService implements IGreetingService {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Override
	public Greeting addGreeting(User user) {
		String message = "Hello World";
		return new Greeting(counter.incrementAndGet(),message);
	}

	@Override
	public Greeting getGreetingById(Long id) {
		return null;
	}

}
