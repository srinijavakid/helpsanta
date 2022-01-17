package com.java.knapsack.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Srinivasan E
 * 
 *         This is the base main class for the application which has the
 *         initialization part of the whole application
 *
 */
@SpringBootApplication
@ComponentScan(value = "com")

public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
