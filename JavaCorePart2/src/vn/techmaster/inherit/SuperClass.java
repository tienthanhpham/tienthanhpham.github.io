package vn.techmaster.inherit;

public class SuperClass {
    private String greeting;//Address1 --> Alo

    public SuperClass(String greeting) {
        this.greeting = greeting;//Address1
    }

    public String getGreeting() {
        return greeting;//Address1
    }

    public void displayName() {
        System.out.println(" SuperClass!");
    }
}
