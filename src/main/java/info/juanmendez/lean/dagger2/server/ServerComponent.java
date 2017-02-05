package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;

import javax.inject.Singleton;

/**
 * Created by musta on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {
    RequestComponent newRequestModule(RequestModule requestModule);
}
