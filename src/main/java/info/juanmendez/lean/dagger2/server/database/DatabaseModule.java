package info.juanmendez.lean.dagger2.server.database;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DatabaseModule {
    DatabaseType databaseType;

    public DatabaseModule(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    @Provides
    DatabaseType provideDatabaseType() {
        return databaseType;
    }

    @Singleton
    @Provides
    public Database providesDatabase() {
        return new Database();
    }
}
