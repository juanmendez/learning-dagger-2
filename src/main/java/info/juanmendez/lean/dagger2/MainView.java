package info.juanmendez.lean.dagger2;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class MainView {


    @Inject
    Bar bar;

    @Inject
    @MyQualifier
    Bar qualifiedBar;

    @Inject
    public MainView() {
        Application.myComponent.inject(this);
        System.out.println("There are " + bar.getStrings().size() + " element in Set<String>, and " + qualifiedBar.strings.size() + " of @MyQualifier.Set<String>");
    }
}
