package com.glovo.interview.arrays.slidingWindow;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class MinMumSlidingWindowTest {

	@Inject
	MinMumSlidingWindow minMumSlidingWindow;

	@ParameterizedTest
	@MethodSource("minWindowParameters")
	void minWindow(String s, String t) {
		var results = minMumSlidingWindow.minWindow(s, t);
  assertNotNull(results);
	}

	private static Stream<Arguments> minWindowParameters() {
		return Stream.of(
				Arguments.arguments("ADOBECODEBANC", "ABC"),
				Arguments.arguments("a", "a"),
				Arguments.arguments("a", "aa"));
	}


}