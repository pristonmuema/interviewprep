package com.glovo.interview.arrays.slidingWindow;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class LongestLengthTest {

	@Inject
	LongestLength longestLength;


	@ParameterizedTest
	@ValueSource(strings = {"ghfdhrurncddercg", "pwwkew", "a"})
	void lengthOfLongestSubstring(String value) {
		var results = longestLength.lengthOfLongestSubstring(value);
		assertNotNull(results);
	}


	@ParameterizedTest
	@EmptySource
	void lengthOfLongestSubstring_ShouldReturn_Zero_WhenStringIsEmpty(String value) {
		var results = longestLength.lengthOfLongestSubstring(value);
		assertEquals(0, results);
	}

	@ParameterizedTest
	@NullSource
	void lengthOfLongestSubstringWhenStringIsNull(String value) {
		var results = longestLength.lengthOfLongestSubstring(value);
		assertEquals(0, results);
	}

	@ParameterizedTest
	@NullAndEmptySource
	void lengthOfLongestSubstringWhenStringIsNullAndEmpty(String value) {
		var results = longestLength.lengthOfLongestSubstring(value);
		assertEquals(0, results);
	}
}