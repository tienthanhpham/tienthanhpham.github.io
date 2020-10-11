package vn.techmaster.coll;

public class User implements Comparable<User> {
    private String username;
    private int point;
    private int height;

    public User(String username, int point, int height) {
        this.username = username;
        this.point = point;
        this.height = height;
    }

    @Override
    public int compareTo(User o) {
        return this.point - o.point;
    }

    @Override
    public String toString() {
        return username;
    }

    public int getHeight() {
        return height;
    }
}
