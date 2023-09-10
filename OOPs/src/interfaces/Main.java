package interfaces;

public class Main {
    public static void main(String[] args) {
        Tata nexon = new Tata();
        Mahindra thar = new Mahindra();

        Travel travelWithTataCar = new Travel(nexon);
        Travel travelWithMahindraCar = new Travel(thar);

        travelWithTataCar.travelWithCar();
        travelWithMahindraCar.travelWithCar();
    }
}
