package info.juanmendez.lean.dagger2.component;

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

        if( database.connect() && tableName == Database.Tables.USERS ){
            return database.getUsers();
        }

        return new String[0];
    }
}