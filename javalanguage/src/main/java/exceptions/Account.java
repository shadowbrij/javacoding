package exceptions;

import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException{
        if(value <= 0){
         //   throw new IllegalArgumentException();
            throw new IOException();
        }
    }
    public void withdraw(float value) throws InsuffiecientFundException {
        if(value > 100/*balance*/){
            throw new InsuffiecientFundException("as",233);
        }
    }
}
