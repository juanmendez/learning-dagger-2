package info.juanmendez.lean.dagger2.request;

import info.juanmendez.lean.dagger2.Orm;
import info.juanmendez.lean.dagger2.server.Database;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
public class ChildOrm implements Orm {

    Database database;

    public ChildOrm( Database database ){
        this.database = database;
    }

    public String[] getTable(String tableName) {

        if( database.connect() && tableName.equals(Database.USERS)  ){
            return database.getUsers();
        }

        return new String[0];
    }
}