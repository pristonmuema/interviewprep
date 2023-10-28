package com.glovo.interview.arrays;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class TwoSumMapsTest {

	@Inject
	TwoSumMaps twoSumMaps;
	@Test
	void twoSum() {
		var results = twoSumMaps.twoSum(new int[]{2, 3, 1, 2, 4, 3}, 7);
		assertEquals(2, results.length);
	}
}