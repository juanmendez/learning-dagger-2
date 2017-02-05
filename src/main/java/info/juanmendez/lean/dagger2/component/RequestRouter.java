package info.juanmendez.lean.dagger2.component;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

/**
 * Created by musta on 2/5/2017.
 */
@Singleton
public class RequestRouter {

    @Inject RequestRouter(
            Provider<RequestComponent.Builder> requestComponentProvider) {}
}
