package com.glovo.interview.arrays;

public class BruteForce {

	static String[] fruits = {"Banana", "Orange", "Melon", "Lemon", "Hoho"};
	static int[] weights = {2, 5, 3, 4, 8};
	static int[] profits = {6, 5, 8, 9, 7};

	static int maxProfitBelowFiveWeights() {
		int length = fruits.length;
		int bestProfit = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int totalWeight = weights[i] + weights[j];
				int totalProfit = profits[i] + profits[j];
				System.out.println(
						fruits[i] + "\t " + fruits[j] + "\t" + totalWeight + " \t" + totalProfit);
				if (totalProfit > bestProfit && (totalWeight <=5)) {
					bestProfit = totalProfit;
				}
			}
		}
		return bestProfit;
	}

}
