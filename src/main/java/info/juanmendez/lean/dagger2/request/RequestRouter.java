package info.juanmendez.lean.dagger2.request;

import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.server.Database;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
public class RequestRouter {

    @Inject
    @ChildScope
    Orm orm;

    @Inject
    public RequestRouter(){
    }

    public void request( String route ){
        System.out.println( "redirecting to http://www.yourpage/route/" + route );
    }

    public void displayPage(){
        System.out.println( "user@table");
        for (String user: orm.getTable(Database.Tables.USERS)) {
            System.out.println( user );
        }
    }
}
