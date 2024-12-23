import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<IAccount> accounts = new ArrayList<>();

    public void openAccount(IAccount account) {
        accounts.add(account);
    }

    public void closeAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.getCurrentBalance() < 0) {
                    System.out.println("Account cannot be closed due to debt.");
                } else {
                    accounts.remove(account);
                }
                return;
            }
        }
    }

    public List<IAccount> getAllAccounts() {
        return new ArrayList<>(accounts);
    }

    public List<IAccount> getAllAccountsInDebt() {
        List<IAccount> inDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() < 0) {
                inDebt.add(account);
            }
        }
        return inDebt;
    }

    public List<IAccount> getAllAccountsWithBalance(double balance) {
        List<IAccount> withBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() > balance) {
                withBalance.add(account);
            }
        }
        return withBalance;
    }
}

