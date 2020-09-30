package vn.techmaster.generics;

public class User implements Comparable<User> {
    private String name;
    private int point;

    public User(String name, int point) {
        this.name = name;
        this.point = point;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return point - o.point;
    }
}
