package com.glovo.interview.strings;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
class PalindromeTest {

	@Inject
	Palindrome palindrome;

	@ParameterizedTest
	@ValueSource(strings = {"A man, a plan, a canal: Panama", "a!", " "})
	void isPalindrome_ShouldReturnTrueWhenAValidPalindromeIsPassed(String value) {
		var results = palindrome.isPalindrome(value);
		assertTrue(results);
	}

	@ParameterizedTest
	@ValueSource(strings = {"hso", "hud", "race a car"})
	void isPalindrome_ShouldReturnFalseWhenANonPalindromeValuesArePassed(String value) {
		var results = palindrome.isPalindrome(value);
		assertFalse(results);
	}

	@ParameterizedTest
	@NullSource
	void isPalindrome_ShouldReturnFalseWhenEmptyValueIsPassed(String value) {
		var results = palindrome.isPalindrome(value);
		assertFalse(results);
	}

}