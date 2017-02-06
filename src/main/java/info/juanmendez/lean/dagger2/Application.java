package info.juanmendez.lean.dagger2;

import info.juanmendez.lean.dagger2.server.DaggerServerComponent;
import info.juanmendez.lean.dagger2.server.ServerComponent;
import info.juanmendez.lean.dagger2.server.ServerModule;
import info.juanmendez.lean.dagger2.ui.MainView;

/**
 * Created by musta on 2/4/2017.
 */
public class Application {

    public static ServerComponent serverComponent;

    public static void main( String[] args ){
        serverComponent = DaggerServerComponent
                .builder()
                .serverModule(new ServerModule()).build();

        new MainView();
    }
}