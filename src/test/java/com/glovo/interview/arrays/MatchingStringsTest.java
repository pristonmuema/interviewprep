package com.glovo.interview.arrays;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingStringsTest {

	@Test
	void matchingStrings() {
		var results = MatchingStrings.matchingStrings(List.of("ab", "axd", "ab", "vd").toArray(new String[0]),
		                                List.of("cd", "ab", "vd").toArray(new String[0]));
		assertEquals(Arrays.toString(results), Arrays.toString(List.of(0, 2, 1).toArray()));
	}
}