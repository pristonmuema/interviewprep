package com.glovo.interview.arrays;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class HourGlassTest {

	@Inject
	HourGlass hourGlass;

	@ParameterizedTest
	@MethodSource("hourglass")
	void hourglassSum(List<List<Integer>> arr) {
		var results = hourGlass.hourglassSum(arr);
		assertEquals(19, results);
	}

	private static Stream<Arguments> hourglass() {
		return Stream.of(Arguments.arguments(
				List.of(
						List.of(1, 1, 1, 0, 0, 0),
						List.of(0, 1, 0, 0, 0, 0),
						List.of(1, 1, 1, 0, 0, 0),
						List.of(0, 0, 2, 4, 4, 0),
						List.of(0, 0, 0, 2, 0, 0),
						List.of(0, 0, 1, 2, 4, 0)
				       )
		                                    ));
	}
}