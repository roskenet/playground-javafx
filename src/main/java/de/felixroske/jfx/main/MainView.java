package de.felixroske.jfx.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import de.felixroske.jfx.support.AbstractFxmlView;
@Component
@Qualifier("main")
public class MainView extends AbstractFxmlView{

}
