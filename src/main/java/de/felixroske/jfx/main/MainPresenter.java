package de.felixroske.jfx.main;

import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

@Component
public class MainPresenter {

	@FXML
	private TextField testTextField;
	
	@FXML
	private Button myButton;
	
	@FXML
	public void myButtonClicked(){
		System.out.println("Button clicked! Im TextFeld steht: " + testTextField.getText());
	}
}
