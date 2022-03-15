package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SBRepositoryEmployee {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SBRepositoryEmployee.class, args);

	}

}
