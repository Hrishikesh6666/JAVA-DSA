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


       //      OR

//import java.util.Scanner;

//public class BankAccount {
//    private double balance;
//
//    // Constructor to initialize balance
//    public BankAccount(double initialBalance) {
//        balance = initialBalance;
//    }
//
//    // Method to deposit money
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposited: " + amount);
//        } else {
//            System.out.println("Invalid deposit amount");
//        }
//    }
//
//    // Method to withdraw money
//    public boolean withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrawn: " + amount);
//            return true;
//        } else {
//            System.out.println("Invalid withdrawal amount");
//            return false;
//        }
//    }
//
//    // Method to check balance
//    public double getBalance() {
//        return balance;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt user for initial balance
//        System.out.print("Enter initial balance: ");
//        double initialBalance = scanner.nextDouble();
//        BankAccount account = new BankAccount(initialBalance);
//
//        boolean exit = false;
//
//        // Menu-driven interface
//        while (!exit) {
//            System.out.println("\nMenu:");
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Exit");
//            System.out.print("Choose an option: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter deposit amount: ");
//                    double depositAmount = scanner.nextDouble();
//                    account.deposit(depositAmount);
//                    break;
//                case 2:
//                    System.out.print("Enter withdrawal amount: ");
//                    double withdrawalAmount = scanner.nextDouble();
//                    account.withdraw(withdrawalAmount);
//                    break;
//                case 3:
//                    System.out.println("Current Balance: " + account.getBalance());
//                    break;
//                case 4:
//                    exit = true;
//                    System.out.println("Exiting. Thank you!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//
//        scanner.close();
//    }
//}
//
