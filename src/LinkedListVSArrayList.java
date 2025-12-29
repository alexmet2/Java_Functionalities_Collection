import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVSArrayList {
    LinkedListVSArrayList(){
        /*
            There is a difference in speed between a LinkedList and an ArrayList
        */
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
        /* calls method main2 */
        LinkedListVSArrayList2();
        LinkedListVSArrayList3();
        LinkedListVSArrayList4();
        LinkedListVSArrayList5();
        LinkedListVSArrayList6();
        LinkedListVSArrayList7();
    }

    public static void LinkedListVSArrayList2(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        /* we will make a linkedList do an operation so we can see the difference in the nanoseconds */
        linkedList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        /* we will make a ArrayList do an operation so we can see the difference in the nanoseconds */
        arrayList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
    }
    public static void LinkedListVSArrayList3(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        /* we will make a linkedList do an operation so we can see the difference in the nanoseconds */
        linkedList.get(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        /* we will make a ArrayList do an operation so we can see the difference in the nanoseconds */
        arrayList.get(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
    }
    public static void LinkedListVSArrayList4(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        /* we will make a linkedList do an operation so we can see the difference in the nanoseconds */
        linkedList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        /* we will make a ArrayList do an operation so we can see the difference in the nanoseconds */
        arrayList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
    }
    public static void LinkedListVSArrayList5(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        /* we will make a LinkedList do an operation so we can see the difference in the nanoseconds */
        linkedList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        /* we will make a ArrayList do an operation so we can see the difference in the nanoseconds */
        arrayList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
    }
    /*
    In this example where we delete an element from a LinkedList and an ArrayList, we can see that the ArrayList is slower because all the
    elements of the ArrayList must be shifted to the left after the removal of the element
    */
    public static void LinkedListVSArrayList6(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        /* we will make a LinkedList do an operation so we can see the difference in the nanoseconds */
        linkedList.remove(50000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        /* we will make a ArrayList do an operation so we can see the difference in the nanoseconds */
        arrayList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
    }
    public static void LinkedListVSArrayList7(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        /* adds values in the linkedList and the ArrayList */
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        /* time record for LinkedList */
        startTime = System.nanoTime();
        /* we will make a LinkedList do an operation so we can see the difference in the nanoseconds */
        linkedList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        /* time record for ArrayList */
        startTime = System.nanoTime();
        /* we will make a ArrayList do an operation so we can see the difference in the nanoseconds */
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        /* prints the nanoseconds for the operation */
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
        System.out.println();
    }

}
