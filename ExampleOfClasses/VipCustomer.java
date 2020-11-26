package ExampleOfClasses;

public class VipCustomer {
    // Fields
    private String name;
    private int creditLimit;
    private String emailAdd;
    // Constructor1
    public VipCustomer(){
        this("Default name", 1_000_000, "Default Email Address");

    }
    // Constructor2
    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit,"Default Email Address");
    }
    // Constructor3
    public VipCustomer(String name, int creditLimit, String emailAdd){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdd = emailAdd;
    }
    // Getters
    public String getName(){
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdd() {
        return emailAdd;
    }
}
