package com.glovo.interview.arrays;

import java.util.HashMap;

public class MatchingStrings {

	public static int[] matchingStrings(String[] strings, String[] queries) {
		int[] results = new int[queries.length];
		HashMap<String, Integer> myMap = new HashMap<>();
		for (String s : strings) {
			myMap.put(s, myMap.getOrDefault(s, 0) + 1);
		}

		for (int i = 0; i < queries.length; i++) {
			var g = myMap.getOrDefault(queries[i], 0);
			results[i] = g;
		}
		return results;
	}

}
