package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.msharma.junit.extension.SkipOnFailuresInEnclosingClass;
import com.msharma.junit.extension.SkipOnFailuresInEnclosingClassExtension;

@DisplayName("Nested Exception Test")
@ExtendWith(SkipOnFailuresInEnclosingClassExtension.class)
public class JUnit5NestedExceptionTest {
	
	@Test
	@DisplayName("Test One")
	void sampleTestOne() {
		System.out.println("Sample Test One Case...");
	}
	
	@Test
	@DisplayName("Test Two")
	void sampleTestTwo() {
		System.out.println("Fail case...");
		//fail();
	}
	
	@DisplayName("Nested Class One")
	@Nested
	class NestedOne{
		
		@Test
		@DisplayName("Nested Class Test One")
		void sampleTestOne() {
			System.out.println("Sample Test One Case in nested class...");
		}
	}
	
	@DisplayName("Nested Class Two")
	@Nested
	@SkipOnFailuresInEnclosingClass
	class NestedTwo{
		
		@Test
		@DisplayName("Nested Class Test One")
		void sampleTestOne() {
			System.out.println("Sample Test One Case in nested class which contains annotation to skip failures...");
		}
	}
}
