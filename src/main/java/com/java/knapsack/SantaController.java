package com.java.knapsack;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class SantaController {
	
	
	@PostMapping(value = "/help")
	public String helpSanta(@RequestBody InputData input) {
		return input.toString();
	}
}
