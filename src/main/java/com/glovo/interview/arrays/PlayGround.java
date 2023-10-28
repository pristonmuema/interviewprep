package com.glovo.interview.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class PlayGround {


	static int[] reverseArray(int[] list) {
		int[] reversedArray = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			reversedArray[i] = list[list.length - 1 - i];
		}
		return reversedArray;
	}

	static int countUniqueElements(int[] list) {
		Map<Integer, Integer> uniquesElements = new LinkedHashMap<>();
		int size = 0;
		while (size < 5) {
			for (int value : list) {
				uniquesElements.put(value, uniquesElements.getOrDefault(value, 0) + 1);
				size = uniquesElements.size();
			}
		}
		return size;
	}

	static int testWhileLoop() {
		int index = 0;
		do {
			index++;
			System.out.println(index);
		} while (index < 4);
		return index;
	}

	static int[] arrayManipulation(int[] values) {
		int len = values.length;
		int[] results = new int[len];

		for (int i = 0; i < len; i++) {
			results[i] = values[i];
			if (i > 0) {
				results[i] += values[i - 1];
			}
			if (i < len - 1) {
				results[i] += values[i + 1];
			}
		}
		return results;
	}

	public PlayGround() {
	}

	static int stringPattern(String source, String pattern) {

		if (source.isEmpty() || pattern.isEmpty()) {
			return 0;
		}
		int total = 0;
		for (int i = 0; i < source.length(); i++) {
			String sub = "";
			if (i < source.length() - 2) {
				sub = source.substring(i, i+3);
				total += stringToPattern(sub, pattern);
			}
		}
		return total;
	}

	static int stringToPattern(String sub, String pattern) {
		if (sub.length() != pattern.length()) {
			return 0;
		}
		StringBuilder builder = new StringBuilder();
		for (char c : sub.toCharArray()) {
			builder.append(isVowel(c));
		}
		if (Objects.equals(builder.toString(), pattern)) {
			return 1;
		}
		return 0;
	}

	static int isVowel(char value) {
		String[] vowels = {"a", "e", "i", "o", "u", "y"};
		if (Arrays.stream(vowels).anyMatch(s -> Objects.equals(s, String.valueOf(value)))) {
			return 0;
		}
		return 1;
	}


	int solution(int[] arrayList) {
		int ans=0;
		for(int i=0;i<31;i++){
			int key = (int)Math.pow(2, i);
			HashMap<Integer,Integer> map = new HashMap<>();
			for (int k : arrayList) {
				if (map.containsKey(key - k))
					ans += map.get(key - k);
				if (key - k == k)
					ans++;
				if (map.containsKey(k))
					map.put(k, map.get(k + 1));
				else
					map.put(k, 1);
			}
		}
		return ans;
	}
}
