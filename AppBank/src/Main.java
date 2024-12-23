public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        StandardAccount sa = new StandardAccount(1, -100);
        BasicAccount ba = new BasicAccount(2, 100);
        PremiumAccount pa = new PremiumAccount(3);

        sa.deposit(200);
        ba.deposit(50);
        pa.deposit(500);

        bank.openAccount(sa);
        bank.openAccount(ba);
        bank.openAccount(pa);

        System.out.println("All Accounts: " + bank.getAllAccounts());
        System.out.println("In Debt Accounts: " + bank.getAllAccountsInDebt());

        bank.closeAccount(1);
        System.out.println("All Accounts after closing: " + bank.getAllAccounts());
    }
}
