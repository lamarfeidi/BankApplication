public class BasicAccount implements IAccount {
    private int accountNumber;
    private double balance = 0.0;
    private double withdrawLimit;

    public BasicAccount(int accountNumber, double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.withdrawLimit = Math.max(0, withdrawLimit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > withdrawLimit) {
            amount = withdrawLimit;
        }
        if (amount > balance) {
            amount = balance;
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
