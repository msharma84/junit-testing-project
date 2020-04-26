package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("JUnit 5 Simple parameterized test")
public class JUnit5SimpleParameterizedTest {
	
	@DisplayName("Parameter passing with @ValueSource annotation")
	@ParameterizedTest
	@ValueSource(strings= {"Hello","World"})
	public void simpleTest(String message) {
		assertNotNull(message);
	}

}
