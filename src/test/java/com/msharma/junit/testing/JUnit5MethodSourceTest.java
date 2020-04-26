package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("JUnit 5 method return as a source for test")
public class JUnit5MethodSourceTest {
	
	@DisplayName("get method argument")
	@ParameterizedTest(name="Test Run : {index} => a={0},b={1},sum={2}")
	@MethodSource("sumProvider")
	public void methodSource(int a, int b, int sum) {
		Calculator calc = new Calculator();
		assertEquals(sum, calc.add(a, b));
	}
	
	private static Stream<Arguments> sumProvider(){
		return Stream.of(
				Arguments.of(1,1,2),
				Arguments.of(25,25,50)
		);
	}
}