package CodingWithThread_Sync2.Example4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();


        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread t1 = new Thread(adder);
        t1.start();

        Thread t2 = new Thread(subtractor);
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getValue());





    }
}
