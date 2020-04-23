package com.msharma.junit.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Junit5 Ordering of the Test based on scenario")
//@TestMethodOrder(Alphanumeric.class)
@TestMethodOrder(OrderAnnotation.class)
public class JUnit5OrderedTest {
	
	@Test
	@Order(2)
	@DisplayName("Test One")
	public void testOne() {
		System.out.println("Test One...");
	}
	
	@Test
	@Order(1)
	@DisplayName("Test Two")
	public void testTwo() {
		System.out.println("Test Two...");
	}

}
