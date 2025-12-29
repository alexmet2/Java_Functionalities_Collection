public class InsertionSort1 {
    InsertionSort1(){
        /*
            Insertion Sort = after comparing elements to the left
                             shift elements to the right to make room to insert a value

                             Quadratic time = O(n^2)
                             small data set = decent
                             large data set = BAD

                             Fewer steps than Bubble Sort
                             Best case is O(n) compared to Selection Sort
        */
        System.out.println("Without sort: ");
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        /* iterates through array */
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("InsertionSort 2");
        InsertionSort2();
    }

    static void InsertionSort2(){
        System.out.println("With sort: ");
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        /* calls method InsertionSorts */
        InsertionSorts(array);
        /* iterates through array */
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    static void InsertionSorts(int[] array) {

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }
}
