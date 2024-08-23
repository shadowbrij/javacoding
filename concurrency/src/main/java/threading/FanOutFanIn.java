package threading;

import java.util.ArrayList;

public class FanOutFanIn {
    public static void main(String[] args) throws InterruptedException {
        new PrintInOrder(50,4).run();
    }
    
    static class PrintInOrder{
        private final int items;
        ArrayList<Thread> threads;
        private final int thread;
        int i = 0;

        public PrintInOrder(int items, int thread) {
            this.items = items;
            this.thread = thread;
            this.threads = new ArrayList<>();
        }
        void run() throws InterruptedException {
            // 1- 10
            while(i < 10){
                printNext();
            }

            //11-40

            for (int j = 0; j < this.thread; j++) {
                 threads.add(new Thread(()-> {
                     while(i<40){
                         printNext();
                     }
                 }));
            }
            threads.forEach(Thread::start);
            for (Thread thread1 : threads) {
                thread1.join();
            }

            //41-50
            while(i<50){
                printItem(i+1);
                i++;
            }

        }
        private void printItem(int i){
            System.out.println(Thread.currentThread().getName()+ "\t" + i);
        }
        synchronized void printNext(){
            printItem(i);
            i++;
            notify();
        }
    }
}
