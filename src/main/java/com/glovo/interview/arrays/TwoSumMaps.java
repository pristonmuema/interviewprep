package com.glovo.interview.arrays;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class TwoSumMaps {

	public int[] twoSum(int[] list, int target) {
		Map<Integer, Integer> integerMap = new HashMap<>();
		int length = list.length;
		for (int i = 0; i < length; i++) {
			int compliment = target - list[i];
			if (integerMap.containsKey(compliment)) {
				return new int[]{integerMap.get(compliment), i};
			}
			integerMap.put(list[i], i);
		}
		return new int[]{};
	}
}
