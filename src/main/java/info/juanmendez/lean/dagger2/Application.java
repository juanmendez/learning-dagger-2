package info.juanmendez.lean.dagger2;

/**
 * Created by musta on 2/4/2017.
 */
public class Application {

    public static ServerComponent myComponent;

    public static void main( String[] args ){
        myComponent = DaggerMyComponent.builder().myModuleA(new ServerModule()).myModuleB(new RequestModule() ).build();
        new MainView();
    }
}
