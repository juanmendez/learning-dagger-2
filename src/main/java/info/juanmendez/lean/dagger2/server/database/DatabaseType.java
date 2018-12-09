package info.juanmendez.lean.dagger2.server.database;

public class DatabaseType {
    private String databaseName;

    public DatabaseType(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
