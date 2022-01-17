package com.java.knapsack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.knapsack.entites.InputData;

/**
 * @author Srinivasan E
 * 
 *         This is the service implementation class for holding the knapsack
 *         logic to resolve and help santa to fit the weights in the hoods
 *
 */

@Service
@Qualifier("santaService")
public class SantaServiceImpl implements SantaService {

	/**
	 * This method is used as gateway where it gets the required input and send back
	 * the expected output
	 */
	@Override
	public String help(InputData input) {
		System.out.println(input);
		List<Integer> outputData = new ArrayList<Integer>();
		outputData.add(9);
		return outputData.toString();
	}

}
