package com.msharma.junit.testing;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@DisplayName("JUnit 5 Timeout annotation")
public class JUnit5Timeout {

	@BeforeEach
	@Timeout(5)
	public void setup() {
		// fails if execution time exceeds 5 seconds
	}
	
	@Test
	@Timeout(value=100,unit=TimeUnit.MILLISECONDS)
	void failsIfExecutionTimeExceeds100Millisec() throws InterruptedException {
		// fails if execution time exceedds 100 milli seconds
		
		Thread.sleep(500);
	}
}
