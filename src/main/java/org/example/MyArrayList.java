package org.example;

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
}
