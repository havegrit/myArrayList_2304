package org.example;

public class MyArrayList <T> {
    private String[] data = new String[2];
    private int size = 0;
    public boolean add(String element) {
        data[size++] = element;
        return true;
    }

    public int size() {
        return this.size;
    }

    public String get(int i) {
        return data[i];
    }
}
