package com.glovo.interview.arrays.twopointers;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PalindromicSubStringTest {

	@Inject
	PalindromicSubString palindromicSubString;

	@ParameterizedTest
	@ValueSource(strings = {"aabaa"})
	void countSubstrings(String value) {
		var results = palindromicSubString.countSubstrings(value);
		assertEquals(9, results);
	}

	@ParameterizedTest
	@MethodSource("checkingParameters")
	void checking(String value, int left, int right) {
		var results = palindromicSubString.checking(value, left, right);
		assertEquals(1, results);
	}

	private static Stream<Arguments> checkingParameters() {
		return Stream.of(Arguments.arguments("aabaa", 0, 1));
	}
}