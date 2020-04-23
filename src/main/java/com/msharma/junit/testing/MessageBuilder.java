package com.msharma.junit.testing;

public class MessageBuilder {
	
	public String getMessage(String name) {
		
		StringBuilder result = new StringBuilder();
		
		if(name == null || name.trim().length() == 0) {
			result.append("Please provide name");
		}else {
			result.append("Hello "+name);
		}
		return result.toString();
	}
}
