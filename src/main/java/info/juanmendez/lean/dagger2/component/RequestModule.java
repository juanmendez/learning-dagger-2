package info.juanmendez.lean.dagger2.component;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.component.models.RequestHandler;

/**
 * Created by musta on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule(){

    }

    @Provides
    public RequestHandler requestHandler(){
        return new RequestHandler();
    }
}
