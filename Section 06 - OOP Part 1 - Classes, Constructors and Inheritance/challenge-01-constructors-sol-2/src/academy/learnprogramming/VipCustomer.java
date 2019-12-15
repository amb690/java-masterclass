package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private String email;
    private double limit;

    public VipCustomer() {
        this("Default name", "Default email", 500);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 1000);
    }

    public VipCustomer(String name, String email, double credit_limit) {
        this.name = name;
        this.email = email;
        this.limit = credit_limit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getLimit() {
        return limit;
    }
}
