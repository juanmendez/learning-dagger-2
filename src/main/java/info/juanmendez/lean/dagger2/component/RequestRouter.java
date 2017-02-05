package info.juanmendez.lean.dagger2.component;

import info.juanmendez.lean.dagger2.server.Database;

import javax.inject.Inject;

/**
 * Created by musta on 2/5/2017.
 */
public class RequestRouter {
    Database database;

    public RequestRouter( Database database ){
        this.database = database;
    }

    public void request( String route ){
        System.out.println( "redirecting to http://www.yourpage/route/" + route );
    }

    public void displayPage(){
        System.out.println( "Users " + database.users.length );
    }
}
