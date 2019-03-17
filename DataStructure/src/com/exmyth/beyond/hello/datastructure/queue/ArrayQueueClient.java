package com.exmyth.beyond.hello.datastructure.queue;

import com.exmyth.beyond.hello.datastructure.stack.ArrayStack;

public class ArrayQueueClient {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 0){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
