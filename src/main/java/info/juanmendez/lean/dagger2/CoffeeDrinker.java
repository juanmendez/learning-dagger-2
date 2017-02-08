package info.juanmendez.lean.dagger2;

import info.juanmendez.lean.dagger2.module.Cup;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class CoffeeDrinker {

    @Inject
    Cup cup;

    public CoffeeDrinker(){
        Application.coffeeComponent.inject(this);
        drinkUp();
    }

    void drinkUp(){

        if( cup.makeCoffee() ){
            System.out.println( cup );
            System.out.println( "\nI am enjoying my morning coffee!!");
        }
    }
}
