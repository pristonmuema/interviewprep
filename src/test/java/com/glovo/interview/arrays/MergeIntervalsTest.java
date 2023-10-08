package com.glovo.interview.arrays;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class MergeIntervalsTest {

	@Inject
	MergeIntervals mergeIntervals;

	@Test
	void merge() {
		var results = mergeIntervals.merge(new int[][]{{1, 4}, {4, 5}});

		assertEquals(Arrays.deepToString(new int[][]{{1, 5}}), Arrays.deepToString(results));
	}
}