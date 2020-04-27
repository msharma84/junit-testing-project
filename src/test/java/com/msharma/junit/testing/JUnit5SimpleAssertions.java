package com.msharma.junit.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Simple Assertion")
public class JUnit5SimpleAssertions {
	
	@DisplayName("For true condition")
	@Test
	public void shouldBeTrue() {
		System.out.println("Should be true...");
		assertTrue(true);
	}
	
	@DisplayName("For false condition")
	@Test
	public void shouldBeFalse() {
		System.out.println("Should be false...");
		assertFalse(false);
	}
	
	@DisplayName("For null condition")
	@Test
	public void forNull() {
		System.out.println("Should be null...");
		assertNull(null);
	}
	
	@DisplayName("For not null condition")
	@Test
	public void forNotNull() {
		System.out.println("Should be not null...");
		assertNotNull(new Object());
	}
	
	@DisplayName("For two objects are equals condition")
	@Test
	public void forEqualObject() {
		System.out.println("Objects should be equal...");
		
		final Integer firstInt = 5;
		final Integer secondInt = 5;
		assertEquals(firstInt,secondInt);
	}
	
	@DisplayName("For two objects are not equals condition")
	@Test
	public void forNotEqualObject() {
		System.out.println("Objects should be not equal...");
		
		final Integer firstInt = 5;
		final Integer secondInt = 9;
		assertNotEquals(firstInt,secondInt);
	}
	
	@DisplayName("For two objects are same condition")
	@Test
	public void forSameObject() {
		System.out.println("Objects should be same...");
		
		final Integer firstInt = 5;
		final Integer secondInt = firstInt;
		
		assertSame(firstInt,secondInt);
	}
	
	@DisplayName("For two objects are not same condition")
	@Test
	public void forNotSameObject() {
		System.out.println("Objects should not be same...");
		
		final Object firstObj = new Object();
		final Object secondObj = new Object();
		
		assertNotSame(firstObj,secondObj);
	}
	
	@DisplayName("For two arrays are same or not condition")
	@Test
	public void forArrays() {
		System.out.println("Arrays should be same...");
		
		final int [] firstObj = new int [] {1,2};
		final int [] secondObj = new int [] {1,2};
		
		assertArrayEquals(firstObj,secondObj);
	}
	
	@DisplayName("For Two Iterable are equal or not")
	@Test
	public void forIterable() {
		System.out.println("Iterable should be same...");
		
		final List<String> expected = Arrays.asList("ABC","XYZ");
		final List<String> actual = Arrays.asList("ABC","XYZ");
		assertIterableEquals(expected, actual);
	}
	
	
}