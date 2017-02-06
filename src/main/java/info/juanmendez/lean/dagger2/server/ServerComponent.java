package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.component.RequestComponent;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {


    /**
     * make available to submodules
     */
    RequestComponent.Builder requestBuilder();
    Database providesDatabase();
}
