public abstract class BankAccount {
    public String accountNumber;
    private String customerName;
    public double balance;
    public double interest;


    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest()   {
        return interest;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("£" + amount + " deposited into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("£" + amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        if (getBalance() >= amount) {
            withdraw(amount);
            receiver.deposit(amount);
            System.out.println("£" + amount + " transferred from account " + getAccountNumber() + " to account " + receiver.getAccountNumber());
        } else {
            System.out.println("Insufficient funds in account " + getAccountNumber());
        }
    }

    public void interest(double interestRate)     {
        double interestAmount = interest * balance;
        balance += interestAmount;
    }

}
