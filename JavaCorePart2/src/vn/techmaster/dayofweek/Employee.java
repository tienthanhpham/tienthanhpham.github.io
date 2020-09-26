package vn.techmaster.dayofweek;

public class Employee extends Person {
    private int id;
    private String department;
    private static int count = 1;

    public Employee(String fullname, Date birthday, String department) {
        super(fullname, birthday);
        id = count++;
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n Department: " + getDepartment()
                + "\n " + super.toString();
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public static int getCount() {
        return count;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
