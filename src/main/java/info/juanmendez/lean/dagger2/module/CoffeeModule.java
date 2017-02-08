package info.juanmendez.lean.dagger2.module;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.module.ingredients.Bean;
import info.juanmendez.lean.dagger2.module.tools.CoffeeMachine;
import info.juanmendez.lean.dagger2.module.tools.Filter;

import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class CoffeeModule {

    public CoffeeModule(){
    }

    //how to make a third party class into a dependency injection
    @Singleton //every time this binding is injected, we want the object instantiated once!
    @Provides //makes the object bindable!
    public CoffeeMachine provideCoffeeMachine(Bean bean){
        return new CoffeeMachine();
    }

    @Provides
    public Filter providesFilter(){
        return new Filter();
    }
}
