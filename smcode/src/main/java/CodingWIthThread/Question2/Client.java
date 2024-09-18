package CodingWIthThread.Question2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello1 from " + Thread.currentThread().getName());

        DemoPrinter dp = new DemoPrinter();
        Thread t = new Thread(dp);
        t.start();

        System.out.println("Hello2 from " + Thread.currentThread().getName());
    }
}
