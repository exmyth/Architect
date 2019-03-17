package com.exmyth.beyond.hello.datastructure.queue;

import java.util.Random;

public class CompareClient {
    private static double testQueue(Queue<Integer> q, int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000_000.0;
    }
    public static void main(String[] args) {
        int opCount = 100000;
        Queue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println(time1);

        Queue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println(time2);
    }
}
