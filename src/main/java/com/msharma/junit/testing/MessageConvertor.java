package com.msharma.junit.testing;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class MessageConvertor implements ArgumentConverter {

	@Override
	public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
		checkSource(source);
		
		String stringSource = (String)source;
		return new Message(stringSource);
	}
	
	private void checkSource(Object source) {
		
		if(source == null) {
			throw new ArgumentConversionException("Cannot convert null source object");
		}
		
		if(!source.getClass().equals(String.class)) {
			throw new ArgumentConversionException("Cannot convert non string source object");
		}
		
		String stringSource = (String)source;
		if(stringSource.trim().isEmpty()) {
			throw new ArgumentConversionException("Cannot convert empty string source object");
		}
		
	}

}
