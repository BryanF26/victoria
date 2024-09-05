public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountHolder = "";
    }

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String name) {
        accountHolder = name;
    }
}
