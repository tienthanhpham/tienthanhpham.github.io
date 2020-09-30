package vn.techmaster.generics;

public class GenericsList<T extends Comparable> {
    private T[] items;
    private int count = 0;

    public GenericsList(int length) {
        this.items = (T[]) new Comparable[length];
    }

    public void add(T item) {
        items[count++] = item;
    }

    public T getItem(int index) {
        return items[index];
    }

    @Override
    public String toString() {
        String array = "";
        for (int i = 0; i < items.length; i++)
            if (items[i] != null)
                array += items[i].toString() + "\t";
        return array;
    }
}
