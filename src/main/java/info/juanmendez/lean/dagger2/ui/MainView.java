package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;

/**
 * Created by musta on 2/4/2017.
 */
public class MainView {
    
    public MainView(){
        RequestComponent requestComponent = Application.myComponent.newRequestModule( new RequestModule() );
        requestComponent.inject( this );
    }
}
