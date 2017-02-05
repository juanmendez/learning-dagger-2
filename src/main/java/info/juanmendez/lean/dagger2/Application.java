package info.juanmendez.lean.dagger2;
import info.juanmendez.lean.dagger2.component.RequestModule;
import info.juanmendez.lean.dagger2.server.DaggerServerComponent;
import info.juanmendez.lean.dagger2.server.ServerComponent;
import info.juanmendez.lean.dagger2.server.ServerModule;

/**
 * Created by musta on 2/4/2017.
 */
public class Application {

    public static ServerComponent myComponent;

    public static void main( String[] args ){
        myComponent = DaggerServerComponent
                .builder()
                .requestModule(new RequestModule())
                .serverModule(new ServerModule()).build();

        new MainView();
    }
}
