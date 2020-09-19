package vn.techmaster;

public class Employee {
    private String name;
    private byte age;
    private boolean gender;

    public Employee(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, byte age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0)
            this.age = age;
    }

    public void printEmployee() {
        System.out.println(name);
        System.out.println(age);
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int max(int number1, int number2) {
        return (number1 >= number2) ? number1 : number2;
    }


}
