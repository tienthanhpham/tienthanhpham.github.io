package vn.techmaster.contact;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private char gender;//M or F
    private int compareAttribute; //0 -- Name; 1 -- Age

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Person o) {
        return compare(o, compareAttribute);
    }

    private int compare(Person o, int compareAttribute) {
        if (compareAttribute == 1)
            return this.getAge() - o.getAge();
        else
            return this.getName().compareTo(o.getName());
    }

    public void setCompareAttribute(int compareAttribute) {
        this.compareAttribute = compareAttribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + gender;
    }
}
