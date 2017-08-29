package com.example.processor01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Processor01Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Processor01Application.class);
		application.setWebEnvironment(false);
		application.run(args);
	}
}
