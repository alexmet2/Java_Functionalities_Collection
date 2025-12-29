import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMethod {
    PriorityQueueMethod(){
        /* Priority Queue = A FIFO structure that serves elements
                            with the highest priorities first
                            before elements with lower priority
        */
        /* this is a normal queue */
        Queue<Double> queue = new LinkedList<>();
        /* adds elements in the queue */
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        /* prints the elements from the queue */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
        PriorityQueueMethod2();
        PriorityQueueMethod3();
        PriorityQueueMethod4();
        PriorityQueueMethod5();
    }

    public static void PriorityQueueMethod2(){
        /* this is priority queue */
        Queue<Double> queue = new PriorityQueue<>();
        /* adds elements in the queue */
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        /* prints the elements from the queue in ascending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
    public static void PriorityQueueMethod3(){
        /* this is priority queue */
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        /* adds elements in the queue */
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        /* prints the elements from the queue in descending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
    public static void PriorityQueueMethod4(){
        /* this is priority queue */
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        /* adds elements in the queue */
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        /* prints the elements from the queue in ascending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
    public static void PriorityQueueMethod5(){
        /* this is priority queue */
        Queue<String> queue = new PriorityQueue<>();
        /* adds elements in the queue */
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        /* prints the elements from the queue in descending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
