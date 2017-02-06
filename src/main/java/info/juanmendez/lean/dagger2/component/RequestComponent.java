package info.juanmendez.lean.dagger2.component;

import dagger.Subcomponent;
import info.juanmendez.lean.dagger2.ui.MainView;

/**
 * Created by musta on 2/4/2017.
 */
@ChildScope
@Subcomponent(modules = RequestModule.class)
public interface RequestComponent {
    void inject( MainView mainView );

    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(RequestModule module);
        RequestComponent build();
    }
}
