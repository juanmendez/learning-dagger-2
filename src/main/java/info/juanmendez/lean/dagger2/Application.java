package info.juanmendez.lean.dagger2;

import info.juanmendez.lean.dagger2.server.DaggerServerComponent;
import info.juanmendez.lean.dagger2.server.ServerComponent;
import info.juanmendez.lean.dagger2.server.ServerModule;
import info.juanmendez.lean.dagger2.ui.MainView;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class Application {

    public static ServerComponent serverComponent;

    public static void main( String[] args ){

        /**
         * previously after builder() I was including serverModule( new ServerModule())
         * but that step is not required. Although I think is a good thing to have
         * when passing arguments to the module.
         */
        serverComponent = DaggerServerComponent.builder().build();

        new MainView();
    }
}