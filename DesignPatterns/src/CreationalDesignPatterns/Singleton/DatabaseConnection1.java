package CreationalDesignPatterns.Singleton;

public class DatabaseConnection1 {

    // early/eager initialisation
    private static DatabaseConnection1 instance = new DatabaseConnection1();

    private DatabaseConnection1(){}

    public static synchronized DatabaseConnection1 getInstance(){
        return instance;
    }
}

// It is thread safe
// But in this case the performance of the method will be slow.