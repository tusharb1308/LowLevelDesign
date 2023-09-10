package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        c1.divide("10", "0");
        c2.divide("10", null);

        Product p1 = new Product();
        p1.getProductName(null);
        Product p2 = new Product();
        p2.getProductName("123");
    }
}
