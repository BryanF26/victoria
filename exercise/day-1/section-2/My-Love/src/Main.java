public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("5324435");
        account.setAccountHolder("Felix Bryan");
        System.out.println("Name holder: " + account.getAccountHolder());
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Current balance: " + account.getBalance());
    }
}