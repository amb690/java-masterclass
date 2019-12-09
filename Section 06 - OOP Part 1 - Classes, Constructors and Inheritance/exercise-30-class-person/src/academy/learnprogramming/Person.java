package academy.learnprogramming;

public class Person {

    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age < 0 ||age > 100)? 0: age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        String fullName = "";
        if (!this.firstName.equals("") && !this.lastName.equals("")) {
            fullName = " ";
        }
        return this.firstName + fullName + this.lastName;
    }
}
