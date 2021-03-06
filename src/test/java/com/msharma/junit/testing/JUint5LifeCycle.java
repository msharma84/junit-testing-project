package com.msharma.junit.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Lifecycle")
public class JUint5LifeCycle {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all test method...");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each test method...");
	}
	
	@Test
	@DisplayName("Test One")
	void sampleTestOne() {
		System.out.println("Sample Test One Case...");
	}
	
	@Test
	@DisplayName("Test Two")
	void sampleTestTwo() {
		System.out.println("Sample Test Two Case...");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each test method...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After all test method...");
	}
}
