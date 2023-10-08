package com.glovo.interview.arrays;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class HourGlass {

	public int hourglassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
				                 + arr.get(i + 1).get(j + 1)
				                 + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

				maxSum = Math.max(maxSum, currentSum);
			}
		}

		return maxSum;
	}

}
