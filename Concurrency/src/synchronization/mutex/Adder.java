package synchronization.mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lock;

    Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run(){
        System.out.println("Hi, Adder");
        lock.lock();
        for(int i=1; i<=10000; i++){
            count.setCount(count.getCount() + 1);
        }
        System.out.println("Count adder: " + count.getCount());
        lock.unlock();
        System.out.println("Bye, Adder");
    }
}
