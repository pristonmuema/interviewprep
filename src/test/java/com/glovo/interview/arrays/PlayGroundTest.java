package com.glovo.interview.arrays;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayGroundTest {

	@Test
	void reverseArray() {
		var res = PlayGround.reverseArray(new int[]{1, 2, 3, 4});
		assertEquals(Arrays.toString(new int[]{4, 3, 2, 1}), Arrays.toString(res));
	}

	@Test
	void countUniqueElements() {
		var res = PlayGround.countUniqueElements(new int[]{1, 3, 2, 5, 6, 1, 3});
		assertEquals(4, res);
	}

	@Test
	void testWhileLoop() {
		PlayGround.testWhileLoop();
	}

	@Test
	void arrayManipulation() {
		var res = PlayGround.arrayManipulation(new int[]{4, 0, 1, -2, 3});
		System.out.println(Arrays.toString(res));
	}

	@Test
	void stringPattern() {
		var res = PlayGround.stringPattern("codesignal", "101");
		assertEquals(4, res);
	}
}