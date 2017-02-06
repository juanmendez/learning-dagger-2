package info.juanmendez.lean.dagger2.server;

import info.juanmendez.lean.dagger2.Orm;

/**
 * Created by musta on 2/5/2017.
 */
public class RootOrm implements Orm{
    Database database;

    public RootOrm( Database database ){
        this.database = database;
    }

    public String[] getTable(String tableName) {

        if( database.connect() && tableName == Database.Tables.ADMINS ){
            return database.getAdmins();
        }

        return new String[0];
    }
}
