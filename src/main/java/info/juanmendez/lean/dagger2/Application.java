package info.juanmendez.lean.dagger2;

import info.juanmendez.lean.dagger2.module.CoffeeComponent;
import info.juanmendez.lean.dagger2.module.CoffeeModule;
import info.juanmendez.lean.dagger2.module.DaggerCoffeeComponent;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class Application {

    public static CoffeeComponent coffeeComponent;

    public static void main( String[] args ){
        coffeeComponent = DaggerCoffeeComponent.builder().build();
        new CoffeeDrinker();
    }
}