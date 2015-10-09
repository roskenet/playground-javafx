package de.felixroske.jfx.test;

import org.springframework.stereotype.Component;

@Component
public class MyTestServiceImpl implements MyTestService {
	
	@Override
	public String magicMethod(String input) {
		return input.toUpperCase();
	}
}
