package vn.techmaster.inherit;

public class SubClass extends SuperClass {
    private String greeting;//Address2

    public SubClass(String greeting) {
        super(greeting);//Address1
        //this.greeting = greeting;
    }

    @Override
    public String getGreeting() {
        return this.greeting;//Address2
    }

    public void displayName() {
        System.out.println(" SubClass!");
    }

}
