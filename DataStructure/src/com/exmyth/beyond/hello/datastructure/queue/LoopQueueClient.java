package com.exmyth.beyond.hello.datastructure.queue;

public class LoopQueueClient {
    public static void main(String[] args) {
        Queue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.dequeue();
                System.out.println();
                System.out.println(queue);
            }
        }
    }
}
