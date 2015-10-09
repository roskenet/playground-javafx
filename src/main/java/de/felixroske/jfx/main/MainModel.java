package de.felixroske.jfx.main;

import javafx.beans.property.SimpleStringProperty;

public class MainModel {

	private SimpleStringProperty testTextField;

	public SimpleStringProperty getTestTextField() {
		return testTextField;
	}

	public void setTestTextField(SimpleStringProperty testTextField) {
		this.testTextField = testTextField;
	}
	
	
}
