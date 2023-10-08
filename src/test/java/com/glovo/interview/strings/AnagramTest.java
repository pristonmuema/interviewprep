package com.glovo.interview.strings;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
class AnagramTest {

	@Inject
	Anagram anagram;

	@DisplayName("Test for invalid anagrams")
	@ParameterizedTest(name = "When s value is \"{0}\" and t value is \"{1}\" the result is false")
	@MethodSource("isNullAndEmptyAnagramParameters")
	void isAnagram_ShouldReturnFalseWhenANullOrEmptyValueIsPassed(String s, String t) {
		var result = anagram.isAnagramUsingArray(s, t);
		assertFalse(result);
	}

	private static Stream<Arguments> isNullAndEmptyAnagramParameters() {
		return Stream.of(Arguments.arguments(" ", "car"),
		                 Arguments.arguments(null, null),
		                 Arguments.arguments("c", "car"),
		                 Arguments.arguments("rat", "car"));
	}

	@ParameterizedTest
	@MethodSource("sIsNotEqualTotParameters")
	void isAnagram_ShouldReturnFalseWhenTheTwoStringsAreNotEqualValueIsPassed(String s, String t) {
		var result = anagram.isAnagram(s, t);
		assertFalse(result);
	}

	private static Stream<Arguments> sIsNotEqualTotParameters() {
		return Stream.of(Arguments.arguments("c", "car"),
		                 Arguments.arguments("uyu", "yu"));
	}

	@DisplayName("Test for Valid Anagrams")
	@ParameterizedTest(name = "When s value is \"{0}\" and t value is \"{1}\" the result is true")
	@MethodSource("isTrueAnagramParameters")
	void isAnagram_ShouldReturnTrueWhenAValidAnagramValueIsPassed(String s, String t) {
		var result = anagram.isAnagramUsingArray(s, t);
		assertTrue(result);
	}

	private static Stream<Arguments> isTrueAnagramParameters() {
		return Stream.of(Arguments.arguments("anagram", "nagaram"));
	}

	@ParameterizedTest
	@MethodSource("isFalseAnagramParameters")
	void isAnagram_ShouldReturnFalseWhenANonValidAnagramValueIsPassed(String s, String t) {
		var result = anagram.isAnagram(s, t);
		assertFalse(result);
	}

	private static Stream<Arguments> isFalseAnagramParameters() {
		return Stream.of(Arguments.arguments("rat", "car"));
	}


}