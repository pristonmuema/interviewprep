package com.glovo.interview.stack;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
@QuarkusTest
class ValidParenthesesTest {

	@Inject
	ValidParentheses validParentheses;

	@ParameterizedTest
	@ValueSource(strings = {"()[]{}", "()"})
	void isValidParentheses_ShouldReturnTrueWhenAValidStringIsPassed(String s) {
		var results = validParentheses.isValidParenthesesDeque(s);
		assertTrue(results);
	}

	@ParameterizedTest
	@ValueSource(strings = {"{]", "wr", "({[)}]"})
	void isValidParentheses_ShouldReturnFalseWhenANonValidStringIsPassed(String s) {
		var results = validParentheses.isValidParentheses(s);
		assertFalse(results);
	}

	@ParameterizedTest
	@NullAndEmptySource
	void isValidParentheses_ShouldReturnFalseWhenANullOrEmptyStringIsPassed(String s) {
		var results = validParentheses.isValidParentheses(s);
		assertFalse(results);
	}

}