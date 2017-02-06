package info.juanmendez.lean.dagger2.server;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
@Singleton
public class Database {

    @Inject
    public Database(){

    }

    public boolean connect(){
        return true;
    }

    public String[] getUsers() {
        return new String[]{"John", "Hector", "Karl", "Friedrich", "Bertrand", "Jean-Paul", "Slavoj"};
    }

    public String[] getAdmins(){
        return new String[]{"John", "Mary"};
    }

    public interface Tables{
        public static final String USERS = "user@table";
        public static final String ADMINS = "admin@table";
    }
}
