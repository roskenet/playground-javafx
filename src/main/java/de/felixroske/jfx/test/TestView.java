package de.felixroske.jfx.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import de.felixroske.jfx.support.AbstractFxmlView;

@Component
@Qualifier("test")
public class TestView extends AbstractFxmlView {

}
