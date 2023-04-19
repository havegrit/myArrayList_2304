package org.example;

import java.util.function.Predicate;

public class MyArrayList <T> {
    private String[] data = new String[2];
    private int size = 0;
    public boolean add(String element) {
        makeNewDataIfNotEnough();
        data[size++] = element;
        return true;
    }

    public int size() {
        return this.size;
    }

    public String get(int i) {
        return data[i];
    }

    public void makeNewDataIfNotEnough() {
        if (ifNotEnough()) {
            makeNewData();
        }
    }

    private void makeNewData() {
        String[] newData = new String[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private boolean ifNotEnough() {
        return size == data.length-1;
    }

    public String remove(int index) {
        String targetData = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return targetData;
    }

    public boolean contains(String element) {
        for (String e : data) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        data = new String[0];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean removeIf(Predicate<String> predicate) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            result = predicate.test(data[i]);
            if (result) {
                remove(i);
            }
        }
        return result;
    }
}
