package com.java.knapsack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.knapsack.entites.InputData;
import com.java.knapsack.utils.KnapSackUtil;

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

	private KnapSackUtil knapSackUtil=new KnapSackUtil();

	/**
	 * This method is used as gateway where it gets the required input and send back
	 * the expected output
	 */
	@Override
	public String help(InputData input) {

		// Validation Phase
		String errorMsg = validateInput(input);
		if (errorMsg != null) {
			return errorMsg;
		}

		List<Integer> outputData = knapSackUtil.solve(input.getHood_capacity(), input.getPresent_weights());

		if (outputData == null || outputData.isEmpty()) {
			return "Cant fit weights into hood as per given input data..!";
		} else {
			return outputData.toString();
		}

	}

	private List<Integer> getWeightSets(InputData input) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Does the basic input validation
	 * 
	 * @return error message if input was wrong or unexpected value
	 */
	private String validateInput(InputData input) {

		if (input.getHood_capacity() == null || input.getHood_capacity() <= 0) {
			return "Verify the hood capacity value which is incorrect";
		}

		if (input.getPresent_weights() == null || input.getPresent_weights().isEmpty()) {
			return "Verify the present weight values which is incorrect";
		}

		return null;
	}
}
