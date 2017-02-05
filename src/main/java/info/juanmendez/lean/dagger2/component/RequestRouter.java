package info.juanmendez.lean.dagger2.component;

/**
 * Created by musta on 2/5/2017.
 */
public class RequestRouter {

    public String request( String route ){
        return "redirecting to http://www.yourpage/route/" + route;
    }
}
