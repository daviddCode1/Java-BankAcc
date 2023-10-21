public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount)  {
        super.withdraw(amount);
    }

    public void transfer(BankAccount receiver, double amount) {
        super.transfer(receiver, amount);
    }

    public void interest(double interest) {
        super.interest(amount);

    }
}