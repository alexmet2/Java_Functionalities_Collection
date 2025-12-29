public class MergeSort1 {
    MergeSort1(){
    /*
        Merge Sort = Recursively divide array in 2, sort, re-combine
                     Run-time complexity = (n log n)
                     Space complexity = 0(n)
    */
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        System.out.println("Without sort: ");
        /* iterates through the array */
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Merge Sort 2");
        MergeSort2();
    }

    static void MergeSort2(){
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        System.out.println("With sort: ");
        /* calls the mergeSort method */
        mergeSort(array);
        /* iterates through the array */
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    static void mergeSort(int[] array){

        int length = array.length;
        if (length <= 1) return; /* base case */

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; /* for left array */
        int j = 0; /* for right array */

        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    static void merge(int[] leftArray, int[] rightArray, int[] array){

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        /* indices */
        int i = 0; /* for the original array used to keep track of the position */
        int l = 0; /* for leftArray */
        int r = 0; /* for rightArray */

        /* check the conditions for merging */
        while(l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
