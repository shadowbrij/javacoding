package lambdasTanmay;

public class Printer implements Runnable{
    @Override
    public void run() {
        System.out.println("In printer" + Thread.currentThread().getName());
    }
}
