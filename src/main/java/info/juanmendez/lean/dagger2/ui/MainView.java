package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;

/**
 * Created by musta on 2/4/2017.
 */
public class MainView {

    public MainView(){
        Application.myComponent.requestRouter();
    }
}
