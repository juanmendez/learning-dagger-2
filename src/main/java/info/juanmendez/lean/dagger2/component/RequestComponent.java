package info.juanmendez.lean.dagger2.component;

import dagger.Subcomponent;
import info.juanmendez.lean.dagger2.component.models.RequestHandler;
import info.juanmendez.lean.dagger2.ui.MainView;

/**
 * Created by musta on 2/4/2017.
 */
@Subcomponent(modules = RequestModule.class)
public interface RequestComponent {

    RequestHandler requestHandler();

    void inject( MainView mainView );

    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(RequestModule module);
        RequestComponent build();
    }
}
