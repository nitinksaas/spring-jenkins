package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ApacheKafkaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaProjectApplication.class, args);
	}

	@PostConstruct
	public void init() {

		System.out.println("testing on startup 123...");

	}

}
