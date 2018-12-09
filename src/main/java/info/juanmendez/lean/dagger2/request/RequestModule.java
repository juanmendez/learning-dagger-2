package info.juanmendez.lean.dagger2.request;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.server.Database;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule(){
    }

    @ChildScope
    @Provides
    public Orm providesDatabase(Database database){
        return new ChildOrm(database);
    }
}
