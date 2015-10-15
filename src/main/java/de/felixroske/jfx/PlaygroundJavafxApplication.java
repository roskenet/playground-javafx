package de.felixroske.jfx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import de.felixroske.jfx.support.AbstractJavaFxApplicationSupport;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Lazy
@SpringBootApplication
public class PlaygroundJavafxApplication extends AbstractJavaFxApplicationSupport{

	@Value("${app.ui.title:Example App}")
	private String windowTitle;

	@Autowired 
	private ViewCollection views;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Scene scene = new Scene(views.getMainView().getView());
		views.setStage(stage);
		views.setScene(scene);
		
		stage.setTitle(windowTitle);
		stage.setScene(scene);
		stage.setResizable(true);
		stage.centerOnScreen();
		stage.show();
	}

	public void showTestView() {
		views.showTestView();
	}
	
	public void showMainView() {
		views.showMainView();
	}
	
	public static void main(String[] args) {
		launchApp(PlaygroundJavafxApplication.class, args);
	}
}
