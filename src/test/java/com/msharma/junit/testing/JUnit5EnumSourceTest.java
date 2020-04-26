package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

@DisplayName("Pass enum values to our test method")
public class JUnit5EnumSourceTest {
	
	@DisplayName("Should pass non-null enum values as method parameters")
	@ParameterizedTest(name="{index} => cuisine=''{0}''")
	//@EnumSource(Food.class)
	@EnumSource(value=Food.class, names= {"THAI"})
	public void enumSource(Food food) {
		assertNotNull(food);
	}
}
