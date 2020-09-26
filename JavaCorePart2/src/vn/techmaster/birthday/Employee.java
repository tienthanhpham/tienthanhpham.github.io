package vn.techmaster.birthday;

public class Employee extends Person {
    private String department;
    private int id;
    private static int count = 1;

    public Employee(String full_name, Date birthday, String department) {
        super(full_name, birthday);
        this.department = department;
        id = count++;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getId() + "\n" + getDepartment() + "\n"
                + super.toString();
    }
}
