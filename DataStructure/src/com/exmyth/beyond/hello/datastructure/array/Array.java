package com.exmyth.beyond.hello.datastructure.array;

public class Array<E> {
    private int size;
    private E[] data;

    public Array(int capacity) {
        data = (E[])new Object[capacity];
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

    public void add (int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException();
        }

        if(size == data.length){
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void addLast(E e){
        add(size, e);
    }

    public void addFirst(E e){
        add(0, e);
    }

    public E get(int index){
        if(index < 0 || index >=size){
            new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index, E e){
        if(index < 0 || index >=size){
            new IndexOutOfBoundsException();
        }
        data[index] = e;
    }

    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    public int find(E e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public E remove(int index){
        if(index < 0 || index >=size){
            new IndexOutOfBoundsException();
        }
        E result = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i -1 ] = data[i];
        }
        size--;
        data[size] = null;//loitering object != memory leak
        if(size == data.length /4){
            resize(data.length/2);
        }
        return result;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size -1);
    }

    public boolean removeElement(E e){
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
