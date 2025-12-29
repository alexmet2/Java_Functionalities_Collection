import java.util.Arrays;

public class BinarySearch1 {
    BinarySearch1(){
    /*
        Binary Search = Search algorith that fields the position
                        of a target value within a sorted array
                        Half of the array is eliminated during each "step"

                        runtime complexity: O(log n)
    */
        System.out.println("Integrated Binary Search method");
        int[] array = new int[100];
        int target = 42;
        /* loops through the array */
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        /* calls the integrated Binary Search method */
        int index = Arrays.binarySearch(array, target);
        /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at " + index);
        }
        System.out.println();
        System.out.println("Binary Search 2");
        BinarySearch2();
        System.out.println("Binary Search 3");
        BinarySearch3();
    }
    static void BinarySearch2() {

        System.out.println("Our own method with small number of elements");

        int[] array = new int[100];
        int target = 42;
        /* loops through the array */
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        /* calls our own Binary Search method */
        int index = binarySearch(array, target);
        /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at " + index);
        }
        System.out.println();
    }
    static void BinarySearch3() {

        System.out.println("Our own method with big number of elements");

        int[] array = new int[1000000];
        int target = 777777;
        /* loops through the array */
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        /* calls our own Binary Search method */
        int index = binarySearch(array, target);
        /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
        if(index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at " + index);
        }
    }
    /* Our own Binary Search method */
    static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle: " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; /* target is found */
        }
        return -1; /* target is not found */
    }
}
