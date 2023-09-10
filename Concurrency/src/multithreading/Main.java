package multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, from thread : " + Thread.currentThread().getName()); // main thread
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        hwp.run();   // main

        Thread t = new Thread(hwp);
        t.run();     // main
        t.start();   // thread 0
        // run() - execute logic on current thread
        // start() - spawns a new thread and execute run() on new thread

        // question
        // take 2 numbers as input from user, and add the numbers and subtract the numbers in two different threads
        // i/p - 2 numbers - main thread
        // t0 - add and print
        // t1 - subtract and print
        // since we cant pass data to run we can pass data to the object of the task class

        Adder a = new Adder(20, 10);
        Subtractor s = new Subtractor(20, 10);
        a.run();  // main
        s.run();  // main
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.run();   // main
        t1.start();  // thread 1
        t2.run();    // main
        t2.start();  // thread 2
    }
}



// steps to write multithreading code
// 1. identify the task that you want to do parallely
// 2. create classes for all the tasks that has been identified(name of the class should be noun doing verb eg. HelloWorldPrinter)
// 3. make the classes implement runnable interface
// 4. implement the run method
// 5. thread creation and execution
//    (a) go to the place from where you want to execute the code
//    (b) create the object of the task class
//    (c) create a thread using task object
//    (d) start the thread
