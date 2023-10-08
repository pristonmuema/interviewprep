package com.glovo.interview.arrays.slidingWindow;

import io.quarkus.runtime.util.StringUtil;
import jakarta.enterprise.context.ApplicationScoped;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class MinMumSlidingWindow {

//	Time complexity:
//	O(n) n= s.length
//
//	Space complexity:
//	O(T) T= t.length

	public String minWindow(String s, String t) {
		if (StringUtil.isNullOrEmpty(s) || StringUtil.isNullOrEmpty(t) || s.length() < t.length()) {
			return "";
		}
		Map<Character, Integer> map = new HashMap<>();
		for (char c : t.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		// mapCounter = 0 denotes condition is satisfied and we got solution
		int mapCounter = map.size();
		int n = s.length();
		int left = 0;
		int start = 0;
		int maxLen = 0;
		for (int right = 0; right < n; right++) {
			char curR = s.charAt(right);
			if (map.containsKey(curR)) {
				map.put(curR, map.get(curR) - 1);
				if (map.get(curR) == 0) {
					mapCounter--;
				}

				// got soltion
				if (mapCounter == 0) {
					// finding better solution by shifting left pointer
					while (left < n && mapCounter == 0) {
						char curL = s.charAt(left);
						if (map.containsKey(curL)) {
							map.put(curL, map.get(curL) + 1);
							if (map.get(curL) > 0) {
								mapCounter++;
							}
						}
						left++;
					}
					// getting best solution
					if (maxLen > right - left + 2 || maxLen == 0) {
						maxLen = (right - left) + 2;
						start = left - 1;
					}
				}
			}
		}
		return s.substring(start, start + maxLen);
	}
}
