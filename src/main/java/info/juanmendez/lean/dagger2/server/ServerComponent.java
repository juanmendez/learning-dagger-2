package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.Application;

import javax.inject.Singleton;

/**
 * Created by musta on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {

    /**
     * provide injectors to provide subcomponents
     */
    RequestInjector requestInjector();

    /**
     * make available to submodules
     */
    Database providesDatabase();

    /**
     * allow objects to inject
     */
    void inject(Application application );
}
