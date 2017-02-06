package info.juanmendez.lean.dagger2.server;

        import dagger.Module;
        import dagger.Provides;
        import info.juanmendez.lean.dagger2.component.RequestComponent;
        import info.juanmendez.lean.dagger2.component.RequestModule;
        import info.juanmendez.lean.dagger2.component.RequestRouter;

        import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module(subcomponents = {RequestComponent.class})
public class ServerModule {

    public ServerModule(){
    }

    @Singleton
    @Provides
    public Database providesDatabase(){
        return new Database();
    }
}
