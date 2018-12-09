# Scoped dependencies

Just like we have flavored dependencies to know one from another.
We can also include multiple dependencies of the same type but based on module scopes.
In this way for example we have an interfaced named `Orm` where parent module holds one with a scope labels as `RootScope`, and one in our `RequestModule` whose scope is labeled as `ChildScope`.

```java
//found in ServerModule (belonging to parent ServerComponent)
@RootScope
@Provides
public Orm providesRootOrm(Database database) {
    return new RootOrm(database);
}
``` 

```java
//found in RequestModule (belonging to child RequestComponent)
@ChildScope
@Provides
public Orm providesDatabase(Database database){
    return new ChildOrm(database);
}
``` 

For bonus we made also one which has no scope belonging to ServerModule
```java
@Provides
public Orm providesNonScopedOrm() {
    return new Orm() {

        public String[] getTable(String tableName) {
            return new String[0];
        }
    };
}
```