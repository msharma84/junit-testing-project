package com.msharma.junit.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Disabled Test Case Scenario on methods")
public class JUnit5DisabledTest {
	
	@Test
	public void testOne() {
		System.out.println("Test One...");
	}
	
	@Test
	@Disabled
	public void testTwo() {
		System.out.println("Test Two...");
	}
}
