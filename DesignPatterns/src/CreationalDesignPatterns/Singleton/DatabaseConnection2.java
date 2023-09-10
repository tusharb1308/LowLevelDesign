package CreationalDesignPatterns.Singleton;

public class DatabaseConnection2 {
    private String url;
    private static  DatabaseConnection2 instance = null;

    private DatabaseConnection2(){}

    public static DatabaseConnection2 getInstance(){
        /*
        Double Check Locking
        first check without the lock.
        acquire the lock.
        check again.
         */
        if(instance == null){
            /* Instead of synchronized block we can also use lock. */
            synchronized (DatabaseConnection2.class){
                if(instance == null){
                    instance = new DatabaseConnection2();
                }
            }
        }
        return instance;
    }
}
