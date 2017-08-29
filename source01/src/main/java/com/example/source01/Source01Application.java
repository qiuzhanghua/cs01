package com.example.source01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Source01Application {

	public static void main(String[] args) {
		SpringApplication application = new  SpringApplication(Source01Application.class);
		application.setWebEnvironment(false);
		application.run(args);
	}
}
