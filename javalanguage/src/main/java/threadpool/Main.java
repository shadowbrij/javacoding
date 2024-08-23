package threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //Executors.newSingleThreadExecutor();
        var executer = Executors.newFixedThreadPool(3);
        try{
            var future = executer.submit(()->{
                System.out.println(Thread.currentThread().getName());
                return 1;
            });

        }
        finally {
            executer.shutdown();
        }
    }
}
