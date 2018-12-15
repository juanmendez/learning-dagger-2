package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.request.RequestComponent;
import info.juanmendez.lean.dagger2.request.RequestModule;
import info.juanmendez.lean.dagger2.request.RequestRouter;
import info.juanmendez.lean.dagger2.server.ServerComponent;
import info.juanmendez.lean.dagger2.server.database.Database;
import info.juanmendez.lean.dagger2.server.database.DatabaseType;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class MainView {
    @Inject
    RequestRouter requestRouter;

    @Inject
    Database database;

    @Inject
    DatabaseType databaseType;

    public MainView() {
        ServerComponent serverComponent = Application.serverComponent;
        RequestComponent requestComponent = serverComponent.newRequestModule(new RequestModule());
        requestComponent.inject(this);

        if (database.connect()) {
            requestRouter.request("login");
            requestRouter.displayPage();
            requestRouter.displayDatabaseType();
        }

        System.out.println( "database type " + databaseType.getDatabaseName());
    }
}
