package de.felixroske.jfx.main;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.felixroske.jfx.PlaygroundJavafxApplication;
import de.felixroske.jfx.test.MyTestService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

@Component
public class MainPresenter implements Initializable{

	@Autowired
	private MyTestService testService;

	@Autowired
	private PlaygroundJavafxApplication application;
	
	@FXML
	private TextField testTextField;
	
	private MainModel mainModel = new MainModel();
	
	@FXML
	public void myButtonClicked(){
		System.out.println(testService.magicMethod(testTextField.getText()));
		testService.magicMethod(mainModel);
	}

	@FXML
	public void reset() {
		mainModel.reset();
		application.showTestView();
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		testTextField.textProperty().bindBidirectional(mainModel.getTestTextField());
	}
}
