import java.util.Scanner;

public class atm_interference {

    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            balance = initialBalance;
        }

        public double getBalance() {
            System.out.println("Your account balance is: $" + balance);
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + " successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdrawal(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn $" + amount + " successfully.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    }

    static class ATM {
        private BankAccount userAccount;
        private Scanner scanner;

        public ATM(BankAccount account) {
            userAccount = account;
            scanner = new Scanner(System.in);
        }

        void displayATM() {
            System.out.println("Choose one of the following options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        }

        public void run() {
            while (true) {
                displayATM();
                int choice = scanner.nextInt();
                if (choice == 1) {
                    userAccount.getBalance();
                } else if (choice == 2) {
                    System.out.println("Enter the amount to deposit:");
                    double amount = scanner.nextDouble();
                    userAccount.deposit(amount);
                } else if (choice == 3) {
                    System.out.println("Enter the amount to withdraw:");
                    double amount = scanner.nextDouble();
                    userAccount.withdrawal(amount);
                } else if (choice == 4) {
                    System.out.println("THANK YOU FOR USING ATM. GOODBYE!");
                    break;
                } else {
                    System.out.println("Please enter a valid input.");
                }
            }
            
            scanner.close();
        }
    }

    public static void main(String[] args) {
        System.out.println("__________ATM INTERFERENCE ____________");
        System.out.println("Welcome to the ATM!");

        double initialBalance = 10000;
        BankAccount account1 = new BankAccount(initialBalance);
        ATM bank = new ATM(account1);
        bank.run();
    }
}
