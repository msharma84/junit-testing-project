package com.msharma.junit.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Disabled Test Case Scenario on Class")
@Disabled
public class JUnit5DisabledTestClass {
	
	@Test
	public void testOne() {
		System.out.println("Test One...");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two...");
	}
}
