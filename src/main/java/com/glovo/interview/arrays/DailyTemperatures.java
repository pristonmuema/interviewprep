package com.glovo.interview.arrays;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Stack;

@ApplicationScoped
public class DailyTemperatures {

	public int[] dailyTemperatures(int[] temp) {
		Stack<Integer> index = new Stack<>();
		int n = temp.length;
		int[] res = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			while (!index.isEmpty() && temp[i] >= temp[index.peek()]) {
				index.pop();
			}
			if (!index.isEmpty()) {
				res[i] = index.peek() - i;
			}
			index.push(i);
		}
		return res;
	}

}
