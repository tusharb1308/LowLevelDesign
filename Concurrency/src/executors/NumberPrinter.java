package executors;

public class NumberPrinter implements Runnable{
    private int number;

    NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run(){
        System.out.println("Number is: " + number + ", on thread: " + Thread.currentThread().getName());
    }
}
