package com.glovo.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BruteForceTest {

	@Test
	void maxProfitBelowFiveWeights() {
		var res = BruteForce.maxProfitBelowFiveWeights();
		assertEquals(14, res);
	}
}