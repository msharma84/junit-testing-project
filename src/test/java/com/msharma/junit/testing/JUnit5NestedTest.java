package com.msharma.junit.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit5 Nested Test example")
public class JUnit5NestedTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all test method...");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each test method...");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each test method...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After all test method...");
	}
	
	@DisplayName("Nested Class")
	@Nested
	class nested {
		
		@BeforeEach
		void beforeEach() {
			System.out.println("Before each test method in nested class...");
		}
		
		@AfterEach
		void afterEach() {
			System.out.println("After each test method in nested class...");
		}

		@Test
		@DisplayName("Test One")
		void sampleTestOne() {
			System.out.println("Sample Test One Case...");
		}
		
		@DisplayName("Inner Nested Class")
		@Nested
		class innerNested{
			
			@BeforeEach
			void beforeEach() {
				System.out.println("Before each test method in inner nested class...");
			}
			
			@AfterEach
			void afterEach() {
				System.out.println("After each test method in inner nested class...");
			}

			@Test
			@DisplayName("Test Two")
			void sampleTestTwo() {
				System.out.println("Sample Test Two Case...");
			}
		}
	}
}

/**
 * Output of the example
 * 
	Before all test method...
	Before each test method...
	Before each test method in nested class...
	Sample Test One Case...
	After each test method in nested class...
	After each test method...
	Before each test method...
	Before each test method in nested class...
	Before each test method in inner nested class...
	Sample Test Two Case...
	After each test method in inner nested class...
	After each test method in nested class...
	After each test method...
	After all test method...
*
**/
