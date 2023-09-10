package CreationalDesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.getInstance();
        DatabaseConnection1.getInstance();
        DatabaseConnection2.getInstance();
    }
}


// singleton design pattern says that we have to create object only one time
