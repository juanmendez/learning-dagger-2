package info.juanmendez.lean.dagger2.server;

import dagger.BindsInstance;
import dagger.Component;
import info.juanmendez.lean.dagger2.request.RequestComponent;
import info.juanmendez.lean.dagger2.request.RequestModule;
import info.juanmendez.lean.dagger2.server.database.DatabaseModule;
import info.juanmendez.lean.dagger2.server.database.DatabaseType;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class, DatabaseModule.class})
public interface ServerComponent {
    RequestComponent newRequestModule(RequestModule requestModule);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder setDatabaseType(DatabaseType databaseType);

        /**
         * In this exercise how you can customize your component builder
         * I found good information accessing Component.Builder
         */
        Builder addServerModule(ServerModule serverModule);

        Builder addDatabaseModule(DatabaseModule databaseModule);

        ServerComponent build();

    }
}
