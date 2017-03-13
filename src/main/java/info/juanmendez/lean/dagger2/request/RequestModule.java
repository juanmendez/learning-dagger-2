package info.juanmendez.lean.dagger2.request;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.server.Database;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule(){
    }

    @Provides
    public RequestRouter provideRequestRouter(Database database){
        return new RequestRouter(database);
    }
}
