package com.glovo.interview.strings;

import io.quarkus.runtime.util.StringUtil;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class Anagram {

	/**
	 * Will have a Time complexity of O(n) + O(n) > O(2n) >>> O(n) and a Space Complexity of O(n)
	 * where n is the length of the string
	 *
	 * @param s first string
	 * @param t second string
	 * @return true or false
	 */
	public boolean isAnagram(String s, String t) {
		if (StringUtil.isNullOrEmpty(s) || StringUtil.isNullOrEmpty(t) || s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> anaMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			anaMap.put(s.charAt(i), anaMap.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int j = 0; j < t.length(); j++) {
			anaMap.put(t.charAt(j), anaMap.getOrDefault(t.charAt(j), 0) - 1);
		}
		for (int v : anaMap.values()) {
			if (v != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Will have Space Complexity of O(n) and Space complexity of 0(1) since is an array of fixed
	 * size. Does not depend on the size of the array since 256 is the max
	 *
	 * @param s first string
	 * @param t second string
	 * @return true or false
	 */
	public boolean isAnagramUsingArray(String s, String t) {
		if (StringUtil.isNullOrEmpty(s) || StringUtil.isNullOrEmpty(t) || s.length() != t.length()) {
			return false;
		}
		int[] charCounts = new int[256];
		for (int i = 0; i < s.length(); i++) {
			charCounts[s.charAt(i)]++;
		}
		for (int i = 0; i < t.length(); i++) {
			charCounts[t.charAt(i)]--;
		}
		for (int count : charCounts) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

}
