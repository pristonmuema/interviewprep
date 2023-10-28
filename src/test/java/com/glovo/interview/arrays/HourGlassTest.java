package com.glovo.interview.arrays;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class HourGlassTest {

	public static final int[][] TWO_D_ARRAY = new int[][] {{1, 1, 1, 0, 0, 0},
		{0, 1, 0, 0, 0, 0},
		{1, 1, 1, 0, 0, 0},
		{0, 0, 2, 4, 4, 0},
		{0, 0, 0, 2, 0, 0},
		{0, 0, 1, 2, 4, 0},};
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
				(Object) TWO_D_ARRAY
		                                    ));
	}

	@Test
	void hgSum() {
		var res = HourGlass.hgSum(TWO_D_ARRAY);
		assertEquals(19, res);
	}

	@Test
	void traverse() {
		var res = HourGlass.traverse(TWO_D_ARRAY);
		assertNotNull(res);
	}
}