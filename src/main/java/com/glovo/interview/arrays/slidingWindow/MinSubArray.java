package com.glovo.interview.arrays.slidingWindow;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MinSubArray {

	//	Time complexity:
//	O(n) n= nums.length
//
//	Space complexity:
//	O(1)
	public int minSubArrayLen(int target, int[] nums) {
		int sum = 0;
		int j = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= target) {
				min = Math.min(min, i - j + 1);
				sum -= nums[j++];
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;

	}


}
