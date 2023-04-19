package org.example;

public class MyArrayList <T> {
    private int size = 0;
    public boolean add(T element1) {
        size++;
        return true;
    }

    public int size() {
        return this.size;
    }
}
