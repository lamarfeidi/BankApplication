public class StandardAccount implements IAccount {
    private int accountNumber;
    private double balance = 0.0;
    private double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit < 0 ? creditLimit : 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        double maxWithdrawable = balance - creditLimit;
        if (amount > maxWithdrawable) {
            amount = maxWithdrawable;
        }
        balance -= amount;
        return amount;
    }

    @Override
    public double getCurrentBalance() {
        return balance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
