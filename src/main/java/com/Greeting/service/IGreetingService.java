package com.Greeting.service;

import com.Greeting.model.Greeting;
import com.Greeting.model.User;

public interface IGreetingService {
	
	Greeting addGreeting(User user);
	
	Greeting getGreetingById(Long id);

}
