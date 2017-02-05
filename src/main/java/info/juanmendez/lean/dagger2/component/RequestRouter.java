package info.juanmendez.lean.dagger2.component;

import info.juanmendez.lean.dagger2.server.Database;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by musta on 2/5/2017.
 */
@Singleton
public class RequestRouter {

    @Inject
    Database database;

    @Inject
    public RequestRouter(){
        System.out.println( "@singleton avoids multiple instances");
        System.out.println( "Otherwise ServerComponent and Subcomponent have their own instances");
    }

    public void request( String route ){
        System.out.println( "redirecting to http://www.yourpage/route/" + route );
    }

    public void displayPage(){
        System.out.println( "Users " + database.users.length );
    }
}
