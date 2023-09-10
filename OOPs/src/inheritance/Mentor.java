package inheritance;

import java.lang.management.MemoryNotificationInfo;

public class Mentor extends User{
    public int rating;

    public Mentor(){
    }

    public Mentor(int id, int rating){
        // this will call constructor of parent class based upon the parameters passed
        // ability to call parent constructor from child class, is called constructor chaining
        super(id);  // this should be always first line
        this.rating = rating;
    }

    public Mentor(int id, String name, String phoneNumber, int rating){
        // this will call constructor of parent class based upon the parameters passed
        // ability to call parent constructor from child class, is called constructor chaining
        super(id, name, phoneNumber);  // this should be always first line
        this.rating = rating;
    }

    public void greetAll(){
        super.greet();
        super.helloWorld();
    }

    public String getName(){
        return super.name;
    }

    public void greetFromMentor(){
        System.out.println("Hi from Mentor");
    }
}
