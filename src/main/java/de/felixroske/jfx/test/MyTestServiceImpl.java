package de.felixroske.jfx.test;

import org.springframework.stereotype.Component;

import de.felixroske.jfx.main.MainModel;

@Component
public class MyTestServiceImpl implements MyTestService {
	
	@Override
	public String magicMethod(String input) {
		return input.toUpperCase();
	}

	@Override
	public String magicMethod(MainModel mainModel) {
		System.out.println("Im MainModel steht nun: ");
		System.out.println(mainModel.getTestTextField().getValue());
		return null;
	}
}
