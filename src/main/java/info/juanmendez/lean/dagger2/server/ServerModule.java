package info.juanmendez.lean.dagger2.server;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import info.juanmendez.lean.dagger2.component.RequestComponent;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class ServerModule {

    public ServerModule(){
        System.out.println( "server module created!");
    }



    @Provides
    @IntoSet
    static String a() {
        return "a";
    }


    @Provides
    @IntoMap
    @StringKey("one")
    static int one() {
        return 1;
    }

    @Provides
    @IntoMap
    @StringKey("two")
    static int two() {
        return 2;
    }
}
