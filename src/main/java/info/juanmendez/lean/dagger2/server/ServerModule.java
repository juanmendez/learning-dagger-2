package info.juanmendez.lean.dagger2.server;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.request.RequestComponent;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class ServerModule {

    public ServerModule(){
    }

    @Singleton
    @Provides
    public Database providesDatabase(){
        return new Database();
    }
}
