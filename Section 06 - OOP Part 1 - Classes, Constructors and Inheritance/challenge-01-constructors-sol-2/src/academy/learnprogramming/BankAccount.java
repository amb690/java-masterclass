package academy.learnprogramming;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(String number, String customerName, String customerEmail, String customerPhone) {
        this(number, 0, customerName, customerEmail, customerPhone);
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        if (balance > 0) {
            this.balance = balance;
        }
        this.number = number;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error. Trying to deposit a negative amount of " + amount);
            return;
        }
        System.out.println("Account balance: " + this.balance + ". Adding: " + amount);
        this.balance += amount;
        System.out.println("Account balance after deposit: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Error. Trying to withdraw a negative amount of " + amount);
            return;
        }
        System.out.println("Account balance: " + this.balance + ". Withdrawing: " + amount);
        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println("Account balance after withdrawal: " + this.balance);
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
        if (balance < 0) {
            return;
        }
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
