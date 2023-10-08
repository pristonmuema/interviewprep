package com.glovo.interview.arrays.slidingWindow;

import io.quarkus.runtime.util.StringUtil;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class LongestLength {

//	Time complexity:
//	O(n) n s.length
//
//	Space complexity:
//	O(k) k is the the maxLength

	/**
	 * The method checks the longest substring.
	 * <p>
	 * 1.I will check if the string is null or empty.
	 * 2.I will use map to store characters as keys and their indices as values
	 * 3.I will maintain two pointers i.e left and right, to represent the boundaries of the current substring
	 * 4.I will maintain maxLength variable to keep track of the length of the longest substring obtained
	 * 5.I will iterate through the string using the right pointer.
	 * 6.I will update the map with a new character ( If the current character is not in the map or its
	 *   index is less than the left)
	 * 7.I will update the maxLength if necessary
	 * 8.I will update the character value (index) when the character exists.
	 * 8.At the end, I will return the maxLength as the length of the longest substring without repeating
	 *  characters.
	 *
	 * @param s the string to check
	 * @return the length of substring
	 */
	public int lengthOfLongestSubstring(String s) {
		if (StringUtil.isNullOrEmpty(s)) {
			return 0;
		}
		Map<Character, Integer> charMap = new HashMap<>();
		int n = s.length();
		int maxLength = 0;
		int left = 0;

		for (int right = 0; right < n; right++) {
			if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
				charMap.put(s.charAt(right), right);
				maxLength = Math.max(maxLength, right - left + 1);
			} else {
				left = charMap.get(s.charAt(right)) + 1;
				charMap.put(s.charAt(right), right);
			}
		}

		return maxLength;
	}

}
