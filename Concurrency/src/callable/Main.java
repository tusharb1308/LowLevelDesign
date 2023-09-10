package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberGenerator randomNumber1 = new RandomNumberGenerator();
        RandomNumberGenerator randomNumber2 = new RandomNumberGenerator();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> x = executor.submit(randomNumber1);
        Future<Integer> y = executor.submit(randomNumber2);

        System.out.println("Main thread line before get");
        System.out.println("x value: " + x.get());
        System.out.println("x value: " + y.get());
        System.out.println("Main thread line after get");

        int sum = x.get() + y.get();
        System.out.println("sum: " + sum);
        executor.shutdown();
        // get is a blocking call, it will block the main thread execution
    }
}
