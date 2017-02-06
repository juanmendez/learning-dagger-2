package info.juanmendez.lean.dagger2.server;

import info.juanmendez.lean.dagger2.Database;

import javax.inject.Inject;

/**
 * Created by musta on 2/5/2017.
 */
@RootScope
public class ServerDatabaseImp implements Database {

    @Inject
    public ServerDatabaseImp(){

    }

    public boolean connect() {
        return true;
    }

    public String[] getUsers() {
        return new String[]{"Mary", "John", "Peter", "Paul", "David", "Joseph", "Moses"};
    }
}
