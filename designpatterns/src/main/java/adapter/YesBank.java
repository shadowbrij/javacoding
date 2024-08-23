package adapter;

public class YesBank {
    public int checkBalanceYB(){
        System.out.println("Amount in your YesBank");
        return 0;
    }
    public void putMoneyYB(){
        System.out.println("Deposited in YB account");
    }
    public void pickMoneyYB(){
        System.out.println("Withdrawal from YB");
    }
}
