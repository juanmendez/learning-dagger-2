package info.juanmendez.lean.dagger2.request;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.server.database.Database;
import info.juanmendez.lean.dagger2.server.database.DatabaseType;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule() {
    }

    @Provides
    public RequestRouter provideRequestRouter(Database database, DatabaseType databaseType) {
        return new RequestRouter(database, databaseType);
    }
}
