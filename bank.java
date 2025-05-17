/*Define a class to represent a Bank account. Include the following members.
Data members:
a. Name of the depositor
b. Account number.
c. Type of account.
d. Balance amount in the account.
e. Rate of interest (static data)
Provide a default constructor and parameterized constructor to this class. 
Also provide Methods:
a. To deposit amount.
b. To withdraw amount after checking for minimum balance.
c. To display all the details of an account holder.
d. Display rate of interest (a static method)
Illustrate all the constructors as well as all the methods by defining objects.*/
import java.util.*;

class bank{
    String name;
    int account_number;
    String type_of_account;
    double balance_amount;
    static double rate_of_interest=0.05;
    // Default constructor
    // 5% interest rate

    // Parameterized constructor
    bank(String name, int account_number, String type_of_account, double balance_amount) {
        this.name = name;
        this.account_number = account_number;
        this.type_of_account = type_of_account;
        this.balance_amount = balance_amount;
    }

    // Method to deposit amount
    void deposit(double amount) {
        if (amount > 0) {
            balance_amount += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount after checking for minimum balance
    void withdraw(double amount) {
        if (amount > 0 && (balance_amount - amount) >= 1000) { // Minimum balance of 1000
            balance_amount -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    // Method to display all the details of an account holder
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Type of Account: " + type_of_account);
        System.out.println("Balance Amount: " + balance_amount);
    }

    // Static method to display rate of interest
    static void displayRateOfInterest() {
        System.out.println("Rate of Interest: " + rate_of_interest * 100 + "%");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of depositor: ");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        int account_number = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter type of account: ");
        String type_of_account = sc.nextLine();
        System.out.println("Enter initial balance amount: ");
        double balance_amount = sc.nextDouble();

        // Create a bank account object using parameterized constructor
        bank account = new bank(name, account_number, type_of_account, balance_amount);

        // Display initial details
        account.displayDetails();
        displayRateOfInterest();

        // Deposit and withdraw operations
        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final details
        account.displayDetails();
    }
}