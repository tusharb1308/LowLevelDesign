package multithreading;

public class Subtractor implements Runnable{
    private int x;
    private int y;

    Subtractor(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void run(){
        System.out.println("Subtraction of number using "+Thread.currentThread().getName() + " is: " + (x-y));
    }
}
