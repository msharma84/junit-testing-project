package com.msharma.junit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMessageBuilder {
	
	@Test
	public void testNameMsharma() {
		
		MessageBuilder mBuilder = new MessageBuilder();
		String result = mBuilder.getMessage("Msharma");
		
		assertEquals("Hello Msharma", result);
	}
	
	@Test
	public void testNameEmpty() {
		
		MessageBuilder mBuilder = new MessageBuilder();
		String result = mBuilder.getMessage(" ");
		
		assertEquals("Please provide name", result);
	}
	
	@Test
	public void testNameNull() {
		
		MessageBuilder mBuilder = new MessageBuilder();
		String result = mBuilder.getMessage(null);
		
		assertEquals("Please provide name", result);
	}
}
