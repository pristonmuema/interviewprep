package com.glovo.interview;

import com.glovo.interview.sumtwo.MapsPlayground;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class MapsPlaygroundTest {

	@Inject
	MapsPlayground mapsPlayground;
	@Test
	void twoSum() {
		var results = mapsPlayground.twoSum(new int[]{2,3,1,2,4,3}, 7);
		assertEquals(2, results.length);
	}
}