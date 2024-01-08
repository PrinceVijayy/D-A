package reflection;


public final class DatabaseConnection {

    private static DatabaseConnection myInstance;

    private DatabaseConnection() {
        System.out.println("welcome");
    }

    public static synchronized DatabaseConnection getInstance() {
        if (myInstance == null) {
            myInstance = new DatabaseConnection();
        }
        return myInstance;
    }
}
