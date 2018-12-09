package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.request.RequestComponent;
import info.juanmendez.lean.dagger2.request.RequestModule;
import info.juanmendez.lean.dagger2.request.RequestRouter;
import info.juanmendez.lean.dagger2.server.Database;
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

    @Inject
    Orm nonScopedOrm;

    public MainView(){

        RequestComponent requestComponent = Application.serverComponent.requestBuilder().requestModule(new RequestModule()).build();
        requestComponent.inject( this );

        if( Arrays.asList(rootOrm.getTable(Database.ADMINS)).indexOf("Mary") >= 0 ){
            requestRouter.request( "login");
            requestRouter.displayPage();
        }

        if(nonScopedOrm.getTable(Database.ADMINS).length == 0) {
            System.out.println("nonscoped-orm is empty");
        } else {
            System.out.println("nonscoped-orm is not empty");
        }
    }
}
