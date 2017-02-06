package info.juanmendez.lean.dagger2.component;

import info.juanmendez.lean.dagger2.Database;

/**
 * Created by musta on 2/5/2017.
 */
public class ChildDatabaseImp implements Database{

    public ChildDatabaseImp(){}

    public boolean connect() {
        return true;
    }

    public String[] getUsers() {
        return new String[]{"John", "Hector", "Karl", "Friedrich", "Bertrand", "Jean-Paul", "Slavoj"};
    }
}