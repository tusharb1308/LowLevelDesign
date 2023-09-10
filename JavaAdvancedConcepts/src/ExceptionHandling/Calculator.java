package ExceptionHandling;

import java.awt.*;

public class Calculator {
    public int divide(String n, String  m){
        try {
            int a = Integer.parseInt(n);
            int b = Integer.parseInt(m);
            System.out.println("a divide by b is: "+ a/b);
            return 0;
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("Invalid division values");
            return 1;
        }
        catch(NumberFormatException nf){
            nf.printStackTrace();
            System.out.println("Null value encounters");
            return 2;
        }
        finally {
            // write the code to free up the resources being used in the try block
            System.out.println("Finally always executed, its use case is we need to close the thread in the end, stop connection with db, clear call stack memory etc all these kind of operations irrespective of exceptions occur or not");
        }
    }
}
