package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        for(int i=1; i<=100; i++){
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);   // 100 threads are created and respective number is getting passed
//            t.start();                   // but execution of threads is random
//        }

        ExecutorService executor1 = Executors.newFixedThreadPool(10);   // no of threads created 10
        for(int i=1; i<=100; i++){
            if(i==11 || i==31 || i==61 || i==91){
                System.out.println("Debug");
            }
            NumberPrinter np = new NumberPrinter(i);
            executor1.submit(np);
        }
        executor1.shutdown();        // clears everything

//        ExecutorService executor2 = Executors.newFixedThreadPool(10);   // no of threads created 10
//        for(int i=1; i<=100; i++){
//            NumberPrinter np = new NumberPrinter(i);
//            executor2.submit(np);
//        }
//        executor2.shutdown();        // clears everything
    }
    // Print number from 1 to 100 using, 10
    // different threads, each number with a diff
    // thread
}

// Thread t = new Thread(obj)
// t.start(obj)     --> spawns a new thread and calls the run method on it

// * once the run() method completes execution, thread is dead, thread object will get cleared, and thread is not reusable
// * building a server - for every request we need one separate thread, with high number of requests no of thread
//   creation goes very high hence,
//   - lot of memory usage
//   - lot of context switching
//   - lot of cpu usage

// when we write multithreading application there are 2 things we need to do
// * figuring out the task you need to do in multiple threads independently
// * creation of threads and running of threads

// Problems:
// 1. multiple new thread creation is not an optimised way of doing things
// 2. dev should not worry about thread creation and thread start

// Solutions:
// * Executor framework or Executor service
// - till now, we were creating new threads for each task each time
// - now using executor framework we will reuse threads

// * Executor framework maintains a Threadpool - each thread when gets completed doesn't get destroyed
//                                               but is kept in threadpool for further reuse

// * Executor framework maintains waiting queue - all the tasks that needs a thread, waits in queue until
//                                                a thread becomes available

// * Executor framework sets a number of threads for thread pool