package info.juanmendez.lean.dagger2.server.database;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DatabaseModule {

    public DatabaseModule() {
    }

    @Singleton
    @Provides
    public Database providesDatabase() {
        return new Database();
    }
}
