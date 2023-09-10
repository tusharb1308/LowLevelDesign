package polymorphism;

public class ElectricCar extends Vehicle{
    // overriding
    @Override
    public void startEngine(){
        System.out.println("Electric car engine started");
    }
}
