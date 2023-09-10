package staticFinalAbstract;

public class User {
    public static final String galaxy = "Milky way";
    public final String bloodGroup;

    public User(String bloodGroup){
        this.bloodGroup = bloodGroup;
    }
}

// Final keyword -> variable -> cant change the value, value cant be un-initialised or default initialisation
// Final keyword -> method -> override is not possible
// Final keyword -> class -> extend is not possible

// H/W -> final methods cant be overridden, static methods can be overridden,
// can we override final static methods ?

// H/W -> Read about static block/static constructors
