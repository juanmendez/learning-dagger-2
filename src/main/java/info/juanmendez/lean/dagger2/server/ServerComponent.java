package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.request.RequestComponent;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {

    /**
     * Allow to reach subcomponent builder
     */
    RequestComponent.Builder requestBuilder();

    /**
     * make available to submodules
     */

    Orm providesDatabase();

    /**
     * allow objects to inject
     */
    void inject(Application application );
}
