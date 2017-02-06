package info.juanmendez.lean.dagger2.component;

import info.juanmendez.lean.dagger2.Database;

import javax.inject.Inject;

/**
 * Created by musta on 2/5/2017.
 */
@ChildScope
public class ChildDatabaseImp implements Database{

    @Inject
    public ChildDatabaseImp(){}


    public boolean connect() {
        return true;
    }

    public String[] getUsers() {
        return new String[]{"Maria", "Juan", "Pedro", "Pablo", "David", "José", "Moises"};
    }
}
