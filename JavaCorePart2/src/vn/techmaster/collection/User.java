package vn.techmaster.collection;

public class User implements Comparable<User> {
    private String name;
    private int point;
    private int height;

    public User(String name, int point, int height) {
        this.name = name;
        this.point = point;
        this.height = height;
    }

    @Override
    public int compareTo(User o) {
        return this.point - o.point;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
