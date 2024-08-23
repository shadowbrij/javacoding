package adapter;

public class PhonePe implements BankAPIForPhonePe{

    BankAPIForPhonePe adapter = DIC.getAdapter();

    @Override
    public int balance() {
        return adapter.balance();
    }

    @Override
    public void withdraw() {
        adapter.withdraw();
    }

    @Override
    public void deposit() {
        adapter.deposit();
    }
}
