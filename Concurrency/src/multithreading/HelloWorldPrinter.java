package multithreading;

public class HelloWorldPrinter implements Runnable {
    public void run(){
        System.out.println("Hello World, from thread : " + Thread.currentThread().getName());
    }
}

// extend a Thread class
// implement Runnable interface

// Not possible to send a parameter to run or return something from run
