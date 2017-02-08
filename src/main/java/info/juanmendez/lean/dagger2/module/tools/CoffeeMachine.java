package info.juanmendez.lean.dagger2.module.tools;

import info.juanmendez.lean.dagger2.module.ingredients.Bean;
import info.juanmendez.lean.dagger2.module.ingredients.Water;

/**
 * Created by @juanmendezinfo on 2/7/2017.
 *
 * This is treated as a third party class which has no clue about Dagger
 */
public class CoffeeMachine {

    Bean bean;
    Filter filter;
    Boolean boiled = false;

    public CoffeeMachine(){}

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public boolean boilUp(Water water){
        if( water != null && filter != null  && bean != null ){
            boiled = true;
        }

        return boiled;
    }

    /**
     * this step is after boilUp
     * @return
     */
    public boolean pour(){
        return boiled;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "bean=" + bean +
                ", filter=" + filter +
                ", boiled=" + boiled +
                '}';
    }
}
