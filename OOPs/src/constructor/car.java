package constructor;

public class car {
    String companyName;
    String model;
    int price;
    String color;
    String engineType;

//     IF THERE IS NO CONSTRUCTOR [ absolutely 0 ] then only Java provides a default constructor
//    public car(){ // default constructor
//    }

//    0 argument constructor
    public car(){
        companyName = "tata";
        model = "harrier";
        price = 1000000;
        color = "white";
        engineType = "petrol";
    }

//    constructor overloading
//    argument/parameterised constructors
    public car(String companyName, String model, int price){
        this.companyName = companyName;
        this.model = model;
        this.price = price;
    }

    public car(String companyName, String model, int price, String color, String engineType){
        this.companyName = companyName;
        this.model = model;
        this.price = price;
        this.color = color;
        this.engineType = engineType;
    }

//    copy constructor
    public car(car c){
        companyName = c.companyName;
        model = c.model;
        price = c.price + 100000;
        color = c.color;
        engineType = c.engineType;
    }
}
