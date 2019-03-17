package com.exmyth.beyond.hello.datastructure.queue;

public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity) {
        this.data = (E[]) new Object[capacity+1];
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        if((tail + 1)%data.length == front){
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;

    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i)% data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        E result = data[front];
        data[front] = null;
        front = (front+1)%data.length;
        size--;
        if(size == getCapacity() /4 && getCapacity()/2 != 0){
            resize(getCapacity() /2);
        }
        return result;
    }

    @Override
    public E getFront() {
        if(isEmpty()){
            new IndexOutOfBoundsException();
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Queue: size = %d, capacity = %d\n", getSize(), getCapacity()));
        result.append('[');
        result.append("front [");
        for (int i = front; i != tail; i = (i + 1)%data.length) {
            result.append(data[i]);
            if((i + 1)% data.length != tail){
                result.append(", ");
            }
        }
        result.append("] tail");
        return result.toString();
    }
}
