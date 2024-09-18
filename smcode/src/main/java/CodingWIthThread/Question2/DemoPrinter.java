package CodingWIthThread.Question2;

public class DemoPrinter implements Runnable {
    private void doSomething(){
        System.out.println("Hello4 from " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello3 from " + Thread.currentThread().getName());
        doSomething();
    }
}
