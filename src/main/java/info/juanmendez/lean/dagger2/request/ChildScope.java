package info.juanmendez.lean.dagger2.request;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ChildScope {
}
