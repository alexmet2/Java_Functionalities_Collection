public class DynamicArrayMethod {
    DynamicArrayMethod(){
        /*
            Dynamic Array

            Advantages:
            1. Random access of elements 0(1)
            2. Good locality of reference and data cache utilization
            3. Easy to insert/delete at the end

            Disadvantages:
            1. Wastes more memory
            2. Shifting elements is time consuming 0(n)
            3. Expanding/Skrinking the array is time consuming

        */
        /* if we type new Dynamic_Array(5), the capacity will be 5 */
        Dynamic_Array dynamicArray = new Dynamic_Array();
        /* prints the capacity of the Dynamic Array */
        System.out.println(dynamicArray.capacity);
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        System.out.println();
        DynamicArrayMethod2();
        DynamicArrayMethod3();
        DynamicArrayMethod4();
        DynamicArrayMethod5();
        DynamicArrayMethod6();
        DynamicArrayMethod7();
    }

    public static void DynamicArrayMethod2(){
        Dynamic_Array dynamicArray = new Dynamic_Array();
        /* prints if the Dynamic Array is empty (true) */
        System.out.println("empty: " + dynamicArray.isEmpty());
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* prints if the Dynamic Array is empty (false) */
        System.out.println("empty: " + dynamicArray.isEmpty());
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println();
    }
    public static void DynamicArrayMethod3(){
        Dynamic_Array dynamicArray = new Dynamic_Array();
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        /* inserts X into the index 0 */
        dynamicArray.insert(0, "X");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println();
    }
    public static void DynamicArrayMethod4(){
        Dynamic_Array dynamicArray = new Dynamic_Array();
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        /* inserts X into the index 0 */
        dynamicArray.insert(0, "X");
        /* deletes a specifix element in the Dynamic Array */
        dynamicArray.delete("A");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println();
    }
    public static void DynamicArrayMethod5(){
        Dynamic_Array dynamicArray = new Dynamic_Array();
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        /* inserts X into the index 0 */
        dynamicArray.insert(0, "X");
        /* deletes a specifix element in the Dynamic Array */
        dynamicArray.delete("A");
        /* searches the index of an element in the Dynamic Array */
        System.out.println(dynamicArray.search("C"));
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println();
    }
    public static void DynamicArrayMethod6(){
        /* the capacity of the Dynamic Array is 5 */
        Dynamic_Array dynamicArray = new Dynamic_Array(5);
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        /* adds F as an element in the Dynamic Array */
        dynamicArray.add("F");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println();
    }
    public static void DynamicArrayMethod7(){
        /* the capacity of the Dynamic Array is 5 */
        Dynamic_Array dynamicArray = new Dynamic_Array(5);
        /* add elements in the Dynamic Array */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        /*
            the capacity now is 10, if we delete 3 elements in the Dynamic Array, the capacity will go down to 5 again
        */
        /* deletes elements in the Dynamic Array */
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        /* prints the Dynamic Array */
        System.out.println(dynamicArray);
        /* displays the size of the Dynamic Array */
        System.out.println("size: " + dynamicArray.size);
        /* displays the capacity of the Dynamic Array */
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println();
    }
}