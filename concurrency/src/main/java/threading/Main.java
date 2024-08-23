package threading;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * We have an array of 50 objects
         * Print 1-10 objects sequentially in 1 thread
         * Print 11-40 objects using 4 thread parallel
         * the 41-50 using 1 thread sequential
         * do this using only threads , no executors or forkjoinpool
         */
//        Runnable seq1 = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName() + "\t" + (i+1));
//            }
//        };
//        new Thread(seq1).start();

        var items = new ArrayList<Integer>(50);
        for (int i = 0; i < 50; i++) {
            items.add(i);
        }
    }
}
