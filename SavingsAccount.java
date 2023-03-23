public class SavingsAccount extends BankAccount {

    private static final double annualInterestRate = 0.03;
    private static final double withdrawalFee = 0.005;

    public SavingsAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount)  {
        if (amount > 0 & amount <= balance) {
            balance -= (balance * withdrawalFee);
            balance -= amount;
            System.out.println("£" + amount + " withdrawn");
        } else {
            System.out.println("Cant withdraw that amount");
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        super.transfer(receiver, amount);
    }

    public double monthlyInterest() {
        double monthlyInterest = balance * (annualInterestRate / 12);
        return monthlyInterest;
    }

    public double balanceWithInterest() {
        double totalBalance = balance + (balance * annualInterestRate);
        return totalBalance;
    }


}

