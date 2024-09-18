package CodingWithThread_Sync2.Example2;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Counter counter;
    Lock lock;
    public Adder(Counter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            lock.lock();
            this.counter.value += i;
            lock.unlock();
        }
    }
}
