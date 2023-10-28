package com.glovo.interview.arrays;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class TwoSumArray {

	public List<Integer> sumList(List<Integer> list, int target) {
		int length = list.size();
		if (list.isEmpty()) {
			return List.of();
		}
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (list.get(i) + list.get(j) == target) {
					return List.of(i, j);
				}
			}
		}
		return List.of();
	}

	public int[] sumArray(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i +1; j <numbers.length ; j++) {
				if (numbers[i] + numbers[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return new int[]{};
	}

}
