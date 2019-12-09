package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Account account1 = new Account(); //"12345", 0.00, "Alberto Morante", "alberto@gmail.com",
//                //"+34 5642324324");
//        System.out.println(account1.getNumber());
//        System.out.println(account1.getBalance());
//
//        account1.withdraw(10);
//        account1.deposit(30);
//        account1.withdraw(40);
//        account1.withdraw(20);
//
//        Account albertAccount = new Account("Albert", "albert@gmail.com", "12345");
//        System.out.println(albertAccount.getNumber() + " name " + albertAccount.getCustomerName());

        VipCustomer client1 = new VipCustomer();
        System.out.println(client1.getName());

        VipCustomer client2 = new VipCustomer("Albert", 25000.00);
        System.out.println(client2.getName());

        VipCustomer client3 = new VipCustomer("Other", 100.00, "other@email.com");
        System.out.println(client3.getName());
        System.out.println(client3.getEmailAddress());
    }
}
