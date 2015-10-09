package de.felixroske.jfx.test;

import de.felixroske.jfx.main.MainModel;

public interface MyTestService {

	String magicMethod(String input);
	
	String magicMethod(MainModel mainModel);
}
