package de.felixroske.jfx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import de.felixroske.jfx.support.AbstractFxmlView;
import de.felixroske.jfx.support.AbstractJavaFxApplicationSupport;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Lazy
@SpringBootApplication
public class PlaygroundJavafxApplication extends AbstractJavaFxApplicationSupport{

	@Value("${app.ui.title:Example App}")
	private String windowTitle;

	@Autowired 
	@Qualifier("main")
	private AbstractFxmlView mainView;

	@Autowired
	@Qualifier("test")
	private AbstractFxmlView testView;
	
	private Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		
		stage.setTitle(windowTitle);
		stage.setScene(new Scene(mainView.getView()));
		stage.setResizable(true);
		stage.centerOnScreen();
		stage.show();
	}

	public void showTestView(Stage stage) {
		stage.setScene(new Scene(testView.getView()));
	}
	
	public static void main(String[] args) {
		launchApp(PlaygroundJavafxApplication.class, args);
	}
}
