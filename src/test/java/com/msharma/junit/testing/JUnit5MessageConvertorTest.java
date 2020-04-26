package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Pass converted Message objects to our test method")
public class JUnit5MessageConvertorTest {
	
	@DisplayName("Should pass same messages as method parameters")
	@ParameterizedTest(name="Test Run : {index} => actual={0},result={1}}")
	@CsvSource({
			"Hello,Hello",
			"World,World"
			})
	public void passMessage(@ConvertWith(MessageConvertor.class) Message actual,
			@ConvertWith(MessageConvertor.class) Message result) {
		assertEquals(result.getMessage() ,actual.getMessage());
	}
}
