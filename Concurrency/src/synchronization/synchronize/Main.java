package synchronization.synchronize;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        IncrementCounter ic1 = new IncrementCounter(count);
        IncrementCounter ic2 = new IncrementCounter(count);

        Thread t1 = new Thread(ic1);
        Thread t2 = new Thread(ic2);

        t1.start();
        t2.start();

        Thread.sleep(1000);
        System.out.println(count.getCount());
    }


}

/*
        sequential -> count, 10000, final value -> 20000
        parallel ->
        count = 4
        // Thread1 -> 1 -> 2 -> 3 -> 4
        // Thread2 -> 4 -> 5 -> 6
        // Thread1 -> 6 -> 7

        Sequentially
            T1 -> 10000
            T2 -> 20000
 */

/*

SYNCHRONIZED KEYWORD - synchronized keyword helps to solve synchronization issues
there are 2 ways:
1. synchronized method
2. synchronized block

1. sync method - we put synchronized keyword in the method name so that the method is not accessible by
                 multiple threads at the same time
2. sync block - we put a block of code inside 'synchronized' to make the code accessible only by a single thread
                at a time

-> use case wise both are same
-> synchronized method puts the entire method under lock, we cant optimise on lines of code
-> prefer sync.block until 90% of the method requires synchronization

synchronized block can be implement in 2 ways :-
1. synchronized(className.class)
   -> lock takes on entire class object
   -> all method calls via any class object will be synchronized

2. synchronized(this)
   -> lock takes on particular class object
   -> method calls for same class objects will be synchronized

*/
