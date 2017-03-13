package info.juanmendez.lean.dagger2.request;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule(){
    }

    @Provides @IntoSet
    public String c() {
        return "c";
    }

    @Provides
    @IntoMap
    @StringKey("three")
    public int three() {
        return 3;
    }

    @Provides @ElementsIntoSet
    public Set<String> wxyz(){
        return new HashSet<String>(Arrays.asList("W", "X", "Y", "Z"));
    }
}
