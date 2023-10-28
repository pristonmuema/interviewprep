package com.glovo.interview.arrays.slidingWindow;

public class MaxSubSetSum {

	static int maxSubSetSum(int[] arr) {
		int length = arr.length;
		if (length == 0) {
			return 0;
		}
		if (length == 1) {
			return arr[0];
		}
		arr[0] = Math.max(0, arr[0]);
		arr[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < length ; i++) {
			arr[i] = Math.max(arr[i - 1], arr[i] + arr[i-2]);
		}
		return arr[length-1];
	}

}
