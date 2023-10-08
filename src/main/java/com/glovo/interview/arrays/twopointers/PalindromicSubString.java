package com.glovo.interview.arrays.twopointers;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PalindromicSubString {

	public int countSubstrings(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		int odd = 0;
		int even = 0;
		for (int k = 0; k < s.length(); k++) {
			odd += checking(s, k, k);
			even += checking(s, k, k + 1);
		}
		return odd + even;
	}

	public int checking(String s, int left, int right) {
		int count = 0;
		while (left <= right && left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}
}
