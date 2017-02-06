package info.juanmendez.lean.dagger2.component;

import info.juanmendez.lean.dagger2.Database;

import javax.inject.Inject;

/**
 * Created by musta on 2/5/2017.
 */
public class RequestRouter {

    @Inject
    @ChildScope Database database;

    @Inject
    public RequestRouter(){
        System.out.println( "@singleton avoids multiple instances");
        System.out.println( "Otherwise ServerComponent and Subcomponent have their own instances");
    }

    public void request( String route ){
        System.out.println( "redirecting to http://www.yourpage/route/" + route );
    }

    public void displayPage(){
        System.out.println( "Users " + database.getUsers().length );
    }
}
