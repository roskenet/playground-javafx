package de.felixroske.jfx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import de.felixroske.jfx.main.MainView;
import de.felixroske.jfx.support.AbstractJavaFxApplicationSupport;

@Lazy
@SpringBootApplication
public class PlaygroundJavafxApplication extends AbstractJavaFxApplicationSupport{

	@Value("${app.ui.title:Example App}")
	private String windowTitle;

	public static void main(String[] args) {
		launchApp(PlaygroundJavafxApplication.class, MainView.class, args);
	}
}
