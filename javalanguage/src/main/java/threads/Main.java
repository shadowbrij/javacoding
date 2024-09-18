package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Use of FututreTask to get the result from a Callable. Otherwise, we can use ExecutorService

       /* var futuretask = new FutureTask<>(new CallableDemo());
        new Thread(futuretask).start();
        System.out.println(futuretask.get());

        */
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        var future = executorService.submit(new CallableDemo());
        System.out.println(future.get());
    }
}
