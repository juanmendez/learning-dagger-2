package info.juanmendez.lean.dagger2.server;

import dagger.Module;
import info.juanmendez.lean.dagger2.component.RequestComponent;

/**
 * Created by musta on 2/4/2017.
 */
@Module(subcomponents = {RequestComponent.class})
public class ServerModule {

    public ServerModule(){

    }
}
