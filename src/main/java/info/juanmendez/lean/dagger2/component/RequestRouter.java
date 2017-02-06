package info.juanmendez.lean.dagger2.component;

import info.juanmendez.lean.dagger2.Database;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
public class RequestRouter {

    @Inject
    @ChildScope Database database;

    @Inject
    public RequestRouter(){
    }

    public void request( String route ){
        System.out.println( "redirecting to http://www.yourpage/route/" + route );
    }

    public void displayPage(){
        System.out.println( "user@table");
        for (String user:database.getUsers()) {
            System.out.println( user );
        }
    }
}
