package com.msharma.junit.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("After Each Test")
public class JUnit5AfterEach {

	@Test
	@DisplayName("Addition of Two Numbers")
	public void addNumber() {
		System.out.println("Adding two number...");
		Assertions.assertEquals(2, new Calculator().add(1, 1)," 1 + 1 is equal to 2");
	}
	
	@Test
	@DisplayName("Multiplication of Two Numbers")
	public void multiplyNumber() {
		System.out.println("Multiply two number...");
		Assertions.assertEquals(4, new Calculator().multiply(2, 2)," 2 * 2 is equal to 4");
	}
	
	@AfterEach
	public void afterEachMethod() {
		System.out.println("After each method...");
	}
}
