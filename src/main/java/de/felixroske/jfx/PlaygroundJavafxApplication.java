package de.felixroske.jfx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import de.felixroske.jfx.main.MainView;
import de.felixroske.jfx.support.AbstractJavaFxApplicationSupport;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Lazy
@SpringBootApplication
public class PlaygroundJavafxApplication extends AbstractJavaFxApplicationSupport{

	/**
	 * Note that this is configured in application.properties
	 */
	@Value("${app.ui.title:Example App}")//
	private String windowTitle;

	@Autowired MainView mainView;

	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle(windowTitle);
		stage.setScene(new Scene(mainView.getView()));
		stage.setResizable(true);
		stage.centerOnScreen();
		stage.show();
	}

	public static void main(String[] args) {
		launchApp(PlaygroundJavafxApplication.class, args);
	}
}
