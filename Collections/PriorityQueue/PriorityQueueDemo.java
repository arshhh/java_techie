package Collections.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.poll();
        System.out.println(pq);
    }
}
