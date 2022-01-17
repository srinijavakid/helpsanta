package com.java.knapsack.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Srinivasan E
 * 
 *         This class is used as an utility for knapsack logic
 *
 */
@Component
public class KnapSackUtil {

	private int totalValue = 0;

	private List<Integer> tempList = new ArrayList<Integer>();

	/**
	 * This method caters to solve the core problem
	 * 
	 * @param capacity
	 * @param presentWeights
	 * @return
	 */
	public List<Integer> solve(int capacity, List<Integer> presentWeights) {

		//Refresh data for every input
		totalValue = 0;
		tempList.clear();
		
		
		//Initialize the data and sort it
		List<Integer> finalList = new ArrayList<Integer>();
		Collections.sort(presentWeights, Collections.reverseOrder());

		for (Integer value : presentWeights) {

			finalList.addAll(recursiveCall(capacity, value));
			tempList.clear();
		}
		return finalList;
	}

	/**
	 * This recursive method is called to get the values in recursive way un till we
	 * reach total value to capacity
	 * 
	 * @param capacaity
	 * @param currentValue
	 * @return
	 */
	public List<Integer> recursiveCall(int capacaity, int currentValue) {

		if ((totalValue + currentValue) <= (capacaity)) {
			totalValue = totalValue + currentValue;
			tempList.add(currentValue);
			recursiveCall(capacaity, currentValue);
		} else if (capacaity - currentValue == totalValue) {
			tempList.add(currentValue);
		} else {

			return tempList;
		}
		return tempList;

	}

}
