package com.glovo.interview.arrays;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class HourGlass {

	public int hourglassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
				                 + arr.get(i + 1).get(j + 1)
				                 + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

				maxSum = Math.max(maxSum, currentSum);
			}
		}
		return maxSum;
	}

	static int hgSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
				          + arr[i + 1][j + 1] +
				          arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

	static int[] traverse(int[][] arr) {
		int[] res = new int[arr.length];
		int row = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				row += arr[i][j];
			}
			res[index++] = row;
		}


//		for (int [] outer: arr) {
//			int row = 0;
//			for (int inner: outer) {
//				row += inner;
//			}
//			resf.add(row);
//		}

		System.out.println(findMax(res));
		return res;
	}

	static int findMax(int[] arr) {
		int max = arr[0];
		for (int n : arr) {
			if (n > max) {
				max = n;
			}
		}
		return max;
	}

}
