package com.boot.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EntityScan("com.boot.model")
public class SpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}
}
