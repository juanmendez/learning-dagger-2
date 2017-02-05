package info.juanmendez.lean.dagger2.server;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.component.RequestRouter;

/**
 * Created by musta on 2/4/2017.
 */
@Module
public class ServerModule {

    public ServerModule(){
        System.out.print( "hello");
    }

    @Provides
    public RequestRouter providesRequestRouter(){
        return new RequestRouter();
    }
}
