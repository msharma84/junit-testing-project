package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Timeout Assertions")
public class JUnit5TimeoutAssertion {

	@DisplayName("Should return the correct message before timeout is exceeded")
	@Test
	void shouldRunBeforeTimeout() {
		final String message = assertTimeout(Duration.ofMillis(50),
			() ->{
				Thread.sleep(20);
				return "Hello World";
			});
		assertEquals(message, "Hello World");
		}
	
	 @Test
	 @DisplayName("Should return the correct message before timeout is exceeded")
	 void shouldReturnCorrectMessageBeforeTimeoutIsExceeded() {
	       final String message = assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
	            Thread.sleep(20);
	            return "Hello World!";
	        });
	        assertEquals("Hello World!", message);
	    }
}