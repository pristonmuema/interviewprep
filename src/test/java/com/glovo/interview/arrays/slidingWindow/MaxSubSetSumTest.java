package com.glovo.interview.arrays.slidingWindow;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubSetSumTest {

	@Test
	void maxSubSetSum() {
		var res = MaxSubSetSum.maxSubSetSum(new int[]{3, 7, 4, 6, 5});
		assertEquals(13, res);
	}
}