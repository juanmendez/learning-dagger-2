package info.juanmendez.lean.dagger2.server;

import dagger.Component;
import info.juanmendez.lean.dagger2.component.RequestRouter;
import info.juanmendez.lean.dagger2.ui.MainView;

import javax.inject.Singleton;

/**
 * Created by musta on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class})
public interface ServerComponent {
    RequestRouter requestRouter();
}
