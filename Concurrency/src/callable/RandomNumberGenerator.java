package callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {

    @Override
    public Integer call() throws Exception{
        Random rand = new Random();
        return rand.nextInt();
    }
}


// since, Runnable doesn't allow us to return anything,
// we use callable -> call() to write multithreaded which can return data
// Steps:
// 1. identify the task you want to do parallely
// 2. create classes for all the tasks that has been identified
// 3. make the class implement callable interface
//    * callable interface has method called call(), this method holds the data
//      for the task that we want to do, and returns the data
// 4. implement the call method
//    * task definition from step 1 to 4
//    * submit the task to executor framework