public class BubbleSort1 {
    BubbleSort1(){
    /*
        Bubble Sort = Pairs of adjacent elements are compared, and the elements
                      swapped if they are not in order

                      Quadratic time = O(n^2)
                      small data set = mediocre
                      large data set = bad
    */
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("Without Bubble Sort: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Bubble Sort 2");
        BubbleSort2();
    }

    static void BubbleSort2(){
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println("With Bubble Sort: ");
        bubble_Sort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }
    static void bubble_Sort(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                /* this is for ascending order. If we wanted a descending order, we would write "if(array[j] < array[j+1])" */
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
