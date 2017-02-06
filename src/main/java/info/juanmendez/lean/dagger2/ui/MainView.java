package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;
import info.juanmendez.lean.dagger2.component.RequestRouter;
import info.juanmendez.lean.dagger2.server.RootScope;

import javax.inject.Inject;
import java.util.Arrays;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class MainView {
    @Inject
    RequestRouter requestRouter;

    @Inject
    @RootScope
    Orm rootOrm;

    public MainView(){

        RequestComponent requestComponent = Application.serverComponent.requestBuilder().requestModule(new RequestModule()).build();
        requestComponent.inject( this );

        if( Arrays.asList(rootOrm.getTable("admins")).indexOf("Mary") >= 0 ){
            requestRouter.request( "login");
            requestRouter.displayPage();
        }
    }
}
