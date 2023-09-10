package polymorphism;

// method overloading - when a method with duplicate name but with different params is present in same class, basically there should not
// be duplicate method signature(name + params data types), method return type, access modifier doesn't matter, signature
// should be different
// method overriding - method signature should be same but logic/implementation should get change in child class

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startEngine();

        ICECar iceCar = new ICECar();
        iceCar.startEngine();
        iceCar.startEnginesDemo();
        /*
            Vehicle has 3 methods
            ICECar has total 5 methods, 3 inherited, and 2 new
            Out of the 3 inherited 2 are overridden
         */

        System.out.println("--------Upcasting---------");
        //using the vehicle ref variable, how many method will I be able to call -> 3
        // upcasting
        Vehicle vehicle = new ICECar();
        vehicle.startEngine(); // overriden method will be executed from IceCar
        vehicle.startAC(); // method executed will have same logic as Vehicle
        vehicle.startMedia(); // overriden method will be executed from IceCar
//        vehicle.autoUnlockDoors() // not doable as child class method


        System.out.println("------UPCASTING ADVANTAGE-------");
        List<Vehicle> vehicles = new ArrayList<>();    // ArrayList of Vehicle reference variable
        ICECar maruti = new ICECar();
        ICECar mahindra = new ICECar();
        ElectricCar tata = new ElectricCar();
        ElectricCar tesla = new ElectricCar();
        vehicles.add(mahindra); // internally upcasts mahindra[ICECar type] object to vehicle reference variable
        vehicles.add(maruti);
        vehicles.add(tata);
        vehicles.add(tesla);

        startAllCars(vehicles);
    }

    public static void startAllCars(List<Vehicle> vehicles){
        for (Vehicle v: vehicles) {
            v.startEngine();
            v.startAC();
        }
    }
}
