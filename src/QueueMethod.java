import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueMethod {
    QueueMethod(){
        /*
            Queue = FIFO data structure, First-In First-Out
            A collection designed for holding elements prior to processing
            Linear data structure

            add     = enqueue, offer()
            remove  = dequeue, poll()
            element = see,     peek()
        */
        Queue<String> queue = new LinkedList<String>();
        /* check to see if queue is empty */
        System.out.println(queue.isEmpty());
        /* add elements in the queue */
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Bob");
        /* check to see if queue is empty */
        System.out.println(queue.isEmpty());
        /* prints the first element in queue */
        System.out.println(queue.peek());
        /* prints queue in order */
        System.out.println(queue);
        /* dequeues Steve from queue */
        queue.poll();
        System.out.println(queue);
        /* dequeues Chad from queue */
        queue.poll();
        System.out.println(queue);
        /* dequeues Harold from queue */
        queue.poll();
        System.out.println(queue);
        /* dequeues Bob from queue */
        queue.poll();
        System.out.println(queue);
        /* this will not throw an exception */
        queue.poll();
        System.out.println(queue);
        /* if the queue is empty, the element() will throw an exception(NoSuchElementException) */
        try {
            queue.element();
        } catch (NoSuchElementException e) {
            System.out.println("Exception of queue.element()");
        }
        System.out.println();
        QueueMethod2();
        QueueMethod3();
    }

    public static void QueueMethod2(){
        Queue<String> queue = new LinkedList<String>();
        /* check to see if queue is empty */
        System.out.println(queue.isEmpty());
        /* add elements in the queue */
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Bob");
        /* prints the size of the queue */
        System.out.println(queue.size());
        System.out.println();
    }
    public static void QueueMethod3(){
        Queue<String> queue = new LinkedList<String>();
        /* check to see if queue is empty */
        System.out.println(queue.isEmpty());
        /* add elements in the queue */
        queue.offer("Steve");
        queue.offer("Chad");
        queue.offer("Harold");
        queue.offer("Bob");
        /* checks if Bob is in the queue */
        System.out.println(queue.contains("Bob"));
        /* checks if Chad is in the queue */
        System.out.println(queue.contains("Chad"));
        /* checks if CHAD is in the queue */
        System.out.println(queue.contains("CHAD"));
    }
}

/*
    Where are queues used:

    1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
    2. Printer Queue (Print jobs should be completed in order)
    3. Used in LinkedLists, PriorityQueues, Breadth-first search
*/