package vn.techmaster.generic;

public class GenericListUser {
    private int size;
    private User[] arr;
    private int counter;

    public GenericListUser(int size) {
        this.size = size;
        this.arr = new User[size];
    }

    public void add(User item) {
        arr[counter++] = item;
    }

    public User get(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        String result ="";
        for (User item : arr)
            result += item + "\t";
        return result;
    }
}
