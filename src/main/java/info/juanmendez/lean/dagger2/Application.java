package info.juanmendez.lean.dagger2;

import info.juanmendez.lean.dagger2.server.DaggerServerComponent;
import info.juanmendez.lean.dagger2.server.ServerComponent;
import info.juanmendez.lean.dagger2.server.ServerModule;
import info.juanmendez.lean.dagger2.server.database.DatabaseModule;
import info.juanmendez.lean.dagger2.server.database.DatabaseType;
import info.juanmendez.lean.dagger2.ui.MainView;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class Application {

    public static ServerComponent serverComponent;

    public static void main(String[] args) {
        serverComponent = DaggerServerComponent
                .builder()
                .addServerModule(new ServerModule())
                .addDatabaseModule(new DatabaseModule())
                .setDatabaseType(new DatabaseType("bindsInstanceDataType"))
                .build();

        new MainView();
    }
}
