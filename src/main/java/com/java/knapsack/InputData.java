package com.java.knapsack;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputData {

	public Long hood_capacity;
	public List<Long> present_weights;

	public Long getHood_capacity() {
		return hood_capacity;
	}

	public void setHood_capacity(Long hood_capacity) {
		this.hood_capacity = hood_capacity;
	}

	public List<Long> getPresent_weights() {
		return present_weights;
	}

	public void setPresent_weights(List<Long> present_weights) {
		this.present_weights = present_weights;
	}

	public InputData(@JsonProperty("hood_capacity") Long hood_capacity,
			@JsonProperty("present_weights") List<Long> present_weights) {
		super();
		this.hood_capacity = hood_capacity;
		this.present_weights = present_weights;
	}

	@Override
	public String toString() {
		return "input [hood_capacity=" + hood_capacity + ", present_weights=" + present_weights + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hood_capacity, present_weights);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InputData other = (InputData) obj;
		return Objects.equals(hood_capacity, other.hood_capacity)
				&& Objects.equals(present_weights, other.present_weights);
	}

}
