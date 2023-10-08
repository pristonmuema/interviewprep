package com.glovo.interview.arrays.slidingWindow;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class MinSubArrayTest {

	@Inject
	MinSubArray minSubArray;

	@ParameterizedTest
	@MethodSource("minParameters")
	void minSubArrayLen(int target, int[] nums) {
		var results = minSubArray.minSubArrayLen(target, nums);
		assertEquals(2, results);
	}

	private static Stream<Arguments> minParameters() {
		return Stream.of(
				Arguments.arguments(7, new int[]{2, 3, 1, 2, 4, 3}),
				Arguments.arguments(5, new int[]{1,4,4})
		                );
	}
}