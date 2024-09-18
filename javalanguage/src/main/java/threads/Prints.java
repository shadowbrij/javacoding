package threads;

public class Prints implements  Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Prints!" + Thread.currentThread().getName());
    }
}
