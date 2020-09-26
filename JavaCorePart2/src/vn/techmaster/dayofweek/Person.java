package vn.techmaster.dayofweek;

public class Person {
    private String fullname;
    private Date birthday;

    public Person(String fullname, Date birthday) {
        this.fullname = fullname;
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Name: " + getFullname() + "\n Birthday: " + getBirthday();
    }
}
