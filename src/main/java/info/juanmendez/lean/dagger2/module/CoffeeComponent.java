package info.juanmendez.lean.dagger2.module;

import dagger.Component;
import info.juanmendez.lean.dagger2.CoffeeDrinker;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Singleton
@Component(modules = {CoffeeModule.class})
public interface CoffeeComponent {
    void inject( CoffeeDrinker coffeeDrinker);
}
