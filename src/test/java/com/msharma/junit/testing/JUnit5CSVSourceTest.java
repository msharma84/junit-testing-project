package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Getting the testing data from csv")
public class JUnit5CSVSourceTest {
	
	@DisplayName("testing using csv data")
	@ParameterizedTest(name="{index} => a= {0}, b= {1}, sum= {2}")
	@CsvSource({
		"1,1,2",
		"2,2,4"
	})
	public void csvTest(int a, int b, int sum) {
		Calculator calc = new Calculator();
		assertEquals(sum, calc.add(a, b));
	}
}
