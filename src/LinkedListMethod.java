import java.util.LinkedList;

public class LinkedListMethod {
    LinkedListMethod(){
        /*
            LinkedList = stores Nodes in 2 parts (data + address)
                         Nodes are in non-consecutive memory locations
                         Elements are linked using pointers

                                                  Singly Linked List
                              Node                       Node                        Node
                        [data | address]    -->     [data | address]    -->     [data | address]

                                                  Doubly Linked List
                                   Node                                        Node
                        [address | data | address]        <-->        [address | data | address]

                    advantages?
                    1. Dynamic Data Structures (allocates needed memory while running)
                    2. Insertion and Deletion of Nodes is easy 0(1)
                    3. No/Low memory waste

                    disadvantages?
                    1. Greater memory usage (additional pointer)
                    2. No random access of elements (no index[i])
                    3. Accessing/searching elements is more time consuming 0(n)

                    uses?
                    1. implements Stacks/Queues
                    2. GPS navigation
                    3. music playlist
        */
        LinkedList<String> linkedList = new LinkedList<String>();
        /* adds elements in LinkedList (as a stack) */
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        /* prints elements in LinkedList */
        System.out.println(linkedList);
        /* deletes F from the LinkedList (as a stack) */
        linkedList.pop();
        System.out.println(linkedList);
        System.out.println();
        LinkedListMethod2();
        LinkedListMethod3();
    }

    public static void LinkedListMethod2(){
        LinkedList<String> linkedList = new LinkedList<String>();
        /* adds elements in LinkedList (as a queue) */
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        /* prints elements in LinkedList */
        System.out.println(linkedList);
        /* deletes A from the LinkedList (as a queue) */
        linkedList.poll();
        System.out.println(linkedList);
        System.out.println();
    }
    public static void LinkedListMethod3(){
        LinkedList<String> linkedList = new LinkedList<String>();
        /* adds elements in LinkedList (as a queue) */
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        /* adds E in index 4 */
        linkedList.add(4,"E");
        System.out.println(linkedList);
        /* deletes E */
        linkedList.remove("E");
        System.out.println(linkedList);
        /* prints index of a specifix element */
        System.out.println(linkedList.indexOf("F"));
        /* prints the first element in LinkedList */
        System.out.println(linkedList.peekFirst());
        /* prints the last element in LinkedList */
        System.out.println(linkedList.peekLast());
        /* adds element in the start of the LinkedList */
        linkedList.addFirst("0");
        System.out.println(linkedList);
        /* adds element in the end of the LinkedList */
        linkedList.addLast("G");
        System.out.println(linkedList);
        /* removes first element in the LinkedList (you can assign it to a variable) */
        String first = linkedList.removeFirst();
        System.out.println(first);
        /* removes last element in the LinkedList (you can assign it to a variable) */
        String last = linkedList.removeLast();
        System.out.println(last);
    }
}
