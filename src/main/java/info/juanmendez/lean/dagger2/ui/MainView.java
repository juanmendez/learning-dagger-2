package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;

import javax.inject.Inject;

/**
 * Created by musta on 2/4/2017.
 */
public class MainView {

    @Inject
    public MainView(){
        Application.myComponent.inject(this);
    }
}
