package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.component.RequestComponent;
import info.juanmendez.lean.dagger2.component.RequestModule;

import javax.inject.Inject;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class MainView {

    @Inject
    Set<String> letterString;

    @Inject
    Map<String, Integer> mapInteger;

    public MainView(){
        RequestComponent requestComponent = Application.serverComponent.requestBuilder().requestModule(new RequestModule()).build();
        requestComponent.inject( this );

        System.out.println( "Set<string>");
        for (String letter:letterString) {
            System.out.println( "letter in set: " + letter );
        }

        Iterator<Map.Entry<String,Integer>> it = mapInteger.entrySet().iterator();

        System.out.println( "Map<String,Integer>");
        while( it.hasNext() ){
            Map.Entry<String,Integer> pair = it.next();
            System.out.println( pair.getKey() + ":" + pair.getValue());
        }
    }
}
