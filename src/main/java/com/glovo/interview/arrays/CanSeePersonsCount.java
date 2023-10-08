package com.glovo.interview.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class CanSeePersonsCount {

	public int[] canSeePersonsCount(int[] heights) {
		int n = heights.length;
		int[] ans = new int[n];
		Deque<Integer> stk = new ArrayDeque<>();
		for (int i = n - 1; i >= 0; --i) {
			while (!stk.isEmpty() && heights[i] > stk.peek()) {
				++ans[i];
				stk.pop();
			}
			if (!stk.isEmpty()) {
				++ans[i];
			}
			stk.push(heights[i]);
		}
		return ans;

	}
}
