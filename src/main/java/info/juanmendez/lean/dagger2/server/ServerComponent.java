package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.request.RequestComponent;
import info.juanmendez.lean.dagger2.request.RequestModule;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {
    RequestComponent newRequestModule(RequestModule requestModule);

    /**
     * make available to submodules
     */
    Database providesDatabase();
}
