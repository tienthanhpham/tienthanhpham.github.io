package vn.techmaster.collection;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] arr;
    private int counter;

    public GenericList(int size) {
        arr = (T[])new Object[size];
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

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (this.index < list.arr.length);
        }

        @Override
        public T next() {
            return list.arr[index++];
        }
    }
}
