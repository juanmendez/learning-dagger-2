package info.juanmendez.lean.dagger2.server;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.Database;
import info.juanmendez.lean.dagger2.component.RequestComponent;

/**
 * Created by musta on 2/4/2017.
 */
@Module(subcomponents = {RequestComponent.class})
public class ServerModule {

    public ServerModule(){
    }

    @RootScope
    @Provides
    public Database providesDatabase(){
        return new Database() {
            public boolean connect() {
                return true;
            }

            public String[] getUsers() {
                return new String[]{"Mary", "John", "Peter", "Paul", "David", "Joseph", "Moses"};
            }
        };
    }

    /**
     * There is an error if there is no binding without a qualifier.
     * So I made this one out.
     * @return
     */
    @Provides
    public Database providesServerDatabase(){
        return new Database() {
            public boolean connect() {
                return false;
            }

            public String[] getUsers() {
                return new String[]{};
            }
        };
    }
}
