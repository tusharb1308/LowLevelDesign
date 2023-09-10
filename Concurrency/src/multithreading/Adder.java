package multithreading;

public class Adder implements Runnable{
    private int x;
    private int y;

    Adder(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void run(){
        System.out.println("Addition of number using "+Thread.currentThread().getName() + " is: " + (x+y));
    }
}
