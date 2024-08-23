package adapter;

public class DIC {
    public static BankAPIForPhonePe getAdapter(){
        return new YesBankAdapterForPhonePe();//TODO: There are many ways to get objects from DI container
    }
}
