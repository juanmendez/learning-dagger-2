package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;
import info.juanmendez.lean.dagger2.component.RequestRouter;

import javax.inject.Inject;

/**
 * Created by musta on 2/4/2017.
 */
public class MainView {
    @Inject
    RequestRouter requestRouter;

    public MainView(){
        RequestComponent requestComponent = Application.myComponent.newRequestModule( new RequestModule() );
        requestComponent.inject( this );

        System.out.println( requestRouter.request( "login") );
    }
}
