package vn.techmaster.birthday;

public class Person {
    private String full_name;
    private Date birthday;

    public Person(String full_name, Date birthday) {
        this.full_name = full_name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return full_name + "\n" + getBirthday();
    }
}
