package vn.techmaster.collections;

public class User implements Comparable<User> {
    private String userName;
    private int point;

    public User(String userName, int point) {
        this.userName = userName;
        this.point = point;
    }

    @Override
    public int compareTo(User o) {
        return point - o.point;
    }
}
