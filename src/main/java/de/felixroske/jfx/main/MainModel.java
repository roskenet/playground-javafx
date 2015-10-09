package de.felixroske.jfx.main;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MainModel {

	private StringProperty testTextField = new SimpleStringProperty();

	public StringProperty getTestTextField() {
		return testTextField;
	}

	public void setTestTextField(StringProperty testTextField) {
		this.testTextField = testTextField;
	}
	
	public void reset() {
		testTextField.set("");
	}
	
	
}
