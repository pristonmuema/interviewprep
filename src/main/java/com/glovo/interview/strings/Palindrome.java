package com.glovo.interview.strings;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class Palindrome {

	/**
	 * Use two pointers start and end or left and right. Iterate through the string until the two
	 * pointers meet in the middle
	 * <p>
	 * 1. Initialise the start/left pointer to 0 and end/right pointer to s.length()-1 2. Use while to
	 * iterate start/left < end/right 3. If character at start/left is not alphanumeric increment
	 * left/start by 1 4. if character at end/right is not alphanumeric decrement end/right by 1 5. if
	 * the lowercase of s[start/left] is not equal to lowercase s[end/right] return false 6. if they
	 * are equal increment start/left by 1 and decrement end/right by 1. and we continue iterating 7.
	 * If the loop completes without returning false then  it means the string is a palindrome
	 *
	 * @param s the String we should check whether it's a palindrome
	 * @return the result whether its true or false.
	 */



	public boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		if (s.isEmpty()) {
			return true;
		}
		//	s = s.toLowerCase();
//		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int start = 0;
		int end = s.length() - 1;

		while (start <= end) {
			char startChar = s.charAt(start);
			char endChar = s.charAt(end);
			if (!Character.isLetterOrDigit(startChar)) {
				start++;
			} else if (!Character.isLetterOrDigit(endChar)) {
				end--;
			} else {
				if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
					return false;
				}
				start++;
				end--;
			}
		}
		return true;
	}

	public boolean isPalindrome1(String s) {
		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			if (s.charAt(start++) != s.charAt(end--)) {
				return false;
			}
		}
		return true;
	}


	public boolean isPalindromeMap(String s) {

		String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		Map<Integer, Character> map = new HashMap<>();
		//put all characters into map
		for (int i = 0; i < str.length(); i++) {
			map.put(i, str.charAt(i));
		}

		//check from front and back
		int n = str.length() - 1;
		for (int i = 0; i < map.size(); i++) {
			if (map.get(i) != str.charAt(n)) {
				return false;
			} else {
				n--;
			}
		}

		return true;
	}

}
