package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.request.RequestComponent;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {


    /**
     * In this case ServerModule is declaring who is its subcomponent.
     * ServerComponent is not aware of such inheritance. But in order
     * to share dependencies indirectly with child module then they
     * must be declared such as the case of providesDatabase
     */
    RequestComponent.Builder requestComponent();
    Database provideDatabase();
}