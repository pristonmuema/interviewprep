package com.glovo.interview.arrays.twopointers;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SortColors {
// Time Complexity
//	O(n)

	/**
	 * startIndex where we will put 0 endIndex where we will put 2
	 *
	 * @param nums the variable
	 */
	public void sortColors(int[] nums) {
		int startIndex = 0;
		int endIndex = nums.length - 1;
		int i = 0;
		while (i <= endIndex) {
			if (nums[i] == 0) {
				swap(nums, startIndex++, i++);
			} else if (nums[i] == 2) {
				swap(nums, endIndex--, i);
			} else {
				i++;
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
