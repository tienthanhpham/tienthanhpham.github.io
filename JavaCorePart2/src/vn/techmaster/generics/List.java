package vn.techmaster.generics;

public class List {
    private int[] items;
    private int count = 0;

    public List(int length) {
        this.items = new int[length];
    }

    public void add(int item) {
        items[count++] = item;
    }

    public int getItem(int index) {
        return items[index];
    }

    @Override
    public String toString() {
        String array = "";
        for (int i = 0; i < items.length; i++)
            array += items[i] + "\t";
        return array;
    }
}
