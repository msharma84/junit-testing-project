package com.msharma.junit.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Pass the method parameters provided by the @ValueSource annotation")
public class JUnit5ValueSource {

	@DisplayName("Should pass a non-null message to our test method")
	@ParameterizedTest(name="{index} =>  message=''{0}''")
	@ValueSource(strings = {"Hello", "World"})
	public void nonNullMessage(String message) {
		assertNotNull(message);
	}
}
