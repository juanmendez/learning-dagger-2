package info.juanmendez.lean.dagger2.component;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by musta on 2/5/2017.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ChildScope {
}
