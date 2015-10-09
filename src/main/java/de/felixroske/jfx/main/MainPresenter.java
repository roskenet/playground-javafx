package de.felixroske.jfx.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.felixroske.jfx.test.MyTestService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

@Component
public class MainPresenter {

	@Autowired
	private MyTestService testService;
	
	@FXML
	private TextField testTextField;
	
	@FXML
	private Button myButton;
	
	@FXML
	public void myButtonClicked(){
		System.out.println(testService.magicMethod(testTextField.getText()));
	}
}
