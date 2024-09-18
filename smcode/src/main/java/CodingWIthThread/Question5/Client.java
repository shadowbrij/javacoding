package CodingWIthThread.Question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random r = new Random();
        GreetingsGenerator gg = new GreetingsGenerator(r);

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> promiseOfGreeting = executorService.submit(gg);

        // any code here not depending on greeting

        String greeting = promiseOfGreeting.get(); // blocking call
        System.out.println(greeting);

        // any code depending on greeting

        executorService.shutdown();
    }
}
