package com.exmyth.beyond.hello.datastructure;

public class Array {
    private int size;
    private int[] data;

    public Array(int capacity) {
        this.data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add (int index, int e){
        if(size == data.length){
            throw new IndexOutOfBoundsException();
        }
        if(index < 0 || index > size){
            throw new IllegalArgumentException();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }
    public void addLast(int e){
        add(size, e);
    }

    public void addFirst(int e){
        add(0, e);
    }

    int get(int index){
        if(index < 0 || index >=size){
            new IndexOutOfBoundsException();
        }
        return data[index];
    }

    void set(int index, int e){
        if(index < 0 || index >=size){
            new IndexOutOfBoundsException();
        }
        data[index] = e;
    }

    public boolean contains(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return true;
            }
        }
        return false;
    }

    public int find(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    public int remove(int index){
        if(index < 0 || index >=size){
            new IndexOutOfBoundsException();
        }
        int result = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i -1 ] = data[i];
        }
        size--;
        return result;
    }

    public int removeFirst(){
        return remove(0);
    }

    public int removeLast(){
        return remove(size -1);
    }

    public boolean removeElement(int e){
        int index = find(e);
        if(index != -1){
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format(
                "Array: size = %d, capacity = %d\n", size, data.length));
        result.append('[');
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if(i != size - 1){
                result.append(", ");
            }
        }
        result.append(']');
        return result.toString();
    }
}
