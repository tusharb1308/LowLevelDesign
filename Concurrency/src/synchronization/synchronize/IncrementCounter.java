package synchronization.synchronize;

public class IncrementCounter implements Runnable{

    private Count count;

    public IncrementCounter(Count count){
        this.count = count;
    }

    @Override
    public void run(){
        for(int i=1; i<=10000; i++){
//            count.increment();           // method
            count.increaseCountValue();    // block
        }
        System.out.println("Thread complete, thread name: " + Thread.currentThread().getName());
    }
}
