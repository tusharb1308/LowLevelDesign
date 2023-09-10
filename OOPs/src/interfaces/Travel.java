package interfaces;

public class Travel {
    Vehicle vehicle;

    public Travel(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void travelWithCar(){
        vehicle.startEngine();
        vehicle.startAC();
        vehicle.startMedia();
    }
}
