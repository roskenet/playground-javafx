package de.felixroske.jfx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import de.felixroske.jfx.support.AbstractFxmlView;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Component
public class ViewCollection {

	private Stage stage;
	private Scene scene;
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	@Autowired 
	@Qualifier("main")
	private AbstractFxmlView mainView;

	@Autowired
	@Qualifier("test")
	private AbstractFxmlView testView;

	public AbstractFxmlView getMainView() {
		return mainView;
	}

	public AbstractFxmlView getTestView() {
		return testView;
	}
	
	public void showTestView() {
		scene.setRoot(testView.getView());
//		stage.setScene(new Scene(testView.getView()));
	}
	
	
}
