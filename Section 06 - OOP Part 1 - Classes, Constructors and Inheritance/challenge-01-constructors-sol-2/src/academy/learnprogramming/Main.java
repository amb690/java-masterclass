package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    BankAccount testAccount = new BankAccount("ES91 2100 0418 4502 0005 1332",
//                "TestAccount",
//                "account@email.com",
//                "654123123");
//        System.out.println("Account number: " + testAccount.getNumber());
//        System.out.println("Customer name: " + testAccount.getCustomerName());
//        System.out.println("Customer email: " + testAccount.getCustomerEmail());
//        System.out.println("Customer phone: " + testAccount.getCustomerPhone());
//        System.out.println("Balance: " + testAccount.getBalance());
//        testAccount.deposit(-100);
//        testAccount.deposit(100);
//        testAccount.withdraw(100.1);
//        testAccount.withdraw(100);
//        testAccount.setBalance(-100);
//        System.out.println("Current balance: " + testAccount.getBalance());
//        testAccount.setBalance(40);
//        System.out.println("Current balance: " + testAccount.getBalance());

        VipCustomer customer = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("test", "test@email.com");
        VipCustomer customer3 = new VipCustomer("test2", "test2@email.com", 800.0);
        System.out.println("Empty constructor customer: " + customer.getName());
        System.out.println("Empty constructor email: " + customer.getEmail());
        System.out.println("Empty constructor limit: " + customer.getLimit());

        System.out.println("2nd constructor customer: " + customer2.getName());
        System.out.println("2nd constructor email: " + customer2.getEmail());
        System.out.println("2nd constructor limit: " + customer2.getLimit());

        System.out.println("3rd constructor customer: " + customer3.getName());
        System.out.println("3rd constructor email: " + customer3.getEmail());
        System.out.println("3rd constructor limit: " + customer3.getLimit());
    }
}
