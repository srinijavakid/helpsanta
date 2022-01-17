package com.java.knapsack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.knapsack.entites.InputData;
import com.java.knapsack.service.SantaService;

/**
 * @author Srinivasan E
 * 
 *         This is the Controller class for the application
 *
 */
@RestController
public class SantaController {

	@Autowired
	@Qualifier("santaService")
	private SantaService service;

	/**
	 * This method is used to help santa by resolving the knapsack issue
	 * 
	 * @param input data with hood capacity and given weights sets
	 * @return the set of weight items which fits the hood
	 */
	@PostMapping(value = "/help")
	public String helpSanta(@RequestBody InputData input) {
		return service.help(input);
	}
}
