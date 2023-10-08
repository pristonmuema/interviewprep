package com.glovo.interview.arrays;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
@QuarkusTest
class DailyTemperaturesTest {

	@Inject
	DailyTemperatures dailyTemperatures;
	@Test
	void dailyTemperatures() {
		var results = dailyTemperatures.dailyTemperatures(new int[]{30,40,50,60});
		assertEquals(Arrays.toString(new int[]{1,1,1,0}), Arrays.toString(results));
	}
}