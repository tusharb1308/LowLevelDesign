package inheritance;

public class User {
    private int id;
    public String name;
    public String phoneNumber;

//    default constructor
    public User(){
    }

    public User(int id){
        // this is used to call the class's own attributes(data members/constructors/methods) and make differentiate
        // b/w parameter and attribute
        this.id = id;
    }

    public User(int id, String name){
        // this will call constructor with only id parameter
        this(id);  // this is always first line of constructor
        this.name = name;
    }

    public User(int id, String name, String phoneNumber){
        // this will call constructor with only id and name parameter
        this(id, name);
        this.phoneNumber = phoneNumber;
    }

    public void helloWorld(){
        System.out.println("Hi World, from User!");
    }

    public void greet(){
//        this.helloWorld();
        helloWorld();
        System.out.println("Good morning, from User!");
    }

//    setter and getter methods can be use to set and get the value of private data members and other data members also
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
