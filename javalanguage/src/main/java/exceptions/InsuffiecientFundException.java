package exceptions;

public class InsuffiecientFundException extends Exception{
    //optionally
    int errorCode;
    public InsuffiecientFundException(String message,int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
