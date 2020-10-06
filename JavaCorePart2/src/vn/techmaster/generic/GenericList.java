package vn.techmaster.generic;

public class GenericList<T> {
    private int size;
    private T[] arr;
    private int counter;
    private int value;

    public GenericList(int size) {
        this.size = size;
        arr = (T[])new Comparable[size];
    }

    public void add(T item) {
        arr[counter++] = item;

    }

    public T get(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        String result ="";
        for (T item : arr)
            result += item + "\t";
        return result;
    }
}
