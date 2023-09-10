package synchronization.mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;

    Subtractor(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run(){
        System.out.println("Hi, Subtractor");
        lock.lock();
        for(int i=1; i<=10000; i++){
            count.setCount(count.getCount() - 1);
        }
        System.out.println("Count subtractor: " + count.getCount());
        lock.unlock();
        System.out.println("Bye, Subtractor");
    }
}
