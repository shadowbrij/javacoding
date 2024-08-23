package exceptions;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        ExceptionsDemo.show();
        var acount = new Account();
        try {
            acount.deposit(-1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
