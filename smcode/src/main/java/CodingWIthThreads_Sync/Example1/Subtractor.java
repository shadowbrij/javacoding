package CodingWIthThreads_Sync.Example1;

public class Subtractor implements Runnable {
    Counter counter;
    public Subtractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            this.counter.value -= i;
        }
    }
}
