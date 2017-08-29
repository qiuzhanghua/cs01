package com.example.sink01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sink01Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Sink01Application.class);
		application.setWebEnvironment(false);
		application.run(args);
	}
}
