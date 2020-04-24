package com.msharma.junit.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("JUnit 5 Repeated Test")
public class JUnit5RepeatedTest {
	
	@DisplayName("Addition of Two Numbers")
	@RepeatedTest(5)
	public void testAdd() {
		Calculator calc = new Calculator();
		Assertions.assertEquals(2, calc.add(1, 1),"1 + 1 ie equal to 2");
	}
}
