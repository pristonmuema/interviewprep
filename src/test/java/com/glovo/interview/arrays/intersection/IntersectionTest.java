package com.glovo.interview.arrays.intersection;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
class IntersectionTest {

	@Inject
	Intersection intersection;

	@ParameterizedTest
	@MethodSource("isIntersect")
	void isIntersect(List<Integer> list1, List<Integer> list2) {
		var results = intersection.isIntersect(list1, list2);
		assertTrue(results);
	}

	private static Stream<Arguments> isIntersect() {
		return Stream.of(Arguments.arguments(
				                 List.of(2, 4, 6, 7), List.of(3, 5, 6, 9)),
		                 Arguments.arguments(List.of(1, 7), List.of(3, 5, 7, 9))
		                );
	}

	@ParameterizedTest
	@MethodSource("isNotIntersect")
	void isNotIntersect(List<Integer> list1, List<Integer> list2) {
		var results = intersection.isIntersect(list1, list2);
		assertFalse(results);
	}

	private static Stream<Arguments> isNotIntersect() {
		return Stream.of(Arguments.arguments(List.of(2, 4, 0, 7), List.of(3, 5, 6, 9)),
		                 Arguments.arguments(List.of(1, 7), List.of(3, 5, 8, 9)),
		                 Arguments.arguments(List.of(), List.of(3, 5, 8, 9))
		                );
	}
}