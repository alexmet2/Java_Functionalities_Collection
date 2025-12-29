public class SelectionSort1 {
    SelectionSort1(){
    /*
        Selection Sort = search through an array and keep track of the minimum value during
                         each iteration. At the end of each iteration, we swap variables.

                         Quadratic time = 0(n^2)
                         small data set = okay
                         large data set = BAD
    */
        System.out.println("Before sort: ");
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        /* iterates through the array */
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Selection Sort 2");
        SelectionSort2();
        System.out.println("Selection Sort 3");
        SelectionSort3();
    }

    static void SelectionSort2(){
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        /* call the method selectionSort (ascending) */
        selectionSortAscending(array);
        System.out.println("After sort (ascending): ");
        /* iterates through the array */
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void SelectionSort3(){
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        /* call the method selectionSort (descending) */
        selectionSortDescending(array);
        System.out.println("After sort (descending): ");
        /* iterates through the array */
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    static void selectionSortAscending(int[] array) {

        for(int i = 0; i < array.length - 1 ; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    static void selectionSortDescending(int[] array) {

        for(int i = 0; i < array.length - 1 ; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] < array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
