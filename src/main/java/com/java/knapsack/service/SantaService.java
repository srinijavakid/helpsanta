package com.java.knapsack.service;

import com.java.knapsack.entites.InputData;

/**
 * @author Srinivasan E
 * 
 *         This is the service class for loose coupling the service
 *         implementations for switching the logic in future
 *
 */
public interface SantaService {

	/**
	 * This method is used to resolve knapsack problem
	 */
	public String help(InputData input);

}
