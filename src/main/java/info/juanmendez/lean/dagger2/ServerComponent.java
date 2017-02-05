package info.juanmendez.lean.dagger2;

import dagger.Component;

import javax.inject.Singleton;
import java.util.Set;

/**
 * Created by musta on 2/4/2017.
 */
@Singleton
@Component(modules = {ServerModule.class, RequestModule.class})
public interface ServerComponent {

    Set<String> strings();

    void inject( MainView mainView );
}
