public class accDriver {

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(
                "60-00-01",
                "David",
                10000.0);
        SavingsAccount savingsAccount = new SavingsAccount(
                "04-00-75",
                "David Saves",
                15000.0);

        savingsAccount.deposit(15_000);
        savingsAccount.withdraw(5_000);
        savingsAccount.transfer(currentAccount, 15_000);


        System.out.println("Balance: £" + savingsAccount.getBalance());
    }
}