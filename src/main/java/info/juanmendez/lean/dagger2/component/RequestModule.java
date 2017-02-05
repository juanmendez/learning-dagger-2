package info.juanmendez.lean.dagger2.component;

import dagger.Module;
import dagger.Provides;

/**
 * Created by musta on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule(){
    }

    @Provides
    public RequestRouter provideRequestRouter(){
        return new RequestRouter();
    }
}
