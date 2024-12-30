public class BankAccount {
    private double balance;

    //construction to initialize balance

    public BankAccount(double initialBalance){
        balance=initialBalance;
    }
    // Method to deposit money

    public void Deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Deposit amount: "+amount);
        }else {
            System.out.println("Invalid Deposit amount");
        }
    }

    // Method to Withdraw Money

    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdraw Amount : "+amount);
        }else {
            System.out.println("Invalid withdraw amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000000);
        account.Deposit(2000000);
        account.withdraw(50000);
        System.out.println("Final Balance Amount :"+account.getBalance());

    }
}
