package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Exception handling")
public class JUnit5ExpectedException {

	 @Test
	 @DisplayName("Should throw the correct exception")
	 public void shouldThrowCorrectException() {
		 
		 assertThrows(NullPointerException.class, () -> {
			 throw new NullPointerException();
		 });
	 }
	 
	 @Test
	 @DisplayName("Should not throw an exception")
	 public void shouldNotThrowException() {
	        assertDoesNotThrow(() -> {});
	 }
}
