package info.juanmendez.lean.dagger2.server;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.request.RequestComponent;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module(subcomponents = {RequestComponent.class})
public class ServerModule {

    public ServerModule() {
    }

    @RootScope
    @Provides
    public Orm providesRootOrm(Database database) {
        return new RootOrm(database);
    }

    @Provides
    public Orm providesNonScopedOrm() {
        return new Orm() {

            public String[] getTable(String tableName) {
                return new String[0];
            }
        };
    }
}
