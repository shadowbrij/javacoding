package lambdasTanmay;

import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Mehtod- 1
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class" + Thread.currentThread().getName());
            }
        });
        t.start(); */

        //Method-2
        //SAM - Single abstract method -> Functional Interface
        //From Java 8 function interfaces can be replaced with lambda
        Thread thread = new Thread(() -> System.out.println("In Lambda"));
        thread.start();

        Runnable runnable = () -> {
            System.out.println("Code line 1");
            System.out.println("code line 2");
        };

        Callable<String> callable = () -> "returning home";
        Future<String> value =  Executors.newSingleThreadExecutor().submit(callable);
        System.out.println(value.get());

        Callable<String> callable1 = () ->{
            System.out.println("Printing something");
            System.out.println("another multiline");
            return  "hehhe";
        };
        //Above multi line thing can put into a separate method and can be called via a method reference as below-
        Future<String> value1 =  Executors.newSingleThreadExecutor().submit(Runner::returnHome);
        // it can be used as this::returnHome if the method was Non-Static




    }

    private static String returnHome(){
        System.out.println("Printing something");
        System.out.println("another multiline");
        return  "hehhe";
    }
}
