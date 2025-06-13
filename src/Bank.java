import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name to create an account: ");
        String name = sc.nextLine();
        Account account = new Account(name);

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = sc.nextDouble();
                    account.withdraw(withAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.showTransactionHistory();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

class Account {
    private String name;
    private int accountNumber;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(String name) {
        this.name = name;
        this.accountNumber = new Random().nextInt(900000) + 100000; // 6-digit account number
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        System.out.println("\nAccount created successfully!");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("Deposit successful. New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal successful. Remaining Balance: ₹" + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("\n--- Transaction History ---");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }
}

class Transaction {
    private String type;
    private double amount;
    private String timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return type + " of ₹" + amount + " on " + timestamp;
    }
}
