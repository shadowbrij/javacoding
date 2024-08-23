package adapter;


//TODO: There can be anothere adapter as ICICIBankAdapterForPhonePe
public class YesBankAdapterForPhonePe implements BankAPIForPhonePe {
    private final YesBank yb = new YesBank();// there are many ways we could get this object

    @Override
    public int balance() {
        yb.checkBalanceYB();
        return 0;
    }

    @Override
    public void withdraw() {
        yb.pickMoneyYB();
    }

    @Override
    public void deposit() {
        yb.putMoneyYB();
    }
}
