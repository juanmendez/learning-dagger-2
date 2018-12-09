package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;
import info.juanmendez.lean.dagger2.component.RequestRouter;
import info.juanmendez.lean.dagger2.server.Database;
import info.juanmendez.lean.dagger2.server.RequestInjector;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class MainView {
    @Inject
    RequestRouter requestRouter;

    @Inject
    Database database;

    public MainView(){

        RequestInjector injector = Application.serverComponent.requestInjector();
        RequestComponent requestComponent = injector.createComponent(new RequestModule());
        requestComponent.inject( this );

        if( database.connect() ){
            requestRouter.request( "login");
            requestRouter.displayPage();
        }
    }
}
