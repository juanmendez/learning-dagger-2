package info.juanmendez.lean.dagger2.request;

import info.juanmendez.lean.dagger2.server.database.Database;
import info.juanmendez.lean.dagger2.server.database.DatabaseType;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
public class RequestRouter {
    private Database database;
    private DatabaseType databaseType;

    public RequestRouter(Database database, DatabaseType databaseType) {
        this.database = database;
        this.databaseType  = databaseType;
    }

    public void request(String route) {
        System.out.println("redirecting to http://www.yourpage/route/" + route);
    }

    public void displayPage() {
        System.out.println("user@table");
        for (String user : database.users) {
            System.out.println(user);
        }
    }

    public void displayDatabaseType() {
        System.out.println("Database is of type " + databaseType.getDatabaseName());
    }
}
