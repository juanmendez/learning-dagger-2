package info.juanmendez.lean.dagger2.module;

import info.juanmendez.lean.dagger2.module.ingredients.Bean;
import info.juanmendez.lean.dagger2.module.ingredients.Cream;
import info.juanmendez.lean.dagger2.module.ingredients.Sugar;
import info.juanmendez.lean.dagger2.module.ingredients.Water;
import info.juanmendez.lean.dagger2.module.tools.CoffeeMachine;
import info.juanmendez.lean.dagger2.module.tools.Filter;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/7/2017.
 */
public class Cup {
    @Inject
    Cream cream;

    @Inject
    Sugar sugar;

    @Inject
    Bean bean;

    @Inject
    Water water;

    @Inject
    Filter filter;

    @Inject
    CoffeeMachine coffeeMachine;

    @Inject
    Cup(){
    }

    public boolean makeCoffee(){

        //provide items to coffee maker
        coffeeMachine.setBean( bean );
        coffeeMachine.setFilter( filter );
        coffeeMachine.boilUp( water );

        System.out.println( coffeeMachine );

        //time to pour coffee
        if( coffeeMachine.pour() ){

            System.out.println( "Cup mixed with " + sugar + " and " + cream );
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "cream=" + cream +
                ", sugar=" + sugar +
                ", bean=" + bean +
                ", water=" + water +
                ", filter=" + filter +
                ", coffeeMachine=" + coffeeMachine +
                '}';
    }
}
