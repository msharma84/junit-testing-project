package com.msharma.junit.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	static Calculator calc = null;
	
	@BeforeAll
	public static void setUp(){
		 System.out.println("Setting up Calculator Object...");
		 calc = new Calculator();
	}
	
	@Test
	@DisplayName("Test Addition")
	public void addTest() {
		System.out.println("Adding two number...");
		Assertions.assertEquals(2, calc.add(1, 1)," 1 + 1 is equal to 2");
	}
	
	@Test
	@DisplayName("Test Multiplication")
	public void multiplyTest() {
		System.out.println("Multiply two number...");
		Assertions.assertEquals(4, calc.multiply(2, 2)," 2 * 2 is equal to 4");
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("Cleaning up Calculator Object...");
		calc = null;
	}
}