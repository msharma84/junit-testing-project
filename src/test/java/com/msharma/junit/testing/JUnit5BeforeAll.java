package com.msharma.junit.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Before All Test")
public class JUnit5BeforeAll {

	@Test
	@DisplayName("Addition of Two Numbers")
	public void addNumber() {
		System.out.println("Adding two number...");
		Assertions.assertEquals(2, new Calculator().add(1, 1)," 1 + 1 is equal to 2");
	}
	
	@BeforeAll
	public static void setUp() {
		System.out.println("Initialize the Test Scenario...");
	}
}
