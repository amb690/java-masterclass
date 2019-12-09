package academy.learnprogramming;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail,
                   String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        System.out.println("Current balance = " + this.balance);
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. New balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
            return;
        }
        System.out.println("Current balance = " + this.balance);
        this.balance -= withdrawalAmount;
        System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
