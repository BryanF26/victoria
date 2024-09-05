public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Current balance: " + account.getBalance());
    }
}