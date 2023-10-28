package com.glovo.interview.arrays;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@QuarkusTest
class TwoSumArrayTest {

	@Inject
	TwoSumArray sum;

	@Test
	void testWhenListIsProvided() {
		var results = sum.sumList(List.of(6, 8, 0, 8, 5), 16);
		assertEquals(List.of(1,3), results);
		System.out.println(results);
	}

	@Test
	void testWhenNoListIsProvided() {
		var results = sum.sumList(List.of(), 9);
		assertEquals(List.of(), results);
	}

	@Test
	void testWhenSumArrayReceivedLoadedList() {
		var results = sum.sumArray(new int[]{2,8,0,4,5}, 9);
		assertEquals(3, results[0]);
	}

	@Test
	void testWhenSumArrayReceivedUnLoadedList() {
		var results = sum.sumArray(new int[]{}, 7);
		assertEquals(0, results.length);
	}
}