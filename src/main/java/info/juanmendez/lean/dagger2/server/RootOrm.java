package info.juanmendez.lean.dagger2.server;

import info.juanmendez.lean.dagger2.Orm;

/**
 * Created by juan mendez on 2/5/2017.
 */
public class RootOrm implements Orm{
    Database database;

    public RootOrm( Database database ){
        this.database = database;
    }

    public String[] getTable(String tableName) {

        if(database.connect()) {
            if(tableName.equals(Database.ADMINS)){
                return database.getAdmins();
            } else if( tableName.equals(Database.USERS)) {
                return database.getUsers();
            }
        }

        return new String[0];
    }
}
