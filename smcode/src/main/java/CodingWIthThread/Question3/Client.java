package CodingWIthThread.Question3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please give a number ");
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++){
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }

        System.out.println("Bye from " + Thread.currentThread().getName());
    }
}
