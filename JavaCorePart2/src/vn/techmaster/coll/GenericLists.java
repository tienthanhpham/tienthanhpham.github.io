package vn.techmaster.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericLists<T> implements Iterable<T> {
    T[] list;
    private int count;

    public GenericLists(int size) {
        this.list = (T[]) new Object[size];
    }

    public void add(T other) {
        list[count++] = other;
    }

    public T get(int index) {
        return list[index];
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        GenericLists<T> list;
        private int index;

        public ListIterator(GenericLists<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index - list.getCount() < 0;
        }

        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
