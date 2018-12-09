package info.juanmendez.lean.dagger2.server;

import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
public class RequestInjector {

    Provider<RequestComponent.Builder> provider;

    /**
     * constructor must have an inject annotation in order
     * to be created and associated with its component
     *
     * @param provider Injection of an encapsulated builder through get()
     */
    @Inject
    public RequestInjector(Provider<RequestComponent.Builder> provider) {
        this.provider = provider;
    }

    public RequestComponent createComponent(RequestModule requestModule) {
        return provider.get().requestModule(requestModule).build();
    }
}