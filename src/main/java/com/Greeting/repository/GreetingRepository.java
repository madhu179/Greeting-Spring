package com.Greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Greeting.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
